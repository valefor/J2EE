package org.alc.web.filter;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alc.web.ui.window.InputMessageWin;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

//import com.octo.captcha.service.CaptchaService;
//import com.octo.captcha.service.CaptchaServiceException;

public class JCaptchaFilter implements Filter {

	private String filterProcessesUrl;
//	private CaptchaService captchaService = null ;
	
	private static final Logger logger = Logger.getLogger(JCaptchaFilter.class);
	
	@Override
	public void destroy() {
		// nothing todo

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;  
        HttpServletResponse res = (HttpServletResponse) response;
        String servletPath = req.getServletPath();
        logger.info("servletPath:" + servletPath);
        
        if (servletPath.endsWith(filterProcessesUrl)) {
        	logger.info("filterProcessesUrl:" + filterProcessesUrl);
        	generateCaptchaImage(req,res);
        }
        else {
        	filterChain.doFilter(request, response);
        }

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// nothing todo
	}

	public String getFilterProcessesUrl() {
		return filterProcessesUrl;
	}

	public void setFilterProcessesUrl(String filterProcessesUrl) {
		this.filterProcessesUrl = filterProcessesUrl;
	}
	
	protected void generateCaptchaImage(
			final HttpServletRequest request,
			final HttpServletResponse response) throws IOException {
//		if ( captchaService==null ) {
//			logger.error("No captcha service available!");
//		} else {
//			setDisableCacheHeader(response);  
//	        response.setContentType("image/jpeg");  
//	  
//	        ServletOutputStream out = response.getOutputStream();
//	        try {
//	        	
//	            String captchaId = request.getSession(true).getId();  
//	            BufferedImage challenge = (BufferedImage) captchaService.getChallengeForID(captchaId, request.getLocale());  
//	            ImageIO.write(challenge, "jpg", out);  
//	            out.flush();  
//	        } catch (CaptchaServiceException e) {  
//	            logger.error(e.getMessage(), e);  
//	        } finally {  
//	            out.close();  
//	        } 
//		}
	}
	
	/** 
     * Disable client to cache header. 
     */  
    public static void setDisableCacheHeader(HttpServletResponse response) {  
        //Http 1.0 header  
        response.setDateHeader("Expires", 1L);  
        response.addHeader("Pragma", "no-cache");  
        //Http 1.1 header  
        response.setHeader("Cache-Control", "no-cache, no-store, max-age=0");  
    }

//	public CaptchaService getCaptchaService() {
//		return captchaService;
//	}
//
//	public void setCaptchaService(CaptchaService captchaService) {
//		this.captchaService = captchaService;
//	}

}

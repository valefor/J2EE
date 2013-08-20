package org.alc.sae.ss.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alc.util.HttpUtil;
import org.apache.log4j.Logger;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SaeUsernamePasswordAuthenticationFilter extends
		UsernamePasswordAuthenticationFilter {

	protected final Logger logger = Logger.getLogger(getClass());
	
	public static final String DEFAULT_CAPTCHA_SERVICE_ID = "captchaService";  
    public static final String DEFAULT_CAPTCHA_PARAMTER_NAME = "j_captcha"; 
    
	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter#requiresAuthentication(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * The Sae Customized version
	 */
	@Override
	protected boolean requiresAuthentication(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        int pathParamIndex = uri.indexOf(';');
        
        //HttpUtil.printHttpInfo(this.getClass(), request);
        //System.out.println("[SaeUsernamePasswordAuthenticationFilter](filterUrl):"+getFilterProcessesUrl());
        if (pathParamIndex > 0) {
            // strip everything after the first semi-colon
            uri = uri.substring(0, pathParamIndex);
        }

        if ("".equals(request.getContextPath())) {
            return uri.endsWith(getFilterProcessesUrl());
        }
        
        if (uri.startsWith(request.getContextPath())) {
        	return uri.endsWith(request.getContextPath() + getFilterProcessesUrl());
        } else {
        	return uri.equals(getFilterProcessesUrl());
        }

        //return uri.endsWith(request.getContextPath() + getFilterProcessesUrl());
    }

}

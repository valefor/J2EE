package org.alc.zk;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alc.util.SecurityUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;


public class ZkAccessDeniedHandler implements AccessDeniedHandler {

	private Map<String, Object> _errorPageArgs = new HashMap<String, Object>();
	private String _errorPage;
	
	public void setErrorPage(String url) {
		_errorPage = url;
	}
	
	public String getErrorPage() {
		return _errorPage;
	}
	
	public void setErrorPageArg(String param, Object value) {
		_errorPageArgs.put(param, value);
	}
	
	/**
	 * Remove the specified error template parameter.
	 * @param param the error template parameter to be removed.
	 */
	public void removeErrorPageArg(String param) {
		_errorPageArgs.remove(param);
	}
	
	/**
	 * Sets the error template window arguments Map.
	 * @param map the error template window arguments Map.
	 */
	public void setErrorPageArgs(Map<String, Object> map) {
		_errorPageArgs = map;
	}
	
	/**
	 * Return the error template window arguments Map.
	 * @return the error template window arguments Map.
	 */
	public Map<String, Object> getErrorPageArgs() {
		return _errorPageArgs;
	}
	
	@Override
	public void handle(HttpServletRequest request,
			HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException,
			ServletException {
		// Put exception into request scope (perhaps of use to a view)
        ((HttpServletRequest) request).setAttribute(WebAttributes.ACCESS_DENIED_403,
            accessDeniedException);

    	final String url = getErrorPage();
		final Map<String, Object> args = new HashMap<String, Object>(getErrorPageArgs());
		
	    // Put exception into argument and session (perhaps of use to a view)
	    args.put(WebAttributes.ACCESS_DENIED_403, accessDeniedException);
	    args.put("REDIRECT_URL",Labels.getLabel("links.uri.index"));
		

	    System.out.println(args);
	    System.out.println(url);
	    System.out.println(Labels.getLabel("links.url.error.accessDenied"));
		if(null == SecurityUtil.getUser()) {
			Executions.getCurrent().sendRedirect(Labels.getLabel("links.uri.login"));
		} else {
			Executions.getCurrent().createComponents("/WEB-INF/errors/viewer/accessDenied.zul", null, args);
		}

	}

}

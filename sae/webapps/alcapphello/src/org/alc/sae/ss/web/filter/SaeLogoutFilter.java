package org.alc.sae.ss.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.alc.util.HttpUtil;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;

public class SaeLogoutFilter extends LogoutFilter {

	public SaeLogoutFilter(String logoutSuccessUrl, LogoutHandler[] handlers) {
		super(logoutSuccessUrl, handlers);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean requiresLogout(HttpServletRequest request, HttpServletResponse response) {
		String uri = request.getRequestURI();
        int pathParamIndex = uri.indexOf(';');

        //HttpUtil.printHttpInfo(this.getClass(), request);
        //System.out.println("[SaeUsernamePasswordAuthenticationFilter](filterUrl):"+getFilterProcessesUrl());
        
        if (pathParamIndex > 0) {
            // strip everything from the first semi-colon
            uri = uri.substring(0, pathParamIndex);
        }

        int queryParamIndex = uri.indexOf('?');

        if (queryParamIndex > 0) {
            // strip everything from the first question mark
            uri = uri.substring(0, queryParamIndex);
        }

        if ("".equals(request.getContextPath())) {
            return uri.endsWith(getFilterProcessesUrl());
        }

        if (uri.startsWith(request.getContextPath())) {
        	return uri.endsWith(request.getContextPath() + getFilterProcessesUrl());
        } else {
        	return uri.equals(getFilterProcessesUrl());
        }
        
	}
}

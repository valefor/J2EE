package org.alc.sae.ss.web.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SaeUsernamePasswordAuthenticationFilter extends
		UsernamePasswordAuthenticationFilter {

	protected final Logger logger = Logger.getLogger(getClass());
	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter#requiresAuthentication(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * The Sae Customized version
	 */
	@Override
	protected boolean requiresAuthentication(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        int pathParamIndex = uri.indexOf(';');

        {
            logger.error("SaeUsernamePasswordAuthenticationFilter[uri]:"+request.getRequestURI());
            logger.error("SaeUsernamePasswordAuthenticationFilter[contextPath]:"+request.getContextPath());
            logger.error("SaeUsernamePasswordAuthenticationFilter[servletPath]:"+request.getServletPath());
            logger.error("SaeUsernamePasswordAuthenticationFilter[filterUrl]:"+getFilterProcessesUrl());
        }
        
        System.out.println("SaeUsernamePasswordAuthenticationFilter[uri]:"+request.getRequestURI());
        System.out.println("SaeUsernamePasswordAuthenticationFilter[contextPath]:"+request.getContextPath());
        System.out.println("SaeUsernamePasswordAuthenticationFilter[servletPath]:"+request.getServletPath());
        System.out.println("SaeUsernamePasswordAuthenticationFilter[filterUrl]:"+getFilterProcessesUrl());
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
        	return uri.endsWith(getFilterProcessesUrl());
        }

        //return uri.endsWith(request.getContextPath() + getFilterProcessesUrl());
    }

}

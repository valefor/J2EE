package org.alc.sae.ss.web.filter;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.alc.util.HttpUtil;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

public class SaeFilterSecurityInterceptor extends FilterSecurityInterceptor {

	private static final String FILTER_APPLIED = "__sae__spring_security_filterSecurityInterceptor_filterApplied";
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
		System.out.println("SaeFilterSecurityInterceptor:doFilter");
		HttpUtil.printHttpInfo(this.getClass(), (HttpServletRequest)request);
		
		FilterInvocation fi = new FilterInvocation(request, response, chain);
		printFiInfo(fi);
        invoke(fi);
    }
	
	public void invoke(FilterInvocation fi) throws IOException, ServletException {
        if ((fi.getRequest() != null) && (fi.getRequest().getAttribute(FILTER_APPLIED) != null)
                && isObserveOncePerRequest()) {
            // filter already applied to this request and user wants us to observe
            // once-per-request handling, so don't re-do security checking
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
        } else {
            // first time this request being called, so perform security checking
            if (fi.getRequest() != null) {
                fi.getRequest().setAttribute(FILTER_APPLIED, Boolean.TRUE);
            }

            InterceptorStatusToken token = super.beforeInvocation(fi);

            try {
                fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
            } finally {
                super.finallyInvocation(token);
            }

            super.afterInvocation(token, null);
        }
    }
	
	private void printFiInfo(Object object) {
		Collection<ConfigAttribute> attributes = this.obtainSecurityMetadataSource().getAttributes(object);
		System.out.println("["+getClass().getName()+"]Secure object: " + object + "; Attributes: " + attributes);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if (null != authentication) {
			System.out.println("["+getClass().getName()+"]AuthenticationInfo: " + authentication);
			System.out.println("["+getClass().getName()+"]Authorities: " + authentication.getAuthorities());
		}
		
	}
}

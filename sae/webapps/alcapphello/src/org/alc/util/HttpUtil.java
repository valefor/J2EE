package org.alc.util;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {

	public static void printHttpInfo(Class<?> clazz,HttpServletRequest request) {
		System.out.println("["+ clazz.getName()+"](uri):"+request.getRequestURI());
		System.out.println("["+ clazz.getName()+"](contextPath):"+request.getContextPath());
		System.out.println("["+ clazz.getName()+"](servletPath):"+request.getServletPath());
		System.out.println("["+ clazz.getName()+"](url):"+request.getRequestURL());
	}
}

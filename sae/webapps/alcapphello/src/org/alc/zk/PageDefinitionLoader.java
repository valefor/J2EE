package org.alc.zk;

import java.io.File;
import java.net.URL;

import org.zkoss.util.resource.Locator;
import org.zkoss.web.util.resource.ResourceLoader;
import org.zkoss.web.util.resource.ServletContextLocator;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.metainfo.PageDefinition;
import org.zkoss.zk.ui.metainfo.Parser;

public class PageDefinitionLoader extends ResourceLoader<PageDefinition> {

	private WebApp _wapp;
	public PageDefinitionLoader(WebApp wapp) {
		_wapp = wapp;
	}

	public PageDefinitionLoader  init(WebApp wapp) {
		_wapp = wapp;
		return this;
	}
	
	//-- super --//
	@Override
	protected PageDefinition parse(String path, File file, Object extra)
	throws Exception {
		final Locator locator =
			extra != null ? (Locator)extra: getLocator(_wapp, path);
		PageDefinition pd = new Parser(_wapp, locator).parse(file, path);
		System.out.println("file pd" + pd);
		return pd;
	}
	@Override
	protected PageDefinition parse(String path, URL url, Object extra)
	throws Exception {
		final Locator locator =
			extra != null ? (Locator)extra: getLocator(_wapp, path);
		PageDefinition pd = new Parser(_wapp, locator).parse(url, path);
		System.out.println("url pd"+pd);
		return pd;
	}

	public static final Locator getLocator(WebApp wapp, String path) {
		if (wapp == null) throw new IllegalArgumentException("null");
	
		if (path != null && path.length() > 0 && path.charAt(0) == '/') {
			final int j = path.lastIndexOf('/');
			path = j > 0 ? path.substring(0, j + 1): "/";
		} else {
			final Execution exec = Executions.getCurrent();
			if (exec != null) path = exec.getDesktop().getCurrentDirectory();
		}
		return new ServletContextLocator(wapp.getServletContext(), path);
	}
}

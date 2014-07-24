package org.alc.zk;

import java.net.URL;
import java.util.Locale;

import javax.servlet.ServletContext;

import org.zkoss.util.resource.LabelLocator;

public class AppLabelLocator implements LabelLocator {

	private ServletContext _svlctx;
    private String _name;
    
    public AppLabelLocator(ServletContext svlctx, String name) {
        _svlctx = svlctx;
        _name = name;
    }
    
	@Override
	public URL locate(Locale locale) throws Exception {
		if ( _name.equals("APP_LABEL_LINK"))
		return _svlctx.getResource("/WEB-INF/labels/links.properties");
		if ( _name.equals("APP_LABEL_CLASS"))
		return _svlctx.getResource("/WEB-INF/labels/classes.properties");
		return null;
	}
	
	
}

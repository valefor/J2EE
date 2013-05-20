package org.alc.composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.alc.services.SidebarPage;
import org.alc.services.SidebarPageConfig;
import org.zkoss.util.resource.Labels;

public class SidebarPageConfigImpl implements SidebarPageConfig {

	HashMap<String,SidebarPage> pageMap = new HashMap<String,SidebarPage>();
	
	public SidebarPageConfigImpl() {
//		pageMap.put("reg", new SidebarPage("fn1","New User Registration","","/registration.zul"));
		pageMap.put("hello", new SidebarPage("fn1",Labels.getLabel("app.welcome"),"","/hello.zul"));
		pageMap.put("reg", new SidebarPage("fn2",Labels.getLabel("app.registration"),"","/registration.zul"));
	}

	@Override
	public List<SidebarPage> getPages() {
		// TODO Auto-generated method stub
		return new ArrayList( pageMap.values());
	}

	@Override
	public SidebarPage getPage(String name) {
		// TODO Auto-generated method stub
		return pageMap.get(name);
	}

}

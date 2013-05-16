package org.alc.hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.alc.services.SidebarPage;
import org.alc.services.SidebarPageConfig;

public class SidebarPageConfigImpl implements SidebarPageConfig {

	HashMap<String,SidebarPage> pageMap = new HashMap<String,SidebarPage>();
	
	public SidebarPageConfigImpl() {
		pageMap.put("reg", new SidebarPage("fn1","New User Registration","","/registration.zul"));
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

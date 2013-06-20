package org.alc.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.alc.services.SidebarPage;
import org.alc.services.SidebarPageConfig;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.zkoss.util.resource.Labels;

@Service("sidebarPageConfig")
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class SidebarPageConfigImpl implements SidebarPageConfig {

	HashMap<String,SidebarPage> pageMap = new HashMap<String,SidebarPage>();
	
	public SidebarPageConfigImpl() {
		pageMap.put("hello", new SidebarPage("fn1",Labels.getLabel("app.welcome"),"",Labels.getLabel("links.uri.index")));
		pageMap.put("user", new SidebarPage("fn2",Labels.getLabel("app.userList"),"",Labels.getLabel("links.uri.mgmt.users")));
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

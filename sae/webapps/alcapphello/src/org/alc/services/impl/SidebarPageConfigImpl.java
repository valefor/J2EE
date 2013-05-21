package org.alc.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//		pageMap.put("reg", new SidebarPage("fn1","New User Registration","","/registration.zul"));
		pageMap.put("hello", new SidebarPage("fn1",Labels.getLabel("app.welcome"),"","/hello.zul"));
		pageMap.put("reg", new SidebarPage("fn2",Labels.getLabel("app.registration"),"","/registration.zul"));
		pageMap.put("user", new SidebarPage("fn3",Labels.getLabel("app.userList"),"","/users.zul"));
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

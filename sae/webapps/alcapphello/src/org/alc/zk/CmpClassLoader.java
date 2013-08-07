package org.alc.zk;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.zkoss.util.resource.Labels;

@Scope("singleton")
@Service("cmpClassLoader")
public class CmpClassLoader {
	
	public CmpClassLoader() {
		super();
		initClassMap();
	}

	private Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
	
	public Map<String, Class<?>> getClassMap() {
		return classMap;
	}

	public void setClassMap(Map<String, Class<?>> classMap) {
		this.classMap = classMap;
	}

	public Class<?> load(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void initClassMap() {
//		System.out.println("Init class map~");
//		Map<String,Object> labels = Labels.getSegmentedLabels();
//		classMap.put("classes.ctrl.logout", load("org.alc.controller.LogoutController") );
//		classMap.put("classes.ctrl.register", load("org.alc.controller.RegistrationController") );
//		classMap.put("classes.ctrl.sidebar", load("org.alc.controller.SidebarController") );
//		classMap.put("classes.vm.users", load("org.alc.viewModel.UserViewModel") );
//		System.out.println("seg labels:" + labels.toString());
//		//for (Labels.getSegmentedLabels())
	}

}

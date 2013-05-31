package org.alc.controller;

import org.alc.util.SecurityUtil;
import org.alc.util.ZkEventHandlerUtil;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class LogoutController extends SelectorComposer<Component> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	Hbox statusBar;	
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	
		System.out.println("Test for logs!");
		if (SecurityUtil.isAnonymous()) {
			Label register = new Label();
			Label login = new Label();
			
			register.setValue(Labels.getLabel("app.register"));
			register.setSclass("logout");
			login.setValue(Labels.getLabel("app.login"));			
			login.setSclass("logout");

			register.addEventListener(Events.ON_CLICK, 
	        		ZkEventHandlerUtil.createRedirectActionListener("/public/registration.zul"));
	        login.addEventListener(Events.ON_CLICK, 
	        		ZkEventHandlerUtil.createRedirectActionListener("/public/login.zul"));
			
			statusBar.appendChild(register);
			statusBar.appendChild(login);
		} else {
			String name = SecurityUtil.getUser().getUsername();
			if (name != null) {
				Label username = new Label();
				Label logout = new Label();
				username.setValue(SecurityUtil.getUser().getUsername());
				
				logout.setValue(Labels.getLabel("app.logout"));
				logout.setSclass("logout");							
		        logout.addEventListener(Events.ON_CLICK, 
		        		ZkEventHandlerUtil.createRedirectActionListener("/j_spring_security_logout"));
		        
		        statusBar.appendChild(username);
		        statusBar.appendChild(logout);
			} else {
				System.out.println("username null!");
			}									
		}
	}
	

}

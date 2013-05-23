package org.alc.controller;

import org.alc.util.SecurityUtil;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.SerializableEventListener;
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
	
	Label anonymous = new Label();
	Label username = new Label();
	Label logout = new Label();
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	
		if (SecurityUtil.isAnonymous()) {
			Label anonymous = new Label();
			anonymous.setValue("Anonymous");
			statusBar.appendChild(anonymous);
		} else {
			String name = SecurityUtil.getUser().getUsername();
			if (name != null) {
				username.setValue(SecurityUtil.getUser().getUsername());
				
				logout.setValue("Logout");
				logout.setSclass("logout");							
				EventListener<Event> onActionListener = new SerializableEventListener<Event>(){
		            private static final long serialVersionUID = 1L;
		 
		            public void onEvent(Event event) throws Exception {
		                //redirect current url to logout
		            	Executions.getCurrent().sendRedirect("/j_spring_security_logout");
		            }
		        };
		        logout.addEventListener(Events.ON_CLICK, onActionListener);
		        
		        statusBar.appendChild(username);
		        statusBar.appendChild(logout);
			} else {
				System.out.println("username null!");
			}									
		}
	}
	

}

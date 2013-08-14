package org.alc.controller;

import org.alc.util.SecurityUtil;
import org.alc.util.ZkEventHandlerUtil;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Toolbarbutton;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class BannerController extends SelectorComposer<Component> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	Hbox statusBar;	
	
	private Label register;
	private Label login;
	private Label username;
	private Label logout;
	
	private Toolbarbutton btnOpenMsg;
	private Toolbarbutton btnSendMsg;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	
		System.out.println("Test for logs!");
		if (SecurityUtil.isAnonymous()) {
			register = new Label();
			login = new Label();
			
			register.setValue(Labels.getLabel("app.register"));
			register.setSclass("logout");
			login.setValue(Labels.getLabel("app.login"));			
			login.setSclass("logout");

			register.addEventListener(Events.ON_CLICK, 
	        		ZkEventHandlerUtil.createRedirectActionListener(Labels.getLabel("links.uri.register")));
	        login.addEventListener(Events.ON_CLICK, 
	        		ZkEventHandlerUtil.createRedirectActionListener(Labels.getLabel("links.uri.login")));
			
			statusBar.appendChild(register);
			statusBar.appendChild(login);
		} else {
			String name = SecurityUtil.getUser().getUsername();
			if (name != null) {
				
				addMessageBar(statusBar);
				
				username = new Label();
				logout = new Label();
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
	
	private void addMessageBar(Component comp) {
		btnOpenMsg = new Toolbarbutton();
		btnOpenMsg.setWidth("20px");
		btnOpenMsg.setHeight("20px");
		btnOpenMsg.setImage("/images/icons/tBtnOpenMsg_2_16x16.gif");
		btnOpenMsg.setTooltiptext(Labels.getLabel("common.Message.Open"));
		btnOpenMsg.setParent(comp);
		
		logout.addEventListener(Events.ON_CLICK, new EventListener<Event>() {

			@Override
			public void onEvent(Event event) throws Exception {
				// TODO Auto-generated method stub
				
			}
			
			
		});
	}
	

}

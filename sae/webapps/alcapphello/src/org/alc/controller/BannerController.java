package org.alc.controller;

import org.alc.util.SecurityUtil;
import org.alc.util.ZkEventHandlerUtil;
import org.alc.webui.window.InputMessageWin;
import org.springframework.util.StringUtils;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Toolbarbutton;
import org.zkoss.zul.Window;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class BannerController extends SelectorComposer<Component> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	Hbox statusBar;
	
	@Wire
	Window messageBar;
	
	private Label register;
	private Label login;
	private Label username;
	private Label logout;
	
	private Toolbarbutton btnOpenMsg;
	private Toolbarbutton btnSendMsg;
	
	private Window msgWindow = null;
	private StringBuffer msg = new StringBuffer();


	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	
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
			
			subscribeToMessageQ(name);
			
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
	
	private void subscribeToMessageQ(String name) {

		EventQueues.lookup("quickMessageEQ", EventQueues.APPLICATION, true).subscribe(new EventListener<Event>() {

			@Override
			public void onEvent(Event event) throws Exception {
				final String msg = (String) event.getData();
				if ( StringUtils.isEmpty(msg) ) return;
				
				setMsg(msg);
				
				if ( msgWindow == null) {
					btnOpenMsg.setImage("/images/icons/tBtnIncomingMsg_16x16.gif");
				} else {
					((Textbox)getMsgWindow().getFellow("textbox")).setValue(getMsg());
				}
			}
			
		});
		
	}

	private void addMessageBar(Component comp) {
		// open message button
		btnOpenMsg = new Toolbarbutton();
		btnOpenMsg.setWidth("20px");
		btnOpenMsg.setHeight("20px");
		btnOpenMsg.setImage("/images/icons/tBtnOpenMsg_16x16.gif");
		btnOpenMsg.setTooltiptext(Labels.getLabel("app.message.open"));
		btnOpenMsg.setParent(comp);
		
		btnOpenMsg.addEventListener(Events.ON_CLICK, new EventListener<Event>() {

			@Override
			public void onEvent(Event event) throws Exception {
				// Reset to normal image
				System.out.println("Reset image");
				btnOpenMsg.setImage("/images/icons/tBtnOpenMsg_16x16.gif");
				// Open message window
				Window win = getMsgWindow();
				Textbox t = (Textbox)win.getFellow("textbox");
				t.setText(getMsg());
			}			
			
		});
		
		// open message button
		btnSendMsg = new Toolbarbutton();
		btnSendMsg.setWidth("20px");
		btnSendMsg.setHeight("20px");
		btnSendMsg.setImage("/images/icons/tBtnSendMsg_16x16.gif");
		btnSendMsg.setTooltiptext(Labels.getLabel("app.message.send"));
		btnSendMsg.setParent(comp);
		
		btnSendMsg.addEventListener(Events.ON_CLICK, new EventListener<Event>() {

			@Override
			public void onEvent(Event event) throws Exception {
				// Open input box
//				Window win = Path.getComponent(path);
//				Textbox t = (Textbox)win.getFellow("textbox");
				final String str = InputMessageWin.show(messageBar);			
			}			
			
		});
	}
	
	
	public Window getMsgWindow() {
		if (msgWindow == null) {
			System.out.println("Initialze message window");
			msgWindow = new Window();
			msgWindow.setId("msgWindow");
			msgWindow.setTitle(Labels.getLabel("app.message.win.title"));
			msgWindow.setSizable(true);
			msgWindow.setClosable(true);
			msgWindow.setWidth("400px");
			msgWindow.setHeight("200px");
			msgWindow.setParent(messageBar);			
			msgWindow.addEventListener(Events.ON_CLOSE, new EventListener<Event>() {

				@Override
				public void onEvent(Event event) throws Exception {
					msgWindow.detach();
					msgWindow = null;
					
				}
				
			});
			msgWindow.setPosition("center, center");
			
			Textbox textbox = new Textbox();
			textbox.setId("textbox");
			textbox.setMultiline(true);
			textbox.setRows(10);
			textbox.setReadonly(true);
			textbox.setHeight("100%");
			textbox.setWidth("95%");
			textbox.setParent(msgWindow);
			
			msgWindow.doOverlapped();
		}
		
		return msgWindow;
	}

	public void setMsgWindow(Window msgWindow) {
		this.msgWindow = msgWindow;
	}

	public String getMsg() {
		return msg.toString();
	}

	public void setMsg(String msg) {
		this.msg = this.msg.append("\n"+msg);
	}

}

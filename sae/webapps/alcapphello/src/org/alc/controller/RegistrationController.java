package org.alc.controller;

import org.alc.dao.impl.UserDao;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Timer;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class RegistrationController extends SelectorComposer<Component> {
	
	private static final long serialVersionUID = 502281000000L;

	@WireVariable
	private UserDao userDao;
	
	@Wire("#nameBox")
	private Textbox userName;
	
	@Wire("#pwdBox")
	private Textbox password;
	
	@Wire("#cfmPwdBox")
	private Textbox cfmPassword;
	
	@Wire("#emailBox")
	private Textbox email;
	
	@Wire
	private Button submitButton;
	
/*	@Override
	public void doBeforeComposeChildren(Component comp) throws Exception {
		if (!SecurityUtil.isAnonymous()) {
			Messagebox.show("You are a login user, can not do registration for another new account!", 
					"Warning", new Messagebox.Button[] {Messagebox.Button.OK}, 
					Messagebox.ERROR, ZkEventHandlerUtil.createMessageBoxActionListener("/",""));
		}
		if (!SecurityUtil.isAnonymous()) {
			Executions.getCurrent().sendRedirect("/");
		}
	}
	
	@Override
	public ComponentInfo doBeforeCompose(Page page, Component parent,
	ComponentInfo compInfo) {
		if (!SecurityUtil.isAnonymous()) {
			Executions.getCurrent().sendRedirect("/");
		}
		return super.doBeforeCompose(page, parent, compInfo);
	}*/
	
	private boolean isValidReq() {
		if ( !userName.getText().trim().isEmpty() && 
			userDao.isUserExist(userName.getText()) && 
			!password.getValue().equals(cfmPassword.getValue())) 
			return false;
		
		return true;
	}
	
	@Listen("onBlur = #nameBox")
	public void userNameCheck() {
		if (!userName.getText().trim().isEmpty()) {
			if ( userDao.isUserExist(userName.getText()) ) {
				System.out.println(userName.getText());
				submitButton.setDisabled(true);
				throw new WrongValueException(userName,Labels.getLabel("err.userAlreadyExist"));
			} else {
				submitButton.setDisabled(false);
				userName.clearErrorMessage();
			}
		}
	}
	
	/*
	@Listen("onBlur = #cfmPwdBox")
	public void confirmPassword() {
		cfmPassword.clearErrorMessage();
		if ( !cfmPassword.getText().equals(password.getText()) ) {
			System.out.println(cfmPassword.getText());
			System.out.println(password.getText());
			throw new WrongValueException(cfmPassword,Labels.getLabel("err.passwordMismatch"));
		}
	}
	*/
	
	@Listen("onClick = #submitButton")
	public void submit() {
		System.out.println("Submitting...");
	}
}

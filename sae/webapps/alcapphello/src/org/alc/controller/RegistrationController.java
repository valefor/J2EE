package org.alc.controller;

import org.alc.dao.UserDao;
import org.alc.util.SecurityUtil;
import org.alc.util.ZkEventHandlerUtil;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.metainfo.ComponentInfo;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

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
	
	@Wire
	private Button submitButton;
	@Wire
	private Checkbox acceptTermBox;
	
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
	
	@Listen("onCheck = #acceptTermBox")
	public void changeSubmitStatus(){
		if (acceptTermBox.isChecked()) {
			submitButton.setDisabled(false);
			submitButton.setImage("/images/Allow.png");
		} else {
			submitButton.setDisabled(true);
			submitButton.setImage("");
		}
	}
	
	@Listen("onBlur = #nameBox")
	public void userNameCheck() {
		userName.clearErrorMessage();
		if ( !userName.getText().trim().isEmpty() && userDao.isUserExist(userName.getText()) ) {
			System.out.println(userName.getText());
			throw new WrongValueException(userName,Labels.getLabel("err.userAlreadyExist"));
		}
	}
	
	@Listen("onBlur = #cfmPwdBox")
	public void confirmPassword() {
		cfmPassword.clearErrorMessage();
		if ( !cfmPassword.getText().equals(password.getText()) ) {
			System.out.println(cfmPassword.getText());
			System.out.println(password.getText());
			throw new WrongValueException(cfmPassword,Labels.getLabel("err.passwordMismatch"));
		}
	}
	
	@Listen("onClick = #submitButton")
	public void submit() {
		
	}
}

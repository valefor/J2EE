package org.alc.composer;

import org.alc.dao.UserDao;
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

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class RegistrationComposer extends SelectorComposer<Component> {
	
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
		if ( userDao.isUserExist(userName.getText()) ) {
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
}

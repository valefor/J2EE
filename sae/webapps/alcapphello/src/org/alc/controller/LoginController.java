package org.alc.controller;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Captcha;
import org.zkoss.zul.Textbox;

public class LoginController extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire("#captcha")
	private Captcha captcha;
	
	@Wire("#captchaText")
	private Textbox captchaText;
	
	@Wire("#submit")
	private Button submit;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	@Listen("onBlur = #captchaText")
	public void validateCaptcha(){
		System.out.println(captchaText.getText());
		System.out.println(captcha.getValue());
		if (captcha.getValue().equalsIgnoreCase(captchaText.getText())) {
			submit.setDisabled(false);
		} else {
			submit.setDisabled(true);
			throw new WrongValueException(captchaText,Labels.getLabel("err.invalidCaptcha"));			
		}
	}
	
	@Listen("onClick = #captcha")
	public void reCaptcha() {
		captcha.randomValue();
	}
	
}

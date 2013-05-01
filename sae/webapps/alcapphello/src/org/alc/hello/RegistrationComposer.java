package org.alc.hello;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;

public class RegistrationComposer extends SelectorComposer<Component> {
	
	private static final long serialVersionUID = 502281000000L;

	@Wire
	private Button submitButton;
	@Wire
	private Checkbox acceptTermBox;
	
	@Listen("onCheck = #acceptTermBox")
	public void changeSubmitStatus(){
		if(acceptTermBox.isChecked()){
			submitButton.setDisabled(false);
			submitButton.setImage("/images/Allow.png");
		}else{
			submitButton.setDisabled(true);
			submitButton.setImage("");
		}
	}
}

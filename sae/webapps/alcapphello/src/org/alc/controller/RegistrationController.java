package org.alc.controller;

import java.util.HashSet;
import java.util.Set;

import org.alc.dao.impl.UserDao;
import org.alc.entity.Authority;
import org.alc.entity.User;
import org.alc.zk.component.TimedJump;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Button;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class RegistrationController extends SelectorComposer<Component> {
	
	private static final long serialVersionUID = 502281000000L;

	@WireVariable
	private UserDao userDao;
	
	@WireVariable
	private MessageDigestPasswordEncoder passwordEncoder;
	
	@Wire("#regWin")
	private Window regWin;
	
	@Wire("#nameBox")
	private Textbox userName;
	
	@Wire("#pwdBox")
	private Textbox password;
	
	@Wire("#cfmPwdBox")
	private Textbox cfmPassword;
	
	@Wire("#emailBox")
	private Textbox email;
	
	@Wire("#birthdayBox")
	private Datebox birthday;
	
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
	
	@Listen("onClick = #submitButton")
	public void submit() {
		System.out.println("Submitting...");
		if (!isValidReq()) {
			throw new WrongValueException("Invalid register info");
		} else {
			User user = new User();
			Set<Authority> authorities = new HashSet<Authority>();
			Authority authority = new Authority();
			authority.setRole("ROLE_USER");
			authorities.add(authority);
			user.setName(userName.getValue());
			user.setPassword(passwordEncoder.encodePassword(password.getValue(), userName.getValue()));
			user.setAuthorities(authorities);
			user.setEmail(email.getValue());
			user.setBirthday(birthday.getValue());
			userDao.persist(user);
			
			System.out.println(">>>>Debug:"+user.toString());
			// Redirect
			regWin.detach();
			
			// HtmlMacroComponent tj = (HtmlMacroComponent)getPage().getComponentDefinition("timedJump", false).newInstance(getPage(), null);
			// Redirect
			redirectToLoginPage();
		}
	}
	
	private void redirectToLoginPage() {
		TimedJump tj = new TimedJump();
		tj.applyProperties();
		// Buggy macro composition, we need to specify macro URI here again.
		tj.setMacroURI(Labels.getLabel("links.ui.macro.timedJump"));
		tj.setDynamicProperty("title", "跳转");
		tj.setDynamicProperty("preMsg", "恭喜，注册成功！");
		tj.setDynamicProperty("cd", "5");
		tj.setDynamicProperty("postMsg", "秒后将跳转到");
		tj.setDynamicProperty("jumpTo", "登陆页面");
		tj.setDynamicProperty("jumpToUrl", Labels.getLabel("links.uri.login"));
		tj.afterCompose();
		tj.setPage(getPage());
	}
}

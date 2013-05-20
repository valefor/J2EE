package org.alc.composer;

import java.util.List;

import org.alc.dao.UserDao;
import org.alc.entity.User;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class UsersProvider extends SelectorComposer<Component> {

	private static final long serialVersionUID = 1L;
	
	@WireVariable
	private UserDao userDao;
	
	private List<User> users;
	
	@org.zkoss.bind.annotation.Init
	public void Init() {
		users = userDao.findAll();
		if (!users.isEmpty()) {
			System.out.println("users:");
			System.out.println(users);
		}
		else
		{
			System.out.println("list is empty!");
		}
	}
	
	public List<User> getUsers() {
		return users;
	}
}

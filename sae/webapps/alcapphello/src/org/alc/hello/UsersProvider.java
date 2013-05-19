package org.alc.hello;

import java.util.List;

import org.alc.dao.UserDao;
import org.alc.model.User;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.WireVariable;

public class UsersProvider extends SelectorComposer {

	@WireVariable
	private UserDao userDao;
	
	private List<User> users;
	private User selectedItem;
	
	@org.zkoss.bind.annotation.Init
	public void Init() {
		users = userDao.queryAll();
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

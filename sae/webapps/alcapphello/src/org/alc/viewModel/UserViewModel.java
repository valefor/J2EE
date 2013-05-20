package org.alc.viewModel;

import java.util.List;

import org.alc.dao.UserDao;
import org.alc.entity.User;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.bind.annotation.Init;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class UserViewModel {

	@WireVariable
	private UserDao userDao;
	
	private List<User> users;
	private User selectedItem;
	
	@Init
	public void Init() {
		users = userDao.findAll();
		if (!users.isEmpty()) {
			setSelectedItem(users.get(0));
		}
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void setSelectedItem(User selectedItem) {
		this.selectedItem = selectedItem;
	}
}

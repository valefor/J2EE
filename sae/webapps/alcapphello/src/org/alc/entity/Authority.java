package org.alc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the authority database table.
 * 
 */
@Entity
@Table(name="authority")
public class Authority implements Serializable, org.springframework.security.core.GrantedAuthority {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=50)
	private String role;

	//bi-directional many-to-many association to User
	@ManyToMany(mappedBy="authorities")
	private Set<User> users;

	public Authority() {
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String getAuthority() {
		System.out.println(getRole());
		return getRole();
	}

}
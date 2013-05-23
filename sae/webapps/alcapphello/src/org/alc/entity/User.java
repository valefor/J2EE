package org.alc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String avatar;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;

	private String email;

	private int isSectioner;

	private String name;

	private String password;

	private int point;

	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;

	private String remark;

	private int sex;

	private int status;

	//bi-directional many-to-one association to Reply
	@OneToMany(mappedBy="user")
	private Set<Reply> replies;

	//bi-directional many-to-many association to Section
	@ManyToMany(mappedBy="users")
	private Set<Section> sections;

	//bi-directional many-to-one association to Topic
	@OneToMany(mappedBy="user")
	private Set<Topic> topics;

	//bi-directional many-to-many association to Authority
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="user_role"
		, joinColumns={
			@JoinColumn(name="id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="role")
			}
		)
	private Set<Authority> authorities;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsSectioner() {
		return this.isSectioner;
	}

	public void setIsSectioner(int isSectioner) {
		this.isSectioner = isSectioner;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSex() {
		return this.sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Set<Reply> getReplies() {
		return this.replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}

	public Reply addReply(Reply reply) {
		getReplies().add(reply);
		reply.setUser(this);

		return reply;
	}

	public Reply removeReply(Reply reply) {
		getReplies().remove(reply);
		reply.setUser(null);

		return reply;
	}

	public Set<Section> getSections() {
		return this.sections;
	}

	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}

	public Set<Topic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	public Topic addTopic(Topic topic) {
		getTopics().add(topic);
		topic.setUser(this);

		return topic;
	}

	public Topic removeTopic(Topic topic) {
		getTopics().remove(topic);
		topic.setUser(null);

		return topic;
	}

	public Set<Authority> getAuthorities() {
		return this.authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

}
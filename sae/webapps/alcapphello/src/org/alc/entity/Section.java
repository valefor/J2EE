package org.alc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the section database table.
 * 
 */
@Entity
@Table(name="section")
public class Section implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	private int clickCount;

	@Column(nullable=false, length=20)
	private String name;

	@Column(length=200)
	private String profile;

	@Column(length=200)
	private String statement;

	private int topicCount;

	//bi-directional many-to-one association to Reply
	@OneToMany(mappedBy="section")
	private Set<Reply> replies;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(
		name="section_master"
		, joinColumns={
			@JoinColumn(name="sectionId", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="id", nullable=false)
			}
		)
	private Set<User> users;

	//bi-directional many-to-one association to Topic
	@OneToMany(mappedBy="section")
	private Set<Topic> topics;

	public Section() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getStatement() {
		return this.statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public int getTopicCount() {
		return this.topicCount;
	}

	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}

	public Set<Reply> getReplies() {
		return this.replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}

	public Reply addReply(Reply reply) {
		getReplies().add(reply);
		reply.setSection(this);

		return reply;
	}

	public Reply removeReply(Reply reply) {
		getReplies().remove(reply);
		reply.setSection(null);

		return reply;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Topic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	public Topic addTopic(Topic topic) {
		getTopics().add(topic);
		topic.setSection(this);

		return topic;
	}

	public Topic removeTopic(Topic topic) {
		getTopics().remove(topic);
		topic.setSection(null);

		return topic;
	}

}
package org.alc.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the topic database table.
 * 
 */
@Entity
@Table(name="topic")
public class Topic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	private int clickCount;

	@Column(length=1000)
	private String content;

	@Column(length=100)
	private String face;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastReplayTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdateTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date postTime;

	private int replyCount;

	private int status;

	@Column(length=100)
	private String title;

	//bi-directional many-to-one association to Reply
	@OneToMany(mappedBy="topic")
	private Set<Reply> replies;

	//bi-directional many-to-one association to Section
	@ManyToOne
	@JoinColumn(name="sectionId", nullable=false)
	private Section section;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userId", nullable=false)
	private User user;

	public Topic() {
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFace() {
		return this.face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public Date getLastReplayTime() {
		return this.lastReplayTime;
	}

	public void setLastReplayTime(Date lastReplayTime) {
		this.lastReplayTime = lastReplayTime;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Date getPostTime() {
		return this.postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public int getReplyCount() {
		return this.replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Reply> getReplies() {
		return this.replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}

	public Reply addReply(Reply reply) {
		getReplies().add(reply);
		reply.setTopic(this);

		return reply;
	}

	public Reply removeReply(Reply reply) {
		getReplies().remove(reply);
		reply.setTopic(null);

		return reply;
	}

	public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
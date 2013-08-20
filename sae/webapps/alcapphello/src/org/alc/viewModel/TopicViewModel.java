package org.alc.viewModel;

import java.util.List;

import org.alc.dao.TopicDao;
import org.alc.entity.Topic;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class TopicViewModel {
	
	@WireVariable
	private TopicDao topicDao;
	
	private List<Topic> topics;
	
	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	@Init
	public void Init() {
		topics = topicDao.findAll();
	}
	
	@Command
	public void viewTopic(int topicId) {
		
	}
}

package org.alc.zk;

import java.util.Map;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.impl.PageImpl;
import org.zkoss.zk.ui.util.Initiator;

public class PageInitiator implements Initiator {
	
	@Override
	public void doInit(Page page, Map<String, Object> args) throws Exception {
		
		PageImpl pageImpl = (PageImpl)page;
		
		// meta
		pageImpl.addBeforeHeadTags("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>");
		// css and js
		pageImpl.addAfterHeadTags("<link rel=\"stylesheet\" type=\"text/css\" href=\"/alcapphello/rui/css/bootstrap.min.css\"/>");
		pageImpl.addAfterHeadTags("<link rel=\"stylesheet\" type=\"text/css\" href=\"/alcapphello/rui/css/bootstrap-responsive.min.css\"/>");
	
		System.out.println(page.getRequestPath());
		System.out.println(pageImpl.getBeforeHeadTags());
		System.out.println(pageImpl.getAfterHeadTags());
	}
}

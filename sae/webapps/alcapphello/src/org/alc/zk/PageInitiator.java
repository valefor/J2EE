package org.alc.zk;

import java.util.Map;

import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.impl.PageImpl;
import org.zkoss.zk.ui.util.Initiator;

public class PageInitiator implements Initiator {

	@Override
	public void doInit(Page page, Map<String, Object> args) throws Exception {
		PageImpl pageImpl = (PageImpl)page;
		System.out.println("Page before headers:"+pageImpl.getBeforeHeadTags());
		System.out.println("Page after headers:"+pageImpl.getAfterHeadTags());
		System.out.println("Page response headers:"+pageImpl.getResponseHeaders());
		
		// meta
		pageImpl.addBeforeHeadTags("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>");
		// css and js
		pageImpl.addAfterHeadTags("<link rel=\"stylesheet\" type=\"text/css\" href=\"/alcapphello/rui/css/bootstrap.min.css\"/>");
		pageImpl.addAfterHeadTags("<link rel=\"stylesheet\" type=\"text/css\" href=\"/alcapphello/rui/css/bootstrap-responsive.min.css\"/>");
		pageImpl.addAfterHeadTags("<link rel=\"stylesheet\" type=\"text/css\" href=\"/alcapphello/rui/css/app-docs.css\"/>");
	}

}

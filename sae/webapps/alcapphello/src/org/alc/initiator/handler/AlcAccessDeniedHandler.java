package org.alc.initiator.handler;

import java.util.Map;

import org.alc.util.SecurityUtil;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.util.GenericInitiator;

public class AlcAccessDeniedHandler extends GenericInitiator {

	public void doInit(Page page, Map<String, Object> args)  throws Exception{
		
		Execution exec = Executions.getCurrent();
		
		exec.setAttribute("REDIRECT_URL", Labels.getLabel("links.uri.index"));
		
		if(null == SecurityUtil.getUser()) {
			exec.sendRedirect(Labels.getLabel("links.uri.login"));
		} else {
			Executions.createComponents(Labels.getLabel("links.url.error.accessDenied"), null, args);
		}
	}

}

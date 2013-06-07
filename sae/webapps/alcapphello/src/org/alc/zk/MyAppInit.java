package org.alc.zk;

import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.util.WebAppInit;

public class MyAppInit implements WebAppInit {

	@Override
	public void init(WebApp wapp) throws Exception {
		Labels.register(new AppLabelLocator(wapp.getServletContext(),"appLabelLocator"));
	}

}

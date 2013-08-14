package org.alc.util;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.SerializableEventListener;
import org.zkoss.zul.Messagebox.ClickEvent;

public class ZkEventHandlerUtil {

	public static EventListener<Event> createRedirectActionListener(final String redirectUrl) {
		return 
		new SerializableEventListener<Event>(){
            private static final long serialVersionUID = 1L;
 
            public void onEvent(Event event) throws Exception {
                //redirect current url to logout
            	Executions.getCurrent().sendRedirect(redirectUrl);
            }
        };
	}
	
	public static EventListener<ClickEvent> createMessageBoxActionListener(
			final String OkRedirectUrl,
			final String CancelRedirectUrl) {
		return 
		new SerializableEventListener<ClickEvent>(){
            private static final long serialVersionUID = 1L;
 
            public void onEvent(ClickEvent event) throws Exception {
                //redirect current url to logout
            	switch (event.getButton()) {
            	case OK:
            		Executions.getCurrent().sendRedirect(OkRedirectUrl);
            		break;
				default:
					break;
            	}
            	
            }
        };
	}
	
	public static EventListener<Event> onCloseListener() {
		return 
		new EventListener<Event>(){

			@Override
			public void onEvent(Event event) throws Exception {
				event.getTarget().detach();		
			}

        };
	}
}

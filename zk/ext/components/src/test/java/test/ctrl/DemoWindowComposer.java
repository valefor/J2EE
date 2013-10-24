package test.ctrl;

import org.alc.zkext.zul.Navbar;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.util.GenericForwardComposer;

public class DemoWindowComposer extends GenericForwardComposer {
	
	private Navbar myComp;
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		myComp.setText("Hello ZK Component!! Please click me.");
	}
	
	public void onFoo$myComp (ForwardEvent event) {
		Event mouseEvent = (Event) event.getOrigin();
		alert("You listen onFoo: " + mouseEvent.getTarget());
	}
}
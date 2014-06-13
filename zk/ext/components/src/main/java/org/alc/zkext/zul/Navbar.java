package org.alc.zkext.zul;

import java.util.Map;

import org.zkoss.lang.Objects;
import org.zkoss.zk.au.AuRequest;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.impl.XulElement;

public class Navbar extends XulElement {

	static {
		addClientEvent(Navbar.class, "onFoo", 0);
	}
	
	/* Here's a simple example for how to implements a member field */

	private String _text;
	private String _orient = "horizontal";

	public String getText() {
		return _text;
	}

	public void setText(String text) {
		if (!Objects.equals(_text, text)) {
			_text = text;
			smartUpdate("text", _text);
		}
	}
	
	public String get_orient() {
		return _orient;
	}

	public void setOrient(String orient) throws WrongValueException {
		if (!"horizontal".equals(orient) && !"vertical".equals(orient))
			throw new WrongValueException("orient cannot be "+orient);
		
		if (!Objects.equals(_orient, orient)) {
			_orient = orient;
			smartUpdate("orient", _orient);
		}
	}

	//super//
	protected void renderProperties(org.zkoss.zk.ui.sys.ContentRenderer renderer)
	throws java.io.IOException {
		super.renderProperties(renderer);

		render(renderer, "text", _text);
		render(renderer, "orient", _orient);
	}
	
	public void service(AuRequest request, boolean everError) {
		final String cmd = request.getCommand();
		final Map data = request.getData();
		
		if (cmd.equals("onFoo")) {
			final String foo = (String)data.get("foo");
			System.out.println("do onFoo, data:" + foo);
			Events.postEvent(Event.getEvent(request));
		} else
			super.service(request, everError);
	}

	/**
	 * The default zclass is "z-navbar"
	 */
	public String getZclass() {
		return (this._zclass != null ? this._zclass : "z-navbar");
	}

	
}


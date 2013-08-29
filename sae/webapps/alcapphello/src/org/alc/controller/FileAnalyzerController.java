package org.alc.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.UploadEvent;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Menuitem;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class FileAnalyzerController extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7948775482135868770L;
	
	@Wire
	private Menuitem newbee;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		System.out.println("Initializing...");
	}
	
	@Listen("onUpload = #open")
	public void analyzeFile(UploadEvent event) {
		System.out.println("File upload finished, start to analyze...");
		byte[] bytes;
		bytes = event.getMedia().getByteData();
		String str = new String(bytes);
		System.out.println(str);
	}
	
	@Listen("onOpen = #mp")
	void popupMenu() {
		System.out.println("Poping up menu...");
	}
	
	@Listen("onMaximize")
	void maximize() {
		System.out.println("maximizing...");
	}
}

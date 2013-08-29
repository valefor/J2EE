package org.alc.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;

public class FileAnalyzerController extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7948775482135868770L;

	@Listen("onUpload = #fa, onClick = #fa")
	void analyzeFile(Event event) {
		System.out.println("File upload finished, start to analyze...");
	}
}

package org.alc.services;

import java.io.Serializable;


public class SidebarPage implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	String label;
	String iconUri;
	String uri;
	
	public SidebarPage(String name, String label, String iconUri, String uri) {
		super();
		this.name = name;
		this.label = label;
		this.iconUri = iconUri;
		this.uri = uri;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getIconUri() {
		return iconUri;
	}
	public void setIconUri(String iconUri) {
		this.iconUri = iconUri;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
}

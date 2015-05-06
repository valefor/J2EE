package org.alc.ws.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Greeting {
	public String greeting(@WebParam(name="userName")String userName);
}

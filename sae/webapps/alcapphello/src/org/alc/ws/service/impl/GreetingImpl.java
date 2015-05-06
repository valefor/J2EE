package org.alc.ws.service.impl;

import java.util.Calendar;

import javax.jws.WebService;

import org.alc.ws.service.Greeting;

@WebService(endpointInterface = "org.alc.ws.service.Greeting", serviceName="Greeting") 
public class GreetingImpl implements Greeting {

	@Override
	public String greeting(String userName) {
		return "Hello " + userName + ", currentTime is " + Calendar.getInstance().getTime();
	}

}

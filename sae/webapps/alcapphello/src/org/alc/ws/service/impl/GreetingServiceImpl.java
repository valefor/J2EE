package org.alc.ws.service.impl;

import java.util.Calendar;

import javax.jws.WebService;

import org.alc.ws.service.GreetingService;

@WebService(endpointInterface = "org.alc.ws.service.GreetingService") 
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greeting(String userName) {
		return "Hello " + userName + ", currentTime is " + Calendar.getInstance().getTime();
	}

}

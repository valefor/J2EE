package org.alc.ws.test;

import org.alc.ws.service.Greeting;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(Greeting.class);
		factory.setAddress("http://localhost:9000/Greeting");
		Greeting client = (Greeting) factory.create();
		 
		String reply = client.greeting("Adrian");
		System.out.println("Server said: " + reply);
		System.exit(0);

	}

}

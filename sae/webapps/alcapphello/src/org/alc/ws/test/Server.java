package org.alc.ws.test;

import org.alc.ws.service.Greeting;
import org.alc.ws.service.impl.GreetingImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GreetingImpl implementor = new GreetingImpl();
		JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean();
		svrFactory.setServiceClass(Greeting.class);
		svrFactory.setAddress("http://localhost:9000/Greeting");
		svrFactory.setServiceBean(implementor);
		svrFactory.getInInterceptors().add(new LoggingInInterceptor());
		svrFactory.getOutInterceptors().add(new LoggingOutInterceptor());
		svrFactory.create();

	}

}

package com.lhx.spring.springboot_web;

import java.io.File;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

//@Component //暂时注释测试另一个方式
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		System.out.println(container.getClass());
		TomcatEmbeddedServletContainerFactory factory =(TomcatEmbeddedServletContainerFactory)container;
		factory.setPort(8181);
		factory.setBaseDirectory(new File("d:/tmp/tomcat"));
		
		factory.addContextValves(getAccessLogValve());
		
		factory.addConnectorCustomizers(new MyTomcatConnectorCustomizers());
	}
	
	private AccessLogValve getAccessLogValve() {
		AccessLogValve log = new AccessLogValve();
		log.setDirectory("d:/tmp/logs");
		log.setEnabled(true);
		log.setPattern("common");
		log.setPrefix("spring-boot-lhx-access-log");
		log.setSuffix(".txt");
		return log;		
	}
	
	
}
class MyTomcatConnectorCustomizers implements TomcatConnectorCustomizer{

	@Override
	public void customize(Connector connector) {
		 Http11NioProtocol protocol =  (Http11NioProtocol)connector.getProtocolHandler();
		 protocol.setMaxConnections(2000);
		 protocol.setMaxThreads(500);
	}	
}

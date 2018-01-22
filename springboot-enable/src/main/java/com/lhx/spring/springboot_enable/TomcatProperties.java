package com.lhx.spring.springboot_enable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tomcat")
public class TomcatProperties {
	private String host;
	private String port;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "TomcatProperties [host=" + host + ", port=" + port + "]";
	}

}

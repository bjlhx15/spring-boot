package com.lhx.spring.springboot_enableauto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ServerSuccessReport implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----CommandLineRunner执行-----");
	}

}

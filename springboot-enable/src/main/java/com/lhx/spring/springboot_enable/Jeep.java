package com.lhx.spring.springboot_enable;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class Jeep implements Runnable {

	@Override
	@Async
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("---------------"+i);
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

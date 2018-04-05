package com.lhx.spring.springboot;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		//return Health.down().withDetail("error", "spring test error").build();
		return Health.up().withDetail("success", "spring test success").build();
	}
}

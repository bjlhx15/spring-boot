package com.lhx.spring.redis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.Jedis;

@Configuration
@ConditionalOnClass(Jedis.class)
@EnableConfigurationProperties(RedisProperties.class)
public class RedisAutoConfiguration {
	@Bean
	@ConditionalOnMissingBean(Jedis.class)
	public Jedis jedis(RedisProperties redisProperties) {
		return new Jedis(redisProperties.getHost(), redisProperties.getPort().intValue());
	}
}

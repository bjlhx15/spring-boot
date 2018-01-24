package com.lhx.spring.springboot_event;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {
	@EventListener
	public void event(MyApplicationEvent event) {
		System.out.println("MyEventHandle 接收到事件:" + event.getClass());
	}
	

	@EventListener
	public void event2(ContextStoppedEvent event) {
		System.out.println("应用停止  接收到事件:" + event.getClass());
	}
}

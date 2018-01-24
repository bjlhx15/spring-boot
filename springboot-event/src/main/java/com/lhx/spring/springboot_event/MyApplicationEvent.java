package com.lhx.spring.springboot_event;

import org.springframework.context.ApplicationEvent;

/**
 * 定义事件
 * @author Administrator
 *
 */
public class MyApplicationEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;

	public MyApplicationEvent(Object source) {
		super(source);
	}
}

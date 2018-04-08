package com.lhx.mall.web.mall;

import java.util.List;

public class LoadBalance {
	private int index = 0;
	private List<String> services;

	public LoadBalance(List<String> services) {
		this.services = services;
	}

	public String choose() {
		String service = services.get(index);
		index++;
		if (index >= services.size()) {
			index = 0;
		}
		return service;
	}
}

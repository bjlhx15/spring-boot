package com.lhx.mall.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhx.mall.product.bean.Product;
import com.lhx.mall.product.mapper.ProductMapper;
import com.lhx.mall.product.web.Response;

@RestController
public class ProdcutController {
	@Autowired
	private ProductMapper productMapper;
	@PostMapping("/soa/prodcut/add")
	public Response add(Product product) {
		Integer res = productMapper.addProduct(product);
		if(res==null) {
			return new Response();
		}
		return null;
	}
}

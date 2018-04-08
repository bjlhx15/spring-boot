package com.lhx.mall.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhx.mall.product.bean.Product;
import com.lhx.mall.product.mapper.ProductMapper;
import com.lhx.mall.product.web.Response;

@RestController
public class ProdcutController {
	@Autowired
	private ProductMapper productMapper;

	@PostMapping("/soa/product/add")
	public Response add(Product product) {
		Integer res = productMapper.addProduct(product);
		return res == 1 ? new Response("200", "Ok") : new Response("500", "Fail");
	}
	
	@PutMapping("/soa/product/update")
	public Response update(Product product) {
		Integer res = productMapper.update(product);
		return res == 1 ? new Response("200", "Ok") : new Response("500", "Fail");
	}

	@GetMapping("/soa/product/{id}")
	public Response get(@PathVariable("id") Integer id) {
		Product product = productMapper.getById(id);
		return new Response("200", "Ok", product);
	}

	@GetMapping("/soa/products")
	public Response list() {
		List<Product> lists = productMapper.queryByLists();
		return new Response("200", "Ok", lists);
	}

	@DeleteMapping("/soa/product/{id}")
	public Response delete(@PathVariable("id") Integer id) {
		Integer res = productMapper.deleteById(id);
		return res == 1 ? new Response("200", "Ok") : new Response("500", "Fail");
	}
	@GetMapping("/soa/address")
	public Response address() {
		return new Response("200", "Ok", "127.0.0.1:9090");
	}
}

package cn.tedu.client.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.tedu.api.domain.Order;
import cn.tedu.api.feign.OrderFeign;

@RestController
public class OrderController {
	@Resource
	private OrderFeign orderFeign;
	
	@GetMapping("/order/{id}")
	public Order getOrder(@PathVariable("id")Integer id) {
		return orderFeign.getOrder(id);
	}
}

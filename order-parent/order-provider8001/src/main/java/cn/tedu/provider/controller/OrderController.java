package cn.tedu.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.api.domain.Order;

@RestController
public class OrderController {
	
	@GetMapping("/order/{id}")
	public Order getOrder(@PathVariable("id")Integer id) {
		Order order=new Order();
		order.setOrderId(id);
		order.setOrderNum(System.currentTimeMillis()+"-8001");
		return order;
	}
}

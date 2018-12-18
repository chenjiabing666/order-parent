package cn.tedu.client.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.tedu.api.domain.Order;

@RestController
public class OrderController {
	private final static String URI_PRFIX="http://zuul-server/api-order";
	
	@Resource
	private RestTemplate restTemplate;
	
	@GetMapping("/order/{id}")
	public Order getOrder(@PathVariable("id")Integer id) {
		return restTemplate.getForObject(URI_PRFIX+"/order/"+id, Order.class);
	}
	
	
}

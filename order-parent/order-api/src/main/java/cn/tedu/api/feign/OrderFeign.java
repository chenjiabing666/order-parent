package cn.tedu.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.tedu.api.domain.Order;
import cn.tedu.api.hystrix.OrderFallBack;

@FeignClient(name="order-provider",fallbackFactory=OrderFallBack.class)
public interface OrderFeign {
	@RequestMapping(value="/order/{id}",method=RequestMethod.GET)
	Order getOrder(@PathVariable("id")Integer id);
}

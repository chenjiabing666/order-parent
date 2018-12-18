package cn.tedu.api.hystrix;

import org.springframework.stereotype.Component;

import cn.tedu.api.domain.Order;
import cn.tedu.api.feign.OrderFeign;
import feign.hystrix.FallbackFactory;

@Component
public class OrderFallBack implements FallbackFactory<OrderFeign> {
	@Override
	public OrderFeign create(Throwable cause) {
		return new OrderFeign() {
			@Override
			public Order getOrder(Integer id) {
				Order order=new Order();
				order.setOrderId(-1);
				order.setOrderNum("服务器出现异常或者没有服务提供者....");
				return order;
			}
		};
	}

}

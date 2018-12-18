package cn.tedu.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient   //开启eureka
@EnableCircuitBreaker   //开启熔断
@EnableFeignClients(basePackages= {"cn.tedu.api.feign"})  //扫描FeignClient
@ComponentScan(basePackages= {"cn.tedu.*"})   //扫描Hystrix的fallbackFactory
public class OrderClient9002Application {
	public static void main(String[] args) {
		SpringApplication.run(OrderClient9002Application.class, args);
	}
}

package cn.tedu.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   //开启eureka
public class OrderClient9001Application {
	public static void main(String[] args) {
		SpringApplication.run(OrderClient9001Application.class, args);
	}
}

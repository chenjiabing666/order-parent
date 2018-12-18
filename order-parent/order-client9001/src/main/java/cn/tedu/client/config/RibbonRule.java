package cn.tedu.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RibbonRule {
	/**
     * 配置随机算法，改变默认的轮询算法
     * @return
     */
    @Bean
    public IRule rule(){
        return new RandomRule();   //直接返回随机算法
    }
}

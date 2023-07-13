package com.test.demo.config;

import com.test.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * USER: colt
 * TIME: 2023/7/13 上午10:17
 */
// @Configuration指明当前类是一个配置类, 替代之前的Spring配置文件
// 在配置文件中用<bean><bean/>标签添加组件
@Configuration
public class MyAppConfig {

    // @Bean 将方法的返回值添加到容器中,容器中这个组件默认的id就是该方法的方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@bean给容器中添加组件");
        return new HelloService();
    }
}

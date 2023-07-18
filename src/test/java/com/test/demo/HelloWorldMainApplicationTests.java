package com.test.demo;


import com.test.demo.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Spring Boot 单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldMainApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    // 记录器
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        System.out.println("person:" + person);
    }

    @Test
    public void testHelloService() {
        System.out.println(ioc.containsBean("helloService"));
    }

    @Test
    public void testLogging() {
        /*
         * 日志的级别，由低到高
         * 可以调整输出日志的级别，日志就只会在这个级别以后的高级别生效
         * SpringBoot默认给我们使用的是info级别的日志
         * 可以通过配置文件调整level等级
         */
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }


}



package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * USER: colt
 * TIME: 2023/7/12 下午3:26
 */


// 这个类的所有方法返回的数据直接写给浏览器，如果是对象，则转为json数据
/*@ResponseBody
@Controller*/

// 等价于@ResponseBody 和 @Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}

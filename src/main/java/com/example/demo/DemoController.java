package com.example.demo;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class DemoController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World Developer!!!";
    }
}

package com.leoho.mysqldemo.TestFunc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/helloWorld") // 在網址輸入 127.0.0.1:8080/helloWorld 會執行的 Function
    public String helloWorld() {
        return "Spring Boot Hello World (@RestController)";
    }
}

package com.leoho.mysqldemo.TestFunc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld2 {

    @GetMapping("/helloWorld2") // 在網址輸入 127.0.0.1:8080/helloWorld2 會執行的 Function
    public String helloWorld2() {
        return "Spring Boot Hello World (@Controller)";
    }

}

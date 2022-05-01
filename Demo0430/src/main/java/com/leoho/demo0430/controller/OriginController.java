package com.leoho.demo0430.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // HTML
public class OriginController {
    @RequestMapping("/index")
    public String test(@RequestParam(value="title", required=false, defaultValue="test") String title, Model model) {
        model.addAttribute("name", title);
        return "index";
    }
}

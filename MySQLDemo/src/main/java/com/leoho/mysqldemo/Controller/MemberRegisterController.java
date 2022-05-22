package com.leoho.mysqldemo.Controller;

import com.leoho.mysqldemo.Model.MemberModel;
import com.leoho.mysqldemo.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberRegisterController {

    @Autowired MemberModel memberModel; // 將 MemberModel 的實體 (這片葉子) 注入到 MemberController 這個 class 內

    @Autowired MemberService memberService; // 將 MemberService 的實體 (這片葉子) 注入到 MemberController 這個 class 內

    @GetMapping("/addMember") // 在網址輸入 127.0.0.1:8080/addMember 會執行的 Function
    public String addMember() {
        return "addMember";
    }

}

package com.leoho.mysqldemo.Controller;

import com.leoho.mysqldemo.Model.MemberModel;
import com.leoho.mysqldemo.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberRegisterRestController {

    @Autowired MemberModel memberModel; // 將 MemberModel 的實體 (這片葉子) 注入到 MemberController 這個 class 內

    @Autowired MemberService memberService; // 將 MemberService 的實體 (這片葉子) 注入到 MemberController 這個 class 內

    @RequestMapping("/register") // 在網址輸入 127.0.0.1:8080/register 會執行的 Function
    public String addNewMember() {
        memberModel = new MemberModel();
        memberModel.setId(0);
        memberModel.setEmail("leo160918@gmail.com");
        memberModel.setPassword("abc123");
        memberModel.setAddress("spring boot");
        memberModel.setPhone("0912345678");
        memberService.addMember(memberModel);
        return "新增會員成功！";
    }
}

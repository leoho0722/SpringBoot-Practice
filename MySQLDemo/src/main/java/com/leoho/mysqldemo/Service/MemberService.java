package com.leoho.mysqldemo.Service;


import com.leoho.mysqldemo.Model.MemberModel;
import com.leoho.mysqldemo.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 宣告 MemberService 這個 class 為 Service，用來與被宣告成 @Repository 的 class 做互動
public class MemberService {

    @Autowired MemberRepository memberRepository; // 將 MemberRepository 的實體 (這片葉子) 注入到 MemberService 這個 class 內

    public void addMember(MemberModel memberModel) {
        memberRepository.addMember(memberModel);
    }

}

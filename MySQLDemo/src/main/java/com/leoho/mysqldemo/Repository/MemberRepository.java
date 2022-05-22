package com.leoho.mysqldemo.Repository;

import com.leoho.mysqldemo.Model.MemberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // 宣吿 MemberRepository 這個 class 為資料存取層，並與 Model 做互動
public class MemberRepository {

    @Autowired private JdbcTemplate jdbcTemplate;

    public void addMember(MemberModel memberModel) {
        System.out.println("開始向 MySQL 新增成員");
        jdbcTemplate.update(
                "INSERT into Member(EMAIL, PASSWORD, ADDRESS, PHONE, CREATE_TIME)" + "VALUES (?, ?, ?, ?, NOW())",
                memberModel.getEmail(), memberModel.getPassword(), memberModel.getAddress(), memberModel.getPhone()
        );
        System.out.println("已經向 MySQL 新增完成員了");
    }

}

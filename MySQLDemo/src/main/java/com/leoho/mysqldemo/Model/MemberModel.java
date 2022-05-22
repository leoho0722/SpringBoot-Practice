package com.leoho.mysqldemo.Model;

import org.springframework.stereotype.Component;
import java.util.Date;

@Component // 宣告 MemberModel 這個 class 是一個組件
public class MemberModel {

    private int id; // 使用者在資料庫裡的 ID

    private String email; // 使用者設定的 Email

    private String password; // 使用者設定的 Password

    private String address; // 使用者輸入的 Address

    private String phone; // 使用者輸入的 Phone

    private Date createDate; // 建立使用者的日期

    // id 的 get set Function

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // email 的 get set Function

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // password 的 get set Function

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // address 的 get set Function

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // phone 的 get set Function

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // createDate 的 get set Function

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

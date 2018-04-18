package com.xukai.springboot.entity.user;

import java.util.Date;

public class User {

    /**
     * 用户ID
     */
    private  int userID=0;

    /**
     * 登录名称
     */
    private  String loginName="";

    /**
     * 登录密码
     */
    private String password="";

    /**
     * 真实姓名
     */
    private  String realName="";

    /**
     * 联系电话
     */
    private  String Contact="";

    /**
     * 用户状态 0：禁用；1：启用
     */
    private  int statue=1;

    /**
     * 用户等级
     */
    private  int level=0;

    /**
     * 注册时间
     */
    private Date regTime;


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}

package com.mike_milk.mvp.Model;

import android.content.Intent;

/**
 * 时间：2020/3/17
 * 创建者：MIKE-MILK
 * 描述：
 */
public class User {
    private String UserName;
    private String UserPassWord;

    public User(String userName,String userPassWord){
        this.UserName=userName;
        this.UserPassWord=userPassWord;
    }

    public String toString(){
        return "UserName="+UserName+"UserPassword="+UserPassWord;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassWord() {
        return UserPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        UserPassWord = userPassWord;
    }

}

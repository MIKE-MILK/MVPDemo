package com.mike_milk.mvp.Presenter;

import com.mike_milk.mvp.Model.RegistListener;
import com.mike_milk.mvp.Model.User;
import com.mike_milk.mvp.Model.UserRegist;
import com.mike_milk.mvp.Model.mUserRegist;
import com.mike_milk.mvp.View.UserRegistView;

/**
 * 时间：2020/3/19
 * 创建者：MIKE-MILK
 * 描述：
 */
public class UserRegistPresenter {
    private UserRegistView userRegistView;
    private UserRegist userRegist;

    public UserRegistPresenter(UserRegistView userRegistView){
        this.userRegistView=userRegistView;
        this.userRegist=new mUserRegist();
    }

    public void regist(){
        User user=new User(userRegistView.getUserName(),userRegistView.getUserPassword());
        userRegist.regist(user, new RegistListener() {
            @Override
            public void Success() {
                System.out.println("注册成功");
            }

            @Override
            public void Failed() {
                System.out.println("注册失败");
            }
        });
    }
}

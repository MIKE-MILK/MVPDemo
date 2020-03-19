package com.mike_milk.mvp.Presenter;

import android.content.Context;
import android.content.Intent;

import com.mike_milk.mvp.Activity.MainActivity;
import com.mike_milk.mvp.Activity.QuestionActivity;
import com.mike_milk.mvp.Model.LoginListener;
import com.mike_milk.mvp.Model.User;
import com.mike_milk.mvp.Model.UserLogin;
import com.mike_milk.mvp.Model.mUserLogin;
import com.mike_milk.mvp.ToastUtil.ToastUtil;
import com.mike_milk.mvp.View.UserLoginView;

/**
 * 时间：2020/3/18
 * 创建者：MIKE-MILK
 * 描述：
 */
public class UserLoginPresenter {
   private UserLogin userLogin;
   private UserLoginView userLoginView;
   private Context context;

   public UserLoginPresenter(UserLoginView userLoginView){
       this.userLoginView=userLoginView;
       this.userLogin=new mUserLogin();
   }

   public void login(){
       User user=new User(userLoginView.getUserName(),userLoginView.getUserPassword());
       userLogin.login(user, new LoginListener() {
           @Override
           public void Success() {
           if (userLoginView.getUserName()!=null&&userLoginView.getUserPassword()!=null){
               System.out.println("Success");
               userLoginView.skiptoquestion();
           }
           }

           @Override
           public void Failed() {
               System.out.println("Failed");
           }
       });
   }
}

package com.mike_milk.mvp.Presenter;

import android.widget.Toast;

import com.mike_milk.mvp.MainActivity;
import com.mike_milk.mvp.Moder.LoginListener;
import com.mike_milk.mvp.Moder.User;
import com.mike_milk.mvp.Moder.UserLogin;
import com.mike_milk.mvp.Moder.mUserLogin;
import com.mike_milk.mvp.View.UserLoginView;

/**
 * 时间：2020/3/18
 * 创建者：MIKE-MILK
 * 描述：
 */
public class UserLoginPresenter {
   private UserLogin userLogin;
   private UserLoginView userLoginView;

   public UserLoginPresenter(UserLoginView userLoginView){
       this.userLoginView=userLoginView;
       this.userLogin=new mUserLogin();
   }
   public void login(){
       User user=new User(userLoginView.getUserName(),userLoginView.getUserPassword());
       userLogin.login(user, new LoginListener() {
           @Override
           public void Success() {
               System.out.println("Success");
           }

           @Override
           public void Failed() {
               System.out.println("Failed");
           }
       });
   }
}

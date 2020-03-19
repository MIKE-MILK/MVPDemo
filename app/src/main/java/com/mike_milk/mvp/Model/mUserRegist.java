package com.mike_milk.mvp.Model;

/**
 * 时间：2020/3/19
 * 创建者：MIKE-MILK
 * 描述：
 */
public class mUserRegist implements UserRegist{
    @Override
    public void regist(final User user,final RegistListener registListener) {
        new Thread(){
            @Override
            public void run() {
                super.run();
                if (user.getUserName().equals("MIKE")&& user.getUserPassWord().equals("123456789")){
                    //回调
                    registListener.Success();
                }else {

                    registListener.Failed();

                }
            }
        }.start();
    }
}

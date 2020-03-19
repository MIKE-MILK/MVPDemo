package com.mike_milk.mvp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mike_milk.mvp.Presenter.UserLoginPresenter;
import com.mike_milk.mvp.Presenter.UserRegistPresenter;
import com.mike_milk.mvp.R;
import com.mike_milk.mvp.ToastUtil.ToastUtil;
import com.mike_milk.mvp.View.UserLoginView;
import com.mike_milk.mvp.View.UserRegistView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, UserLoginView{

    private UserLoginPresenter userLoginPresenter;
    EditText editTextName;
    EditText editTextPassword;
    Button Login;
    Button regist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        Login=(Button)findViewById(R.id.login);
        regist=(Button)findViewById(R.id.register);
        editTextName=(EditText)findViewById(R.id.username);
        editTextPassword=(EditText)findViewById(R.id.userpassword);
        Login.setOnClickListener(this);
        regist.setOnClickListener(this);
        userLoginPresenter=new UserLoginPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                userLoginPresenter.login();
                break;
            case R.id.register:
                skiptoregist();
                break;
        }
    }

    @Override
    public String getUserName() {
        return editTextName.getText().toString();
    }

    @Override
    public String getUserPassword() {
        return editTextPassword.getText().toString();
    }

    public void skiptoquestion(){
        Intent intent=new Intent(MainActivity.this,QuestionActivity.class);
        startActivity(intent);
        finish();
    }

    public void skiptoregist(){
        Intent intent=new Intent(MainActivity.this,RegistActivity.class);
        startActivity(intent);
        finish();
    }
}

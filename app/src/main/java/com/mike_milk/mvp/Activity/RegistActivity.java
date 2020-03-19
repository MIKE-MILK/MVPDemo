package com.mike_milk.mvp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mike_milk.mvp.Model.UserRegist;
import com.mike_milk.mvp.Presenter.UserRegistPresenter;
import com.mike_milk.mvp.R;
import com.mike_milk.mvp.View.UserRegistView;

public class RegistActivity extends AppCompatActivity implements View.OnClickListener, UserRegistView {

    private EditText editTextName;
    private EditText editTextPassword;
    private UserRegistPresenter userRegistPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        initView();
    }

    public void initView(){
        editTextName=(EditText)findViewById(R.id.register_account);
        editTextPassword=(EditText)findViewById(R.id.register_password);
        Button button=(Button)findViewById(R.id.btn_register);
        button.setOnClickListener(this);
        userRegistPresenter=new UserRegistPresenter(this);
    }

    @Override
    public void onClick(View v) {
        userRegistPresenter.regist();
        skiptoMain();
    }

    @Override
    public String getUserPassword() {
        return editTextPassword.getText().toString();
    }

    @Override
    public String getUserName() {
        return editTextName.getText().toString();
    }

    public void skiptoMain(){
        Intent intent=new Intent(RegistActivity.this,MainActivity.class);
        startActivity(intent);
    }
}

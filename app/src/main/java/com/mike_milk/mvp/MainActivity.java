package com.mike_milk.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.mike_milk.mvp.Presenter.UserLoginPresenter;
import com.mike_milk.mvp.View.UserLoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, UserLoginView {

    private UserLoginPresenter userLoginPresenter;
    EditText editTextName;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        Button button=(Button)findViewById(R.id.login);
        editTextName=(EditText)findViewById(R.id.username);
        editTextPassword=(EditText)findViewById(R.id.userpassword);
        button.setOnClickListener(this);
        userLoginPresenter=new UserLoginPresenter(this);
    }

    @Override
    public void onClick(View v) {
        userLoginPresenter.login();
    }

    @Override
    public String getUserName() {
        return editTextName.getText().toString();
    }

    @Override
    public String getUserPassword() {
        return editTextPassword.getText().toString();
    }
}

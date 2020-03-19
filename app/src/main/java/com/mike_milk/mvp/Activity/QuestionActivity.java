package com.mike_milk.mvp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mike_milk.mvp.Model.UserRegist;
import com.mike_milk.mvp.Presenter.UserRegistPresenter;
import com.mike_milk.mvp.R;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }

}

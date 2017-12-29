package com.engineerkunle.demofootballapp.ui.main;

import android.os.Bundle;

import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

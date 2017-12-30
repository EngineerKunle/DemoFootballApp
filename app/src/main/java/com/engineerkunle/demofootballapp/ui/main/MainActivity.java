package com.engineerkunle.demofootballapp.ui.main;

import android.os.Bundle;

import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter<MainView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.attach(this);
    }

    @Override
    protected void onDestroy() {
        presenter.detach();
        super.onDestroy();
    }

    @Override
    public void showToast(String text) {

    }
}

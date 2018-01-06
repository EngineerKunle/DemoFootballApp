package com.engineerkunle.demofootballapp.ui.splash;

import android.content.Intent;
import android.os.Bundle;

import com.engineerkunle.demofootballapp.DemoFootballApp;
import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.injection.modules.ActivityModule;
import com.engineerkunle.demofootballapp.ui.base.BaseActivity;
import com.engineerkunle.demofootballapp.ui.main.MainActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashView {

    @Inject
    SplashPresenterImpl<SplashView> splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashPresenter.attach(this);
    }

    @Override
    protected void onDestroy() {
        splashPresenter.detach();
        super.onDestroy();
    }

    @Override
    public void showMainActivity() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void initComponent() {
        DemoFootballApp.getAppComponent()
                .plus(new ActivityModule(this))
                .inject(this);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_splash;
    }

    @Override
    protected boolean activateToolBar() {
        return false;
    }
}

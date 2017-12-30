package com.engineerkunle.demofootballapp.ui.main;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.engineerkunle.demofootballapp.DemoFootballApp;
import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.injection.modules.MainActivityModule;
import com.engineerkunle.demofootballapp.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter<MainView> presenter;

    @BindView(R.id.debug_button)
    Button debugButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        DemoFootballApp.getAppComponent()
                .plus(new MainActivityModule(this))
                .inject(this);

        presenter.attach(this);
    }

    @Override
    protected void onDestroy() {
        presenter.detach();
        super.onDestroy();
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.debug_button)
    public void hitButton(){
        presenter.buttonPressed("Button pressed");
    }

}

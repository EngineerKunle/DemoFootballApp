package com.engineerkunle.demofootballapp.ui.main;

import android.os.Bundle;

import com.engineerkunle.demofootballapp.DemoFootballApp;
import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.injection.modules.ActivityModule;
import com.engineerkunle.demofootballapp.ui.base.BaseActivity;
import com.engineerkunle.demofootballapp.utils.AppUtils;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showTeamStatsFragment();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    protected void initComponent() {
        DemoFootballApp.getAppComponent()
                .plus(new ActivityModule(this))
                .inject(this);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean activateToolBar() {
        return true;
    }

    private void showTeamStatsFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_container, TeamStatsFragment.newInstance(), AppUtils.TEAM_STATS_FRAGMENT)
                .commit();
    }
}

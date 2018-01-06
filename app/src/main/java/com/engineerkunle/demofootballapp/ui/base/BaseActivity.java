package com.engineerkunle.demofootballapp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.engineerkunle.demofootballapp.R;

public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    private Toolbar baseToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        initComponent();
        initView();
    }

    @Override
    public void showModularError(int resId, int messageId) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    protected abstract void initComponent();
    protected abstract int getLayoutResource();
    protected abstract boolean activateToolBar();

    private void initView() {
        baseToolbar = findViewById(R.id.base_toolbar);
        if (baseToolbar != null && activateToolBar()) {
            setSupportActionBar(baseToolbar);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.score_list) {
            Toast.makeText(this, "Scores are 1-0", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

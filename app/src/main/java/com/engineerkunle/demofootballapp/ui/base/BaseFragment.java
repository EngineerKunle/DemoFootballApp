package com.engineerkunle.demofootballapp.ui.base;


import android.content.Context;
import android.support.v4.app.Fragment;

public abstract class BaseFragment extends Fragment implements BaseView {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        initComponent();
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
}

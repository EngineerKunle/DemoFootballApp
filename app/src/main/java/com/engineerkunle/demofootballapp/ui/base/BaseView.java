package com.engineerkunle.demofootballapp.ui.base;

public interface BaseView {
    void showModularError(int resId, int messageId);

    void showLoading();

    void hideLoading();
}

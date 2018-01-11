package com.engineerkunle.demofootballapp.ui.main;

import com.engineerkunle.demofootballapp.api.model.RecordClass;
import com.engineerkunle.demofootballapp.ui.base.BaseView;

import java.util.List;

public interface MainView extends BaseView {
    void showToast(String text);
    void setUpList(List<RecordClass> results);
}

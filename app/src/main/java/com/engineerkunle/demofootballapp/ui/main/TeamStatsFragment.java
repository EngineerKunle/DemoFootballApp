package com.engineerkunle.demofootballapp.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.engineerkunle.demofootballapp.DemoFootballApp;
import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.injection.modules.FragmentModule;
import com.engineerkunle.demofootballapp.ui.base.BaseFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TeamStatsFragment extends BaseFragment implements MainView {

    @Inject
    MainPresenter<MainView> presenter;

    @BindView(R.id.debug_button)
    Button debugButton;


    public TeamStatsFragment() {}

    public static TeamStatsFragment newInstance() {
        TeamStatsFragment fragment = new TeamStatsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_team_stats, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        presenter.attach(this);
    }

    @Override
    public void onDetach() {
        presenter.detach();
        super.onDetach();
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initComponent() {
        DemoFootballApp.getAppComponent()
                .plus(new FragmentModule(getActivity()))
                .inject(this);
    }

    @OnClick(R.id.debug_button)
    void debugButtonPressed() {
        presenter.buttonPressed("I have been pressed");
    }
}

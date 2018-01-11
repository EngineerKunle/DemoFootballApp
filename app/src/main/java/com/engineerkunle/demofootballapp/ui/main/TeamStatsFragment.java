package com.engineerkunle.demofootballapp.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.engineerkunle.demofootballapp.DemoFootballApp;
import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.api.model.RecordClass;
import com.engineerkunle.demofootballapp.injection.modules.FragmentModule;
import com.engineerkunle.demofootballapp.ui.adapter.StatsAdapter;
import com.engineerkunle.demofootballapp.ui.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamStatsFragment extends BaseFragment implements MainView {

    @Inject
    MainPresenter<MainView> presenter;


    @BindView(R.id.swipeContainer)
    SwipeRefreshLayout swipeRefreshLayout;

    @BindView(R.id.recycler_stats_view)
    RecyclerView recyclerView;

    private static final String TAG = TeamStatsFragment.class.getSimpleName();


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
        initView();
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
        Log.d(TAG, text);
    }

    @Override
    protected void initComponent() {
        DemoFootballApp.getAppComponent()
                .plus(new FragmentModule(getActivity()))
                .inject(this);
    }


    private void initView() {
        swipeRefreshLayout.setOnRefreshListener(swipeRefresherListener);
    }


    private SwipeRefreshLayout.OnRefreshListener swipeRefresherListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            presenter.callApi();
        }
    };

    @Override
    public void setUpList(List<RecordClass> results) {
        StatsAdapter adapter = new StatsAdapter(results);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        swipeRefreshLayout.setRefreshing(false);
    }
}

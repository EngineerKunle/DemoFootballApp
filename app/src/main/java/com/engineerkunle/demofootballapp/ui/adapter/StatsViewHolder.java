package com.engineerkunle.demofootballapp.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.engineerkunle.demofootballapp.R;

public class StatsViewHolder extends RecyclerView.ViewHolder {
    public TextView playerName;
    public TextView playerApperances;
    public TextView playerGoals;

    public StatsViewHolder(View view) {
        super(view);

        playerName = view.findViewById(R.id.player_name);
        playerApperances = view.findViewById(R.id.player_apps);
        playerGoals = view.findViewById(R.id.player_goals);
    }
}

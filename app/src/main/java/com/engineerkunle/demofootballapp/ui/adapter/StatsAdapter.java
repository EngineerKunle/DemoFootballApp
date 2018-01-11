package com.engineerkunle.demofootballapp.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.engineerkunle.demofootballapp.R;
import com.engineerkunle.demofootballapp.api.model.RecordClass;

import java.util.List;

public class StatsAdapter extends RecyclerView.Adapter<StatsViewHolder>{

    private List<RecordClass> statsRecords;

    public StatsAdapter(List<RecordClass> statsRecords) {
        this.statsRecords = statsRecords;
    }

    @Override
    public StatsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_list_cardview, parent, false);
        StatsViewHolder viewHolder = new StatsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StatsViewHolder holder, int position) {

        RecordClass singleItem = statsRecords.get(position);
        holder.playerName.setText(singleItem.getName());
        holder.playerGoals.setText("Goals " + singleItem.getGoals());
        holder.playerApperances.setText("Appearances " + singleItem.getAppearance());
    }

    @Override
    public int getItemCount() {
        return statsRecords.size();
    }

    public void clear() {
        statsRecords.clear();
        notifyDataSetChanged();
    }

    public void addAll(List<RecordClass> statsRecords) {
        statsRecords.addAll(statsRecords);
        notifyDataSetChanged();

    }
}

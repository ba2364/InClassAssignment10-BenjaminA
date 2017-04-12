package com.ba2364.inclassassignment10_benjamina;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamViewHolder> {

    private List<Team> teams;
    private Context context;

    public TeamAdapter(List<Team> teams, Context context) {
        this.teams = teams;
        this.context = context;
    }

    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_team_adapter, parent, false);
        return new TeamViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.bind(team);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
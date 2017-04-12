package com.ba2364.inclassassignment10_benjamina;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TeamViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView teamNameView;
    private TextView teamYearEstView;
    private ImageView teamLogoView;
    private Context context;

    public TeamViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        teamNameView = (TextView) itemView.findViewById(R.id.team_name);
        teamYearEstView = (TextView) itemView.findViewById(R.id.established);
        teamLogoView = (ImageView) itemView.findViewById(R.id.teamlogo);
        this.context = context;
    }

    public void bind(final Team team) {
        teamNameView.setText(team.teamName);
        teamYearEstView.setText(team.yearEst);
        teamLogoView.setImageResource(team.logoIDNum);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Team t = new Team(team.teamName, team.yearEst, team.logoIDNum);
                Intent teamIntent = new Intent(context, DetailedInfo.class);
                teamIntent.putExtra(Keys.TEAM, t);
                context.startActivity(teamIntent);

                Toast.makeText(context, teamNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
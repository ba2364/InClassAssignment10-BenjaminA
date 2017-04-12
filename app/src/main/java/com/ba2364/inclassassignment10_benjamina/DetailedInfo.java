package com.ba2364.inclassassignment10_benjamina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedInfo extends AppCompatActivity {

    private ImageView teamLogo;
    private TextView teamName;
    private TextView yearEstd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);

        teamLogo = (ImageView) findViewById(R.id.team_logo_detail);
        teamName = (TextView) findViewById(R.id.team_name_detail);
        yearEstd = (TextView) findViewById(R.id.year_est_detail);

        Intent teamIntent = getIntent();
        Team t = (Team) teamIntent.getSerializableExtra(Keys.TEAM);

        teamLogo.setImageResource(t.getLogoIDNum());
        teamName.setText(t.getTeamName());
        yearEstd.setText(t.getYearEst());
    }
}
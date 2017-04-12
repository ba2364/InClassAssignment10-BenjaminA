package com.ba2364.inclassassignment10_benjamina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Team> teams;
    private TeamAdapter teamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        teamAdapter = new TeamAdapter(teams, this);
        recyclerView.setAdapter(teamAdapter);
    }

    public void addRandomTeam(View view) {
        teams.add(getRandomTeam());
        teamAdapter.notifyDataSetChanged();   // this is important to inform the program that data has changed
    }

    private void initialData() {
        teams = new ArrayList<>();
        teams.add(new Team("New York Giants", "Established 1925", R.drawable.giants));
        teams.add(new Team("New York Mets", "Established 1962", R.drawable.mets));
        teams.add(new Team("New York Rangers", "Established 1926", R.drawable.rangers));
        teams.add(new Team("New York Knicks", "Established 1946", R.drawable.knicks));
        teams.add(new Team("New York Yankees", "Established 1903", R.drawable.yankees));
        teams.add(new Team("New York Islanders", "Established 1972", R.drawable.isles));
        teams.add(new Team("New Jersey Devils", "Established 1974", R.drawable.devils));
        teams.add(new Team("Brooklyn Nets", "Established 1967", R.drawable.nets));
        teams.add(new Team("New York Jets", "Established 1960", R.drawable.jets));
    }

    private Team getRandomTeam() {
        int num = (int) (Math.random() * 8);
        if (num == 0)
            return new Team("New York Giants", "Established 1925 ", R.drawable.giants);
        else if (num == 1)
            return new Team("New York Mets", "Established 1962 ", R.drawable.mets);
        else if (num == 2)
            return new Team("New York Rangers", "Established 1926", R.drawable.rangers);
        else if (num == 3)
            return new Team("New York Knicks", "Established 1946", R.drawable.knicks);
        else if (num == 4)
            return new Team("New York Yankees", "Established 1903", R.drawable.yankees);
        else if (num == 5)
            return new Team("New York Islanders", "Established 1972", R.drawable.isles);
        else if (num == 6)
            return new Team("New Jersey Devils", "Established 1974", R.drawable.devils);
        else if (num == 7)
            return new Team("Brooklyn Nets", "Established 1967", R.drawable.nets);
        else
            return new Team("New York Jets", "Established 1960", R.drawable.jets);
    }
}
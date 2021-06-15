package com.CompuderApps.boardfootcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;


// per Megan: create woody background



public class MainActivity extends AppCompatActivity {

    List<Project> projectList;


    @Override
    /**
     *
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvProjects = (RecyclerView)findViewById(R.id.project_list);

        ProjectsListAdapter adapter = new ProjectsListAdapter();

        rvProjects.setAdapter(adapter);
        rvProjects.setLayoutManager(new LinearLayoutManager(this));

        adapter.notifyDataSetChanged();
    }
}
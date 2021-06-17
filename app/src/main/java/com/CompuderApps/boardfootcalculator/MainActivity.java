package com.CompuderApps.boardfootcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;


// per Megan: create woody background


/**
 * <h1>Main Activity</h1>
 * Main activity/landing page of the app.
 *
 * @version alpha
 * @since 06/2021
 */
public class MainActivity extends AppCompatActivity {
    /** Main Activity Project List */
    List<Project> projectList;


    @Override
    /**
     * On create function. Initializes the activity when it is created.
     *
     * @version alpha
     * @since 06/2021
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
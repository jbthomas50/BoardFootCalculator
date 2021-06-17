package com.CompuderApps.boardfootcalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Parts Activity</h1>
 * Activity that shows the parts of a project.
 *
 * @version alpha
 * @since 06/2021
 */
public class PartsActivity extends AppCompatActivity {

    /** List of parts to be shown in the activity */
    List<Part> PartsList;

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

        RecyclerView rvParts = (RecyclerView) findViewById(R.id.part_list);

        PartsList = new ArrayList<Part>();
        // Create adapter passing in the sample user data
        PartsListAdapter adapter = new PartsListAdapter(PartsList);
        // Attach the adapter to the recyclerview to populate items
        rvParts.setAdapter(adapter);
        // Set layout manager to position the items
        rvParts.setLayoutManager(new LinearLayoutManager(this));

        adapter.notifyDataSetChanged();
    }
}



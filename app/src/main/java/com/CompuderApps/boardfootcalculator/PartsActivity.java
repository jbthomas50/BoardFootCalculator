package com.CompuderApps.boardfootcalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PartsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvParts = (RecyclerView) findViewById(R.id.part_list);

        List<Part> PartsList = new ArrayList<Part>();
        Part part = new Part("Top", 1, 1, 1, 1);
        Part part1 = new Part("Side", 10, 10, 10, 10);
        Part part2 = new Part("Bottom", 1000, 1000, 1000, 1000);
        Part part3 = new Part("Top", 10000, 10000, 10000, 10000);
        PartsList.add(part);
        PartsList.add(part1);
        PartsList.add(part2);
        PartsList.add(part3);
        // Create adapter passing in the sample user data
        PartsListAdapter adapter = new PartsListAdapter(PartsList);
        // Attach the adapter to the recyclerview to populate items
        rvParts.setAdapter(adapter);
        // Set layout manager to position the items
        rvParts.setLayoutManager(new LinearLayoutManager(this));

        adapter.notifyDataSetChanged();
    }
}



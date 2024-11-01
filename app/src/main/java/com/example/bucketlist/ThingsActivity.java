package com.example.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);

        RecyclerView list = findViewById(R.id.recycler_view_things);

        Item[] things = {
                new Item("Own a lambo", R.drawable.lamborghini),
                new Item("Own a plane", R.drawable.airplane),
                new Item("Be rich", R.drawable.gold),
                new Item("Be a coder", R.drawable.coder),
                new Item("Work at Google", R.drawable.google),
                new Item("Be successful", R.drawable.success)
        };
        ItemAdapter adapter = new ItemAdapter(things);
        list.setAdapter(adapter);
    }
}
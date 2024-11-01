package com.example.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        RecyclerView list = findViewById(R.id.recycler_view_places);

        Item[] places = {
                new Item("India", R.drawable.india),
                new Item("Japan", R.drawable.japan),
                new Item("Belgium", R.drawable.belgium),
                new Item("France", R.drawable.france),
                new Item("Germany", R.drawable.germany),
                new Item("Italy", R.drawable.italy),
                new Item("Spain", R.drawable.spain),
                new Item("United States", R.drawable.usa)
        };

        ItemAdapter adapter = new ItemAdapter(places);
        list.setAdapter(adapter);
    }
}
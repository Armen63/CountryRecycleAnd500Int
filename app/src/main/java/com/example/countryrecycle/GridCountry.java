package com.example.countryrecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.countryrecycle.adapter.CountryGridAdapter;

import static com.example.countryrecycle.LinearCountry.countries;

/**
 * Created by Armen on 5/5/2017.
 */

public class GridCountry extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CountryGridAdapter adapter;
    private GridLayoutManager gridLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler);

        recyclerView = (RecyclerView) findViewById(R.id.main_grid_rv);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new CountryGridAdapter(countries);
        recyclerView.setAdapter(adapter);
    }
}

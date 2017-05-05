package com.example.countryrecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.countryrecycle.adapter.CountryLinearAdapter;
import com.example.countryrecycle.model.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armen on 5/4/2017.
 */

public class LinearCountry extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CountryLinearAdapter adapter;
    static List<Country> countries;

    static {
        countries = new ArrayList<>();

        countries.add(new Country("Armenia", "an", false));
        countries.add(new Country("United Arab Emirates", "ae", false));
        countries.add(new Country("Afghanistan", "af", false));
        countries.add(new Country("Antigua and Barbuda", "ag", false));
        countries.add(new Country("Anguilla", "ai", false));
        countries.add(new Country("Albania ", "al", false));
        countries.add(new Country("Armenia", "am", false));
        countries.add(new Country("Antarctica", "aq", false));
        countries.add(new Country("Argentina", "ar", false));
        countries.add(new Country("American Samoa", "as", false));
        countries.add(new Country("Austria", "at", false));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recycler);


        recyclerView = (RecyclerView) findViewById(R.id.main_list_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new CountryLinearAdapter(countries);
        recyclerView.setAdapter(adapter);


    }
}

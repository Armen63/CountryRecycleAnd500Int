package com.example.countryrecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.countryrecycle.adapter.CountryLinearAdapter;
import com.example.countryrecycle.model.Country;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.example.countryrecycle.R.raw.countriesdb;

/**
 * Created by Armen on 5/4/2017.
 */

public class LinearCountry extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CountryLinearAdapter adapter;
    public static List<Country> countriesList = new ArrayList<>();
    InputStream inputStream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recycler);
        inputStream = getResources().openRawResource(countriesdb);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String cvsLine;
            int index = 0;
            while(( cvsLine = reader.readLine()) != null) {
                String[] strSpliter = cvsLine.split(",");
                try {
                    countriesList.add(index, new Country());

                    countriesList.get(index).setCode(strSpliter[0]);
                    countriesList.get(index).setName(strSpliter[1]);
                    index += 1;
                    Log.d("asdasdasdasd", countriesList.get(index - 1).getCode() + "  " + countriesList.get(index - 1).getName());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        recyclerView = (RecyclerView) findViewById(R.id.main_list_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new CountryLinearAdapter(countriesList);
        recyclerView.setAdapter(adapter);


    }
}


package com.example.countryrecycle.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.countryrecycle.R;
import com.example.countryrecycle.holder.CountryGridHolder;
import com.example.countryrecycle.model.Country;

import java.util.List;

/**
 * Created by Armen on 5/5/2017.
 */

public class CountryGridAdapter  extends  RecyclerView.Adapter<CountryGridHolder>  {
    private List<Country> data;

    public CountryGridAdapter(List<Country> data) {
        this.data = data;
    }


    @Override
    public CountryGridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_country_grid, parent, false);
        return new CountryGridHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryGridHolder holder, int position) {
        holder.bind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

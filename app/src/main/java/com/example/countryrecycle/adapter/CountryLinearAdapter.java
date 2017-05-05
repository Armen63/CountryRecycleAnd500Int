package com.example.countryrecycle.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.countryrecycle.holder.CountryLinearHolder;
import com.example.countryrecycle.R;
import com.example.countryrecycle.model.Country;

import java.util.List;

/**
 * Created by Armen on 5/4/2017.
 */

public class CountryLinearAdapter extends  RecyclerView.Adapter<CountryLinearHolder>  {

    private List<Country> data;

    public CountryLinearAdapter(List<Country> data) {
        this.data = data;
    }


    @Override
    public CountryLinearHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_country_linear, parent, false);
        return new CountryLinearHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryLinearHolder holder, int position) {
        holder.bind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

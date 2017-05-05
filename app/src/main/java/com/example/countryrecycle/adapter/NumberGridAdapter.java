package com.example.countryrecycle.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.countryrecycle.R;
import com.example.countryrecycle.holder.NumberGridHolder;

import java.util.List;

/**
 * Created by Armen on 5/4/2017.
 */

public class NumberGridAdapter  extends  RecyclerView.Adapter<NumberGridHolder> {

    private List<Integer> data;

    public NumberGridAdapter(List<Integer> data) {
        this.data = data;
    }

    @Override
    public NumberGridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.grid_numbers, parent, false);
        return new NumberGridHolder(view);
    }

    @Override
    public void onBindViewHolder(NumberGridHolder holder, int position) {
        holder.bind(data.get(position));
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}

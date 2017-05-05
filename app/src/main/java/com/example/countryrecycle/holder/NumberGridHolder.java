package com.example.countryrecycle.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.countryrecycle.R;

/**
 * Created by Armen on 5/4/2017.
 */

public class NumberGridHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public NumberGridHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.numberGrid);
    }
    public void bind(Integer index) {

        textView.setText(index.toString());

    }
}

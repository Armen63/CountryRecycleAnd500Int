package com.example.countryrecycle.holder;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.countryrecycle.MyApplication;
import com.example.countryrecycle.R;
import com.example.countryrecycle.model.Country;


public class CountryLinearHolder extends RecyclerView.ViewHolder {

    private ImageView icon;
    private TextView countryNameTV;
    private CheckBox checkBox;


    public CountryLinearHolder(View itemView) {
        super(itemView);
        icon = (ImageView) itemView.findViewById(R.id.item_list_country_image);
        countryNameTV = (TextView) itemView.findViewById(R.id.item_list_country_name);
        checkBox = (CheckBox) itemView.findViewById(R.id.item_list_country_check_box);
    }

    public void bind(Country country) {
        Context context = MyApplication.getContext();
        int resourceId = context.getResources().getIdentifier("s_flag_" + country.getCode(), "drawable", context.getPackageName());
        if (resourceId > 0) {
            icon.setImageResource(resourceId);
        }
        countryNameTV.setText(countryNameTV != null ? country.getName() : "");

        if (country.isSelected()) {
            checkBox.setChecked(true);
            countryNameTV.setTextColor(Color.RED);

        } else {
            checkBox.setChecked(false);
        }
    }
}

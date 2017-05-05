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

import static com.example.countryrecycle.R.drawable.flag_transparent;

/**
 * Created by Armen on 5/5/2017.
 */

public class CountryGridHolder extends RecyclerView.ViewHolder {
    private ImageView icon;
    private TextView nameTv;
    private CheckBox checkBox;


    public CountryGridHolder(View itemView) {
        super(itemView);
        icon = (ImageView) itemView.findViewById(R.id.item_grid_country_image);
        nameTv = (TextView) itemView.findViewById(R.id.item_grid_country_name);
        checkBox = (CheckBox) itemView.findViewById(R.id.item_grid_country_check_box);
    }

    public void bind(Country country) {
        Context context = MyApplication.getContext();
        int resourceId = context.getResources().getIdentifier("s_flag_" + country.getCode().toLowerCase(), "drawable", context.getPackageName());
        if (resourceId > 0) {
            icon.setImageResource(resourceId);
        }
        else {
            icon.setImageResource(flag_transparent);
        }
        nameTv.setText(nameTv != null ? country.getName() : "");

        if (country.isSelected()) {
            checkBox.setChecked(true);
            nameTv.setTextColor(Color.RED);

        } else {
            checkBox.setChecked(false);
        }
    }
}

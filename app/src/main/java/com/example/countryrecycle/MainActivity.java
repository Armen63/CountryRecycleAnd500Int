package com.example.countryrecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button grid, linear, numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = (Button) findViewById(R.id.startGrid);
        linear = (Button) findViewById(R.id.startLinear);
        numbers = (Button) findViewById(R.id.startGridNumbers);
        numbers.setOnClickListener(this);
        grid.setOnClickListener(this);
        linear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startGrid:
                Intent intent = new Intent(this, GridCountry.class);
                startActivity(intent);
                break;
            case R.id.startLinear:
                intent = new Intent(this, LinearCountry.class);
                startActivity(intent);
                break;
            case R.id.startGridNumbers:
                intent = new Intent(this, GridNumbers.class);
                startActivity(intent);
                break;
        }
    }
}

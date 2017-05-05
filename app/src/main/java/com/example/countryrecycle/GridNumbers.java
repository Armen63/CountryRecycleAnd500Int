package com.example.countryrecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.countryrecycle.adapter.NumberGridAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armen on 5/4/2017.
 */

public class GridNumbers extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView recyclerView;
    private NumberGridAdapter adapter;
    private GridLayoutManager gridLayoutManager;
    private Button scrollDown, scrollUp;


    static List<Integer> numbers;

    static {
        numbers = new ArrayList<>();
        for (int i = 1; i < 501; i++) {
            numbers.add(i);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_numbers);
        scrollDown= (Button) findViewById(R.id.scrollDown);
        scrollUp = (Button) findViewById(R.id.scrollUp);

        recyclerView = (RecyclerView) findViewById(R.id.main_grid_rv_numbers);
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new NumberGridAdapter(numbers);
        recyclerView.setAdapter(adapter);
        scrollDown.setOnClickListener(this);
        scrollUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.scrollDown:
                recyclerView.smoothScrollBy(0, 2000);
                if(scrollUp.getVisibility() == View.GONE){
                    scrollUp.setVisibility(View.VISIBLE);
                }
                if(gridLayoutManager.findLastCompletelyVisibleItemPosition()==numbers.size()-1){
                    scrollDown.setVisibility(View.GONE);
                }
                break;
            case R.id.scrollUp:
                recyclerView.smoothScrollBy(0, -1000);
                if(scrollDown.getVisibility() == View.GONE){
                    scrollDown.setVisibility(View.VISIBLE);
                }
                if(gridLayoutManager.findFirstCompletelyVisibleItemPosition()==0)
                    scrollUp.setVisibility(View.GONE);
                break;
        }
    }
}

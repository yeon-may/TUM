package com.lightidea.tum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class years_activity extends AppCompatActivity {
    private List<CarRecyclerViewItem> carItemList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years_activity);
        setTitle("Information Technology");
        initializeCarItemList();


        // Create the recyclerview.
        RecyclerView carRecyclerView = (RecyclerView)findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        // Set layout manager.
        carRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        CarRecyclerViewDataAdapter carDataAdapter = new CarRecyclerViewDataAdapter(carItemList);
        // Set data adapter.
        carRecyclerView.setAdapter(carDataAdapter);
    }
    

    /* Initialise car items in list. */
    private void initializeCarItemList()
    {

            carItemList = new ArrayList<CarRecyclerViewItem>();
            carItemList.add(new CarRecyclerViewItem("First Year", R.drawable.it));
            carItemList.add(new CarRecyclerViewItem("Second Year", R.drawable.it));
            carItemList.add(new CarRecyclerViewItem("Third Year", R.drawable.it));
            carItemList.add(new CarRecyclerViewItem("Fourth Year", R.drawable.it));
            carItemList.add(new CarRecyclerViewItem("Fifth Year", R.drawable.it));
            carItemList.add(new CarRecyclerViewItem("Sixth Year", R.drawable.it));
    }
    public void OpenYearActivity(){
        Intent intent= new Intent(years_activity.this, FirstYearActivity.class);
        startActivity(intent);
    }

}
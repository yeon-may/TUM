package com.lightidea.tum;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.lightidea.tum.CarRecyclerViewItem;
import com.lightidea.tum.CarRecyclerViewItemHolder;

import java.util.List;

/**
 * Created by Jerry on 3/17/2018.
 */

public class CarRecyclerViewDataAdapter extends RecyclerView.Adapter<CarRecyclerViewItemHolder> {

    private List<CarRecyclerViewItem> carItemList;

    public CarRecyclerViewDataAdapter(List<CarRecyclerViewItem> carItemList) {
        this.carItemList = carItemList;
    }

    @Override
    public CarRecyclerViewItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get LayoutInflater object.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the RecyclerView item layout xml.
        View carItemView = layoutInflater.inflate(R.layout.activity_card_view_item, parent, false);

        // Get car title text view object.
        final TextView carTitleView = (TextView)carItemView.findViewById(R.id.card_view_image_title);
        // Get car image view object.
        final ImageView carImageView = (ImageView)carItemView.findViewById(R.id.card_view_image);
        // When click the image.
        carImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get car title text.
                String carTitle = carTitleView.getText().toString();
                // Create a snackbar and show it.
                Snackbar snackbar = Snackbar.make(carImageView, "You click " + carTitle +" image", Snackbar.LENGTH_LONG);
                snackbar.show();
                if (carTitle== "First Year")
                { Intent intent = new Intent(v.getContext(),FirstYearActivity.class);
                v.getContext().startActivity(intent); }
                if (carTitle== "Second Year")
                { Intent intent = new Intent(v.getContext(),SecondYearActivity.class);
                    v.getContext().startActivity(intent); }
                if (carTitle== "Third Year")
                { Intent intent = new Intent(v.getContext(),ThirdYearActivity.class);
                    v.getContext().startActivity(intent); }
                if (carTitle== "Fourth Year")
                { Intent intent = new Intent(v.getContext(),FourthYearActivity.class);
                    v.getContext().startActivity(intent); }
                if (carTitle== "Fifth Year")
                { Intent intent = new Intent(v.getContext(),FifthYearActivity.class);
                    v.getContext().startActivity(intent); }
                if (carTitle== "Sixth Year")
                { Intent intent = new Intent(v.getContext(),SixthYearActivity.class);
                    v.getContext().startActivity(intent); }
            }


        });

       
        // Create and return our custom Car Recycler View Item Holder object.
        CarRecyclerViewItemHolder ret = new CarRecyclerViewItemHolder(carItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(CarRecyclerViewItemHolder holder, int position) {
        if(carItemList!=null) {
            // Get car item dto in list.
            CarRecyclerViewItem carItem = carItemList.get(position);

            if(carItem != null) {
                // Set car item title.
                holder.getCarTitleText().setText(carItem.getCarName());
                // Set car image resource id.
                holder.getCarImageView().setImageResource(carItem.getCarImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if(carItemList!=null)
        {
            ret = carItemList.size();
        }
        return ret;
    }
}
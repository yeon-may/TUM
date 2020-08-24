package com.lightidea.tum;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


/**
 * Created by Jerry on 3/17/2018.
 */

public class CarRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private TextView carTitleText = null;

    private ImageView carImageView = null;

    public CarRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            carTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

            carImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getCarTitleText() {
        return carTitleText;
    }

    public ImageView getCarImageView() {
        return carImageView;
    }
}


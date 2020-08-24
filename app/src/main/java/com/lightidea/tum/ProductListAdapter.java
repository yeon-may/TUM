package com.lightidea.tum;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {

    private Context context;
    private List<Product> products;

    public ProductListAdapter(Context context, List<Product> products) {
        super(context, R.layout.product_list_layout, products);
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.product_list_layout, parent, false);
            viewHolder.textViewName = view.findViewById(R.id.textViewName);
            viewHolder.imageViewPhoto = view.findViewById(R.id.imageViewPhoto);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Product product = products.get(position);
        viewHolder.textViewName.setText(product.getName());
        viewHolder.imageViewPhoto.setImageResource(product.getPhoto());
        return view;
    }

    private static class ViewHolder {
        public static TextView textViewName;
        public static ImageView imageViewPhoto;
    }

}

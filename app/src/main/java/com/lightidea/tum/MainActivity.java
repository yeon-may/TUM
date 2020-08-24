package com.lightidea.tum;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void initView() {
        listViewProduct = findViewById(R.id.listViewProduct);
        listViewProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listViewProduct_onItemClick(adapterView, view, i, l);
            }
        });
    }

    private void loadData() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("p01", "Information Technology", R.drawable.it));
        products.add(new Product("p02", "Architecture", R.drawable.archi));
        products.add(new Product("p03", "Electronics",  R.drawable.ec));
        products.add(new Product("p04", "Electrical Power", R.drawable.ep));
        products.add(new Product("p05", "Mechanical",  R.drawable.mechanical));
        products.add(new Product("p06", "Mechatronics",  R.drawable.mechatronic));
        products.add(new Product("p03", "Civil",  R.drawable.civil));
        products.add(new Product("p04", "Chemical", R.drawable.chemical));
        products.add(new Product("p05", "Petroleum",  R.drawable.petroleum));
        products.add(new Product("p06", "Mining",  R.drawable.mining));
        ProductListAdapter productListAdapter = new ProductListAdapter(getApplicationContext(), products);
        listViewProduct.setAdapter(productListAdapter);
    }

    private void listViewProduct_onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Product product = (Product) adapterView.getItemAtPosition(i);
        String id=product.getId();
        if(product.getId().toString().equals("p01"))
        { Intent intent=new Intent(MainActivity.this,years_activity.class);
        startActivity(intent);
        }
        else
        Toast.makeText(getApplicationContext(), product.getName(), Toast.LENGTH_LONG).show();
    }


}
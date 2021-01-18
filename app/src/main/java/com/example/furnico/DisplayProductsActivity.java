package com.example.furnico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furnico.RecycleClasses.TotalProductInformation;
import com.example.furnico.adapter.RecyclerViewDisplayAdapter;

import java.util.ArrayList;
import java.util.List;

public class DisplayProductsActivity extends AppCompatActivity implements  RecyclerViewDisplayAdapter.UserDataInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_products);


        List<TotalProductInformation> userDataList = new ArrayList<>();
        generateUserData(userDataList);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerView_display_products);
        RecyclerViewDisplayAdapter recyclerViewAdapter1 = new RecyclerViewDisplayAdapter(userDataList, DisplayProductsActivity.this);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(recyclerViewAdapter1);

        findViewById(R.id.ibt_display_products_homepagecart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisplayProductsActivity.this,CartActivity.class));
            }
        });
        findViewById(R.id.ibt_display_products_homepagemenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisplayProductsActivity.this,AccountOptions.class));
            }
        });
    }
    private void generateUserData(List<TotalProductInformation> userDataList) {
        userDataList.add(new TotalProductInformation("Sofas",18500,"Fiona 2 Seater Wooden Sofa","https://ii2.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa-in-gree-8ztdz2.jpg"));
        userDataList.add(new TotalProductInformation("Sofas",18400,"Celene 2 Seater Wooden Sofa","https://ii3.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-safari-brown-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa--olb0my.jpg"));
        userDataList.add(new TotalProductInformation("Sofas",31700,"Madison 2 Seater Sofa","https://ii1.pepperfry.com/media/catalog/product/j/a/236x260/jazmin-1-seater-sofa-in-dark-grey-colour-with-brown-oak-finish-by-casacraft-jazmin-1-seater-sofa-in--e1e1er.jpg"));
        userDataList.add(new TotalProductInformation("Sofas",21400,"Bali 3 Seater Sofa","https://ii2.pepperfry.com/media/catalog/product/j/a/568x284/jazmin-2-seater-sofa-in-dark-grey-colour-with-brown-oak-finish-by-casacraft-jazmin-2-seater-sofa-in--0mnd40.jpg"));

    }

    @Override
    public void onUserClick(TotalProductInformation product) {
        Intent intent = new Intent(DisplayProductsActivity.this,ProductActivity2.class);
        startActivity(intent);
//        Toast.makeText(this, "Image Clicked for" + product.getName() , Toast.LENGTH_SHORT).show();
    }
}
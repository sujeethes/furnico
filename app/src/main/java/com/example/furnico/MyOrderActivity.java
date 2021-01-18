package com.example.furnico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furnico.RecycleClasses.ProductInfo;
import com.example.furnico.adapter.RecyclerViewMyOrderAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyOrderActivity extends AppCompatActivity implements  RecyclerViewMyOrderAdapter.UserDataInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorder);
        List<ProductInfo> userDataList = new ArrayList<>();
        generateUserData(userDataList);
        RecyclerView recyclerView = findViewById(R.id.recyclerView_mainorder);
        RecyclerViewMyOrderAdapter recyclerViewAdapter = new RecyclerViewMyOrderAdapter(userDataList,  MyOrderActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
        findViewById(R.id.ibt_mainorder_homepagecart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyOrderActivity.this,CartActivity.class));
            }
        });
        findViewById(R.id.ibt_mainorder_homepagemenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyOrderActivity.this,AccountOptions.class));
            }
        });
    }

    @Override
    public void onUserClick( ProductInfo productInfo) {
        Intent intent = new Intent(MyOrderActivity.this,ProductActivity2.class);
        startActivity(intent);
        //Toast.makeText(this, "Image Clicked for" + productInfo.getProductName(), Toast.LENGTH_SHORT).show();
    }
    private void generateUserData(List<ProductInfo> userDataList) {
        userDataList.add(new ProductInfo("This is the product u have added to category","The category and description of the product is this","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg"));
        userDataList.add(new ProductInfo("This is the product u have added to category","The category and description of the product is this","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg"));

        userDataList.add(new ProductInfo("This is the product u have added to category","The category and description of the product is this","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg"));
        userDataList.add(new ProductInfo("This is the product u have added to category","The category and description of the product is this","https://kinsta.com/wp-content/uploads/2019/08/jpg-vs-jpeg.jpg"));


    }

}
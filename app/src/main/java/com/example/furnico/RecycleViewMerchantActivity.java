package com.example.furnico;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furnico.RecycleClasses.MerchantClass;
import com.example.furnico.adapter.RecyclerViewMerchantAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewMerchantActivity extends AppCompatActivity implements  RecyclerViewMerchantAdapter.UserDataInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_merchant);
        List<MerchantClass> userDataList = new ArrayList<>();
        generateUserData(userDataList);
        RecyclerView recyclerView = findViewById(R.id.recycle_view_merchant);
        RecyclerViewMerchantAdapter recyclerViewAdapter = new RecyclerViewMerchantAdapter(userDataList,  RecycleViewMerchantActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    private void generateUserData(List<MerchantClass> userDataList) {
        userDataList.add(new MerchantClass("sujeeth1","5","0 rs"));
        userDataList.add(new MerchantClass("sujeeth1","4","0 rs"));
        userDataList.add(new MerchantClass("sujeeth1","5","0 rs"));
        userDataList.add(new MerchantClass("sujeeth1","2","100 rs"));

    }

    @Override
    public void onUserClick(MerchantClass merchant) {
        Toast.makeText(this, "Image Clicked for" + merchant.getMerchantName(), Toast.LENGTH_SHORT).show();
    }
}
package com.example.furnico.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.example.furnico.DisplayProductsActivity;
import com.example.furnico.R;
import com.example.furnico.RecycleClasses.TotalProductInformation;

import java.util.List;

public class RecyclerViewDisplayAdapter extends RecyclerView.Adapter<RecyclerViewDisplayAdapter.ViewHolder> {
    private final List<TotalProductInformation> mUserDataList;
    private final DisplayProductsActivity displayProductsActivity;

    public RecyclerViewDisplayAdapter(List<TotalProductInformation> mUserDataList, DisplayProductsActivity displayProductsActivity) {
        this.mUserDataList = mUserDataList;
        this.displayProductsActivity = displayProductsActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.myproducts, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TotalProductInformation userData = mUserDataList.get(position);
        holder.tvProductName.setText(userData.getName());
        holder.tvCategory.setText(userData.getCategory());
        holder.tvprice.setText("INR "+userData.getBestPrice());
        Glide.with(holder.ivImage.getContext()).load(userData.getImage()).into(holder.ivImage);
        holder.rootView.setOnClickListener((view ->displayProductsActivity.onUserClick(userData)));

    }
    public interface UserDataInterface {
        void onUserClick(TotalProductInformation totalProductInformation);
    }

    @Override
    public int getItemCount() {
        return mUserDataList.size();

    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvProductName;
        private final TextView tvCategory;
        private final TextView tvprice;
        private final View rootView;
        private final ImageView ivImage;
        private final Button button;

        public ViewHolder(View view) {
            super(view);
            rootView = view;
            tvProductName = view.findViewById(R.id.tv_myproducts_productName);
            tvCategory= view.findViewById(R.id.tv_myproducts_cartItemCategory);
            tvprice= view.findViewById(R.id.tv_myproducts_price);
            ivImage = view.findViewById(R.id.iv_myproducts);
            button=view.findViewById(R.id.btn_myproducts_addcart);
        }
    }
}

package com.example.furnico.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.furnico.CartActivity;
import com.example.furnico.R;
import com.example.furnico.RecycleClasses.TotalProductInformation;


import java.util.List;

public class RecyclerViewCartAdapter  extends RecyclerView.Adapter<RecyclerViewCartAdapter.ViewHolder> {

    private final List<TotalProductInformation> mUserDataList;
    private final CartActivity cartActivity;

    public RecyclerViewCartAdapter(List<TotalProductInformation> mUserDataList, CartActivity cartActivity) {
        this.mUserDataList = mUserDataList;
        this.cartActivity = cartActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cartcard, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TotalProductInformation userData = mUserDataList.get(position);
        holder.tvProductName.setText(userData.getName());
        holder.tvCategory.setText(userData.getCategory());
        holder.tvprice.setText("INR "+userData.getBestPrice());
        Glide.with(holder.ivImage.getContext()).load(userData.getImage()).into(holder.ivImage);
        holder.rootView.setOnClickListener((view ->cartActivity.onUserClick(userData)));
        holder.btincrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.etQuantity.setText(String.valueOf(Integer.parseInt(holder.etQuantity.getText().toString()) + 1));


            }
        });
        holder.btdecryment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(holder.etQuantity.getText().toString())==0){
                    //Delete Cart API Call :

                }
                else{
                    holder.etQuantity.setText(String.valueOf(Integer.parseInt(holder.etQuantity.getText().toString()) - 1));
                }
            }
        });

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
        private final Button btincrement;
        private final Button btdecryment;
        private final EditText etQuantity;

        public ViewHolder(View view) {
            super(view);
            rootView = view;
            tvProductName = view.findViewById(R.id.tv_cartproduct_productName);
            tvCategory= view.findViewById(R.id.tv_mycart_cartItemCategory);
            tvprice= view.findViewById(R.id.tv_mycart_price);
            ivImage = view.findViewById(R.id.iv_cartproduct);
            btincrement=view.findViewById(R.id.btn_increment);
            btdecryment=view.findViewById(R.id.btn_decryment);
            etQuantity = view.findViewById(R.id.et_quantity);
        }
    }
}


package com.example.furnico.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furnico.R;
import com.example.furnico.RecycleClasses.MerchantClass;
import com.example.furnico.RecycleViewMerchantActivity;

import java.util.List;

public class RecyclerViewMerchantAdapter extends RecyclerView.Adapter<RecyclerViewMerchantAdapter.ViewHolder> {
    private final List<MerchantClass> mUserDataList;
    private final RecycleViewMerchantActivity recycleViewMerchantActivity;

    public RecyclerViewMerchantAdapter(List<MerchantClass> mUserDataList, RecycleViewMerchantActivity recycleViewMerchantActivity) {
        this.mUserDataList = mUserDataList;
        this.recycleViewMerchantActivity = recycleViewMerchantActivity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_merchant_rating, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MerchantClass userData = mUserDataList.get(position);
        holder.tvName.setText(userData.getMerchantName());
        holder.tvRate.setText(userData.getRating());
        holder.tvPrice.setText(userData.getPrice());
        holder.rootView.setOnClickListener((view -> recycleViewMerchantActivity.onUserClick(userData)));
    }


    @Override
    public int getItemCount() {
        return mUserDataList.size();
    }


    public interface UserDataInterface {
        void onUserClick(MerchantClass merchant);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvName;
        private final TextView tvRate;
        private final View rootView;
        private final TextView tvPrice;

        public ViewHolder(View view) {
            super(view);
            rootView = view;
            tvName = view.findViewById(R.id.tv_merchantCard_merchantName);
            tvRate = view.findViewById(R.id.tv_merchantCard_rating);
            tvPrice = view.findViewById(R.id.tv_merchantCard_amouuntTobeAdded);
        }
    }
}

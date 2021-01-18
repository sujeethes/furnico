package com.example.furnico;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OrderPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_payment);
        Button animation=findViewById(R.id.bt_activity_order_pay);
//        animation.setOnClickListener(new View.OnClickListener(){

//            public void onClick(View v){
//                ImageView img = (ImageView)findViewById(R.id.animation);
//                img.setBackgroundResource(R.drawable.basha);
//                frame=(AnimationDrawable) img.getBackground();
//                frame.start();
//            }
//        });
    }
}
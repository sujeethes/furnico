package com.example.furnico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountOptions extends AppCompatActivity {
//Change in FIle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_options);
        findViewById(R.id.bt_my_details).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountOptions.this,UserDetails.class));
            }
        });
        findViewById(R.id.bt_my_orders).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountOptions.this,MyOrderActivity.class));
            }
        });
        findViewById(R.id.bt_activity_options_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),LoginActivity.class));

            }
        });

        findViewById(R.id.bt_activity_options_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(AccountOptions.this); //Home is name of the activity
                builder.setMessage("Do you want to exit?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        Intent intent=new Intent();
                        intent.putExtra("finish", true);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // To clean up all activities
                        //startActivity(i);
                        finish();
                    }
                });
                builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert=builder.create();
                alert.show();

            }
        });


    }
}
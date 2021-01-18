package com.example.furnico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ProductActivity2 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product2);
        imageView=(ImageView) findViewById(R.id.img_productImage);
        Glide.with(this).load("https://ii2.pepperfry.com/media/catalog/product/j/a/568x284/jazmin-2-seater-sofa-in-dark-grey-colour-with-brown-oak-finish-by-casacraft-jazmin-2-seater-sofa-in--0mnd40.jpg").into(imageView);

        SearchView sv=findViewById(R.id.product_search);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent=new Intent(com.example.furnico.ProductActivity2.this,DisplayProductsActivity.class);
                intent.putExtra("query",query);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        findViewById(R.id.ibt_product_home_page_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductActivity2.this,CartActivity.class));
            }
        });
        findViewById(R.id.ibt_product_home_page_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductActivity2.this,AccountOptions.class));
            }
        });
    }
}
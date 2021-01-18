package com.example.furnico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageSlider imageSlider = findViewById(R.id.s_activity_main_slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://ii2.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa-in-gree-8ztdz2.jpg"));
        slideModels.add(new SlideModel("https://ii3.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-safari-brown-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa--olb0my.jpg"));
        imageSlider.setImageList(slideModels,true);
        SearchView sv=findViewById(R.id.sv_activity_main_search);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent=new Intent(MainActivity.this,DisplayProductsActivity.class);
                intent.putExtra("query",query);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        ImageButton homenavigation=findViewById(R.id.bt_home_page_menu);
        homenavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AccountOptions.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.ibt_home_page_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CartActivity.class));
            }
        });

    }
}
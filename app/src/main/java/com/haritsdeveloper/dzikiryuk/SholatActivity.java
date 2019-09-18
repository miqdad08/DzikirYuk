package com.haritsdeveloper.dzikiryuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class SholatActivity extends AppCompatActivity  {

    private int[] mImages = new int[]{
            R.drawable.takbir, R.drawable.tasbih, R.drawable.tahmid
    };

    private String[] mImageTitle = new String[]{
            ".", ".", "."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);

            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(SholatActivity.this, mImageTitle[position], Toast.LENGTH_SHORT).show();
            }
        });


    }


    public void Tasbih(View view) {
        startActivity(new Intent(SholatActivity.this,TasbihActivity.class));
    }

    public void Tahmid(View view) {
        startActivity(new Intent(SholatActivity.this,TahmidActivity.class));
    }

    public void Takbir(View view) {
        startActivity(new Intent(SholatActivity.this,TakbirActivity.class));
    }
}


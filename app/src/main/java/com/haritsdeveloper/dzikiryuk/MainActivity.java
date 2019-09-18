package com.haritsdeveloper.dzikiryuk;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    Button button;

    private int[] mImages = new int[]{
            R.drawable.matahari,R.drawable.dzikirrgambar,R.drawable.masjidd,R.drawable.doangambar
    };
    private String[]mImagesTitle = new String[]{
            "gambar", "gambar", "gambar","gambar","gambar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnAbout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AboutActivity.class));
            }
        });

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
                Toast.makeText(MainActivity.this,mImagesTitle[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void pagi(View view) {
        startActivity(new Intent(MainActivity.this,pagiActivity.class));
    }

    public void petang(View view) {
        startActivity(new Intent(MainActivity.this,PetangActivity.class));
    }

    public void sehari(View view) {
        startActivity(new Intent(MainActivity.this,SehariActivity.class));
    }

    public void Sholat(View view) {
        startActivity(new Intent(MainActivity.this,SholatActivity.class));
    }


   /* ini adalah localicasion*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemLanguage:
                startActivity(new Intent(Settings.ACTION_LOCALE_SETTINGS));
        }
        return super.onOptionsItemSelected(item);
    }
}

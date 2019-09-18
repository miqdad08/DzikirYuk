package com.haritsdeveloper.dzikiryuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TakbirActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvmain;
    Button btndzikir;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takbir);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tvmain = findViewById(R.id.tvmain);
        btndzikir = findViewById(R.id.btndzikir);
        tvmain.setOnClickListener(this);
        btndzikir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btndzikir:
                nilai = nilai + 1;
                tvmain.setText(String.valueOf(nilai));
                if (nilai==33){
                    startActivity(new Intent(TakbirActivity.this, SholatActivity.class));
                }

        }


    }
}


package com.haritsdeveloper.dzikiryuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TahmidActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvmain;
    Button btndzikir;

    int nilai = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmid);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tvmain = findViewById(R.id.tvmain3);
        btndzikir = findViewById(R.id.btndzikir3);
        tvmain.setOnClickListener(this);
        btndzikir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btndzikir3:
                nilai = nilai + 1;
                tvmain.setText(String.valueOf(nilai));
                if (nilai == 33) {
                    Toast.makeText(this, "pindah ke Berikutnya", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(TahmidActivity.this, SholatActivity.class));
                }

        }
    }
}

package com.haritsdeveloper.dzikiryuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SehariActivity extends AppCompatActivity {

    String [] idmenu = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15"
    };

    String[] menuItem = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""



    };

    String[] menuLagi = {
            "1. Doa Sebelum Makan",
            "2. Doa Sesudah Makan",
            "3. Doa Sesudah  Minum",
            "4. Doa Ketika Makan Lupa Membaca Doa",
            "5. Doa Sebelum Tidur",
            "6. Doa Ketika Mimpi Buruk",
            "7. Doa Bangun Tidur",
            "8. Doa Memakai Baju/Pakaian",
            "9. Doa Memakai baju baru",
            "10. Mendoakan Orang yang Memakai Baju Baju",
            "11. Doa Ketika Melepas Baju",
            "12. Doa masuk WC",
            "13. Doa Keluar WC",
            "14. Dzikir Sebelum Wudu",
            "15. Dzikir Setelah Selesai Whudu"



    };
    TextView arab, artinya;
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sehari);

        arab = findViewById(R.id.arab);
        artinya = findViewById(R.id.artinya);

        CostumListAdapter adapter = new CostumListAdapter(this, menuItem, menuLagi);
        listView = (ListView) findViewById(R.id.listviewSehari);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(SehariActivity.this, detail_doaActivity.class)
                        .putExtra("KEY_MENU", idmenu[position]));



            }
        });

    }
}

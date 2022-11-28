package com.example.bktra3_pheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvXeCon;
    ArrayList<PhepTinh> arrayXeCon;
    PhepTinhAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new PhepTinhAdapter(this, R.layout.dong_phep_tinh, arrayXeCon);
        lvXeCon.setAdapter(adapter);

        lvXeCon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetaiPlus.class);
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        lvXeCon = (ListView) findViewById(R.id.listviewTraiCay);
        arrayXeCon = new ArrayList<>();
        arrayXeCon.add(new PhepTinh("Phép Cộng", R.drawable.ic_plus));
        arrayXeCon.add(new PhepTinh("Phép Trừ", R.drawable.ic_minius));
        arrayXeCon.add(new PhepTinh("Phép Nhân", R.drawable.ic_multi));
        arrayXeCon.add(new PhepTinh("Phép Chia", R.drawable.devide));
        arrayXeCon.add(new PhepTinh("Logarit", R.drawable.logarit));
    }

}
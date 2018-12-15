package com.gzeinnumer.zeinbelajar4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.zip.DataFormatException;

public class MainActivity extends AppCompatActivity {
    Button btnMasuk,btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//layout yang dipakai
        btnMasuk = (Button)findViewById(R.id.btnMasuk);
        btnDaftar = (Button)findViewById(R.id.btnDaftar);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masuk = new Intent(getApplicationContext(),MasukActivity.class);//class yang akan dipakai
                startActivity(masuk);
            }
        });
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar = new Intent(getApplicationContext(),RegisterActivity.class);//memanggil class baru
                startActivity(daftar);
            }
        });
    }
}

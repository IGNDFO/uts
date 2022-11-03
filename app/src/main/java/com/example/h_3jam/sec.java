package com.example.h_3jam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sec extends AppCompatActivity {
TextView nama1;
TextView no1;
TextView sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        getSupportActionBar().setTitle("selamat bergabung ");
        no1=findViewById(R.id.no1);
        nama1=findViewById(R.id.nama1);
        sp=findViewById(R.id.sp);

        Intent terima = getIntent();
        Intent terima1 =getIntent();
        Intent terima2 = getIntent();


        String ynomor= terima1.getStringExtra("xno");
        String ynama = terima.getStringExtra("xnama");
        String ysp = terima2.getStringExtra("xsp");


        nama1.setText(ynama);
        no1.setText(ynomor);
        sp.setText(ysp);
    }
}
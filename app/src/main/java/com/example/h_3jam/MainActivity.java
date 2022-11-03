package com.example.h_3jam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button pindah;
EditText nama;
EditText no;
Spinner spinner;
CheckBox cek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("hello");

        pindah=findViewById(R.id.pindah);
        nama=findViewById(R.id.nama);
        no=findViewById(R.id.no);
        spinner=findViewById(R.id.spinner);
        cek = findViewById(R.id.cek);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name,nomor2,spinner1;
                boolean cek1;

name = nama.getText().toString();
 nomor2 = no.getText().toString();
 spinner1 = spinner.getSelectedItem().toString();
 cek1 = cek.isChecked();






if(name.trim().equals("")){
    nama.setError("MASUKAN NAMA");
}

else if (nomor2.trim().equals("")){
    no.setError("MASUKAN NOMOR PENDAFTARAN");
}

else if (spinner1.trim().isEmpty() || spinner1.equals("pilih")) {
    Toast.makeText(MainActivity.this, "Mohon Pilih Jalur Pendaftaran Yang Tersedia !!!", Toast.LENGTH_SHORT).show();
}
else if(cek1 != true)
{
    Toast.makeText(MainActivity.this, "Mohon Centang Untuk Konfirmasi", Toast.LENGTH_SHORT).show();
}
else
 {


    Intent a = new Intent(MainActivity.this, sec.class);
    a.putExtra("xno",nomor2);
    a.putExtra("xnama",name);
    a.putExtra("xsp",spinner1);

    Toast.makeText(MainActivity.this, "SELAMAT ANDA TELAH TERDAFTAR", Toast.LENGTH_SHORT).show();
    startActivity(a);

}
            }
        });
    }
}
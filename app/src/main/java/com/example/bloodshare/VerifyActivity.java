package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Tanggal Pengerjaan: 1 Mei 2021
//Deskripsi Pengerjaan:
//Nim: 10118048
//Nama: Niko Yama
//Kelas: IF-2
public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Button btnVerify = findViewById(R.id.btn_send);
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);}
        });
    }
}
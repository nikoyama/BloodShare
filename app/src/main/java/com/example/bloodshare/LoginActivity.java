package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Tanggal Pengerjaan: 1 Mei 2021
//Deskripsi Pengerjaan:
//Nim: 10118048
//Nama: Niko Yama
//Kelas: IF-2
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click
        TextView txtRegister = findViewById(R.id.txt_register);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RegisterActivity.class);
                startActivity(intent);}
        });
    }
}
package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    // mendeklarasikan
    private Button btnBagikan, btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // inisialisasi
        btnBagikan = findViewById(R.id.btnBagikan);
        btnKembali = findViewById(R.id.btnKembali);

        // button kembali
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembaliIntent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(kembaliIntent);
            }
        });

        // button bagikan
        btnBagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bagikanIntent = new Intent();
                bagikanIntent.setAction(Intent.ACTION_SEND);
                bagikanIntent.putExtra(Intent.EXTRA_TEXT, "Anda membagikan gambar");
                bagikanIntent.setType("image/*");
                startActivity(bagikanIntent);
            }
        });
    }
}
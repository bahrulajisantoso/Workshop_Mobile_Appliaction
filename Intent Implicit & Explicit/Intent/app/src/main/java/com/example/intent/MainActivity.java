package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // mendeklarasikan
    private Button btnBagikan, btnLanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi
        btnBagikan = findViewById(R.id.btnBagikan);
        btnLanjut = findViewById(R.id.btnLanjut);

        // button lanjut
        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanjutIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(lanjutIntent);
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
package com.example.recyclerviewdatamovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        objMovies.add(new Movies("Malam Minggu Miko", "Drama, Comedy", "Raditya Dika", 7.3,
                "Malam Minggu Miko The Movie adalah film drama Indonesia yang dirilis pada 2014. " +
                        "Film ini diangkat dari seri web berjudul sama karya Raditya Dika. " +
                        "Film ini disutradarai oleh Raditya Dika dan dibintangi oleh Raditya Dika, Ryan Adriandhy, Andovi da Lopez, " +
                        "Hadian Saputra, Henky Solaiman, Mentari de Marelle, Sheila Dara Aisha, dan masih banyak lagi.", "11 September 2014"));

        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
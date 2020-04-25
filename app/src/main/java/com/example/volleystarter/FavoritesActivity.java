package com.example.volleystarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FavoritesActivity extends AppCompatActivity {

    ListView favoritesLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        favoritesLV = findViewById(R.id.FavoritesListView);
    }
}

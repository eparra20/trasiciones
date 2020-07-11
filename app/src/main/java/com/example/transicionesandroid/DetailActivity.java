package com.example.transicionesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.daImageView);
        imageView.setTransitionName(MainActivity.TRANSICION_DE_GATITO);

        getWindow().setEnterTransition(TransitionUtil.getFade());

    }
}

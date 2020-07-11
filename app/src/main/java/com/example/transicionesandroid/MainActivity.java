package com.example.transicionesandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;

//import androidx.core.app.ActivityOptionsCompat;

public class MainActivity extends AppCompatActivity {

    public static final String TRANSICION_DE_GATITO = "TRANSICION_DE_GATITO";
    private Button buttonIr;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIr = findViewById(R.id.buttonIr);

        imageView = findViewById(R.id.maImageView);
        imageView.setTransitionName(TRANSICION_DE_GATITO);

        buttonIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                getWindow().setExitTransition(TransitionUtil.getSlide());

                //Pair<ImageView, String> pair = Pair.create(imageView, ViewCompat.getTransitionName(imageView));
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, Pair.<View, String>create(imageView, ViewCompat.getTransitionName(imageView)));

                startActivity(intent,optionsCompat.toBundle());
            }
        });

    }



}

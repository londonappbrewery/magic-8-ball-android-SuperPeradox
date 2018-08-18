package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightball = (ImageView) findViewById(R.id.image_getball);

        final int[] ballArray = new int[] {
                R.drawable.you,
                R.drawable.buity,
                R.drawable.burg,
                R.drawable.face,
                R.drawable.insta,
                R.drawable.ream,
                R.drawable.andro,
        };

        Button Ballbutton = findViewById(R.id.button_ask);

        Ballbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNuberGenrater = new Random();

                int number = randomNuberGenrater.nextInt(7);

                //int imageResource = ballArray[number];

                eightball.setImageResource(ballArray[number]);
            }
        });


    }
}

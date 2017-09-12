package com.grademojo.forex_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.grademojo.forex.R;


public class Main3Activity extends AppCompatActivity {

    private View city_view;
    private ImageView person_image;


    private CardView cardView_create_profile;

    private TextView textView_create_profile;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        city_view = findViewById(R.id.City_icon);
        person_image = (ImageView) findViewById(R.id.person_image);

        cardView_create_profile = (CardView) findViewById(R.id.card_view_create_profile);

        textView_create_profile = (TextView) findViewById(R.id.text_view_create_profile);


        cardView_create_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });


//        city_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                YoYo.with(Techniques.BounceInDown).duration(1000);
//            }
//        });

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        //Log.d(All.TAG_LOG, "onWindowFocusChanged() called!");

        if (hasFocus) {
            //Log.d(All.TAG_LOG, "onWindowFocusChanged() and window has focus called!");

            //  askToSelectUserType(600, false);

            YoYo.with(Techniques.SlideInUp)
                    .duration(700)
                    .playOn(city_view);


            YoYo.with(Techniques.SlideInLeft)
                    .duration(1000)
                    .playOn(person_image);


        }


    }
}



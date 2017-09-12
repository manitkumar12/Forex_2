package com.grademojo.forex_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.grademojo.forex.R;

public class Main8Activity extends AppCompatActivity {

    ImageView image1,image2;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        image1 = (ImageView) findViewById(R.id.cloud_1);
        image2 = (ImageView) findViewById(R.id.cloud_2);

        view = findViewById(R.id.view_image);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }



    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        //Log.d(All.TAG_LOG, "onWindowFocusChanged() called!");

        if (hasFocus) {
            //Log.d(All.TAG_LOG, "onWindowFocusChanged() and window has focus called!");

            //  askToSelectUserType(600, false);

            YoYo.with(Techniques.SlideInRight)
                    .duration(3000)
                    .playOn(image1);

            YoYo.with(Techniques.SlideInRight)
                    .duration(3800)
                    .playOn(image2);


        }


    }

}

package com.grademojo.forex_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.grademojo.forex.R;

public class Sign_up extends AppCompatActivity {

    private CardView signup ;

    private TextView textView_sign_up;

    private EditText password_Edit_text_sign_in ,confirm_password_Edit_text_sign_in;

    private ImageView imageView ,imageView2;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        signup = (CardView) findViewById(R.id.card_view_sign_up_next_2);
        textView_sign_up = (TextView) findViewById(R.id.text_view_sign_up_next_2);
        password_Edit_text_sign_in = (EditText) findViewById(R.id.password_edit_text_sign_up);
        confirm_password_Edit_text_sign_in = (EditText) findViewById(R.id.profession_edit_text_sign_in);
        imageView2 = (ImageView) findViewById(R.id.eye2);
        imageView = (ImageView) findViewById(R.id.eye1);

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        password_Edit_text_sign_in.setInputType(InputType.TYPE_CLASS_TEXT);
                        break;
                    case MotionEvent.ACTION_UP:
                        password_Edit_text_sign_in.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        break;
                }
                return true;
            }
        });
        imageView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        confirm_password_Edit_text_sign_in.setInputType(InputType.TYPE_CLASS_TEXT);
                        break;
                    case MotionEvent.ACTION_UP:
                        confirm_password_Edit_text_sign_in.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        break;
                }
                return true;
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Sign_up.this, Main3Activity.class);
                startActivity(i);

            }
        });

        textView_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Sign_up.this, Main3Activity.class);
                startActivity(i);

            }
        });






    }
}

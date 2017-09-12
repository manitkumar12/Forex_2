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

public class Main2Activity extends AppCompatActivity {

    private CardView cardView_sign_in;

    private TextView textView_sign_in ,sign_up;

    private EditText password_Edit_text_sign_in;

    private ImageView pass_icon;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cardView_sign_in = (CardView) findViewById(R.id.card_view_sign_in_next);
        textView_sign_in = (TextView) findViewById(R.id.text_view_sign_in_next);
        sign_up = (TextView) findViewById(R.id.sign_up);

        password_Edit_text_sign_in = (EditText)findViewById(R.id.password_edit_text_sign_in);
        pass_icon = (ImageView) findViewById(R.id.eye);

        pass_icon.setOnTouchListener(new View.OnTouchListener() {
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

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this, Sign_up.class);
                startActivity(i);
            }
        });


        cardView_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });

        textView_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });







    }
}

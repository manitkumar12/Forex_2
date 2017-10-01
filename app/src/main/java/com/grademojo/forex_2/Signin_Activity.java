package com.grademojo.forex_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.grademojo.forex.R;

public class Signin_Activity extends AppCompatActivity {

    private CardView cardView_sign_in;

    private TextView textView_sign_in ,sign_up;

    private EditText password_Edit_text_sign_in, email_Edit_text_sign_in;

    private ImageView pass_icon;

    Intent i;
    private FirebaseAuth signin;
    private String TAG="signin";
    private TextView forgot_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        cardView_sign_in = (CardView) findViewById(R.id.card_view_sign_in_next);
        textView_sign_in = (TextView) findViewById(R.id.text_view_sign_in_next);
        forgot_pass = (TextView) findViewById(R.id.textview_forgot_password);

        sign_up = (TextView) findViewById(R.id.sign_up);
         signin=FirebaseAuth.getInstance();


        email_Edit_text_sign_in = (EditText)findViewById(R.id.email_name_edit_text_sign_in);
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
                i = new Intent(Signin_Activity.this, GmailIntegration.class);
                startActivity(i);
            }
        });

        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr=email_Edit_text_sign_in.getText().toString().trim();

                forgot(usr);
            }
        });
        cardView_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                String usr=email_Edit_text_sign_in.getText().toString().trim();
                String pass=password_Edit_text_sign_in.getText().toString().trim();
                if (!usr.equals("") && !pass.equals(""))
                {

                    singin(usr,pass);

                }
                else
                {
                    email_Edit_text_sign_in.setError("Required");
                    password_Edit_text_sign_in.setError("Required");
                }
            }
        });

        textView_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                i = new Intent(Signin_Activity.this,Main3Activity.class);
//                startActivity(i);

                String usr=email_Edit_text_sign_in.getText().toString().trim();
                String pass=password_Edit_text_sign_in.getText().toString().trim();
                if (!usr.equals("") && !pass.equals(""))
                {


                    singin(usr,pass);

                }
                else
                {
                    email_Edit_text_sign_in.setError("Required");
                    password_Edit_text_sign_in.setError("Required");
                }

            }
        });







    }
    public  void forgot(String email)
    {
        signin.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                Toast.makeText(Signin_Activity.this, "Check email for resetting password", Toast.LENGTH_SHORT).show();
            }
        });
    }
public void singin(String email,String pass)
{
    signin.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());

                    // If sign in fails, display a message to the user. If sign in succeeds
                    // the auth state listener will be notified and logic to handle the
                    // signed in user can be handled in the listener.
                    if (!task.isSuccessful()) {
                        Log.w(TAG, "signInWithEmail:failed", task.getException());
                        Toast.makeText(Signin_Activity.this, R.string.auth_failed,
                                Toast.LENGTH_SHORT).show();
                    }
                    else {

                        Toast.makeText(Signin_Activity.this, "success", Toast.LENGTH_SHORT).show();
                        i = new Intent(Signin_Activity.this,Main3Activity.class);
                        startActivity(i);
                    }

                    // ...
                }
            });
}

}

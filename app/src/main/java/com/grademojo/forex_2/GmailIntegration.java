package com.grademojo.forex_2;

import android.app.ProgressDialog;
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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.grademojo.forex.R;

public class GmailIntegration extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    public static final String TAG = "cj";
    private CardView signup ;

    private TextView textView_sign_up;

    private EditText email_Edit_text_sign_in, password_Edit_text_sign_in ,confirm_password_Edit_text_sign_in;

    private ImageView imageView ,imageView2;

    Intent i;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
         firebaseAuth= FirebaseAuth.getInstance();
        signup = (CardView) findViewById(R.id.card_view_sign_up_next_2);
        textView_sign_up = (TextView) findViewById(R.id.text_view_sign_up_next_2);
        email_Edit_text_sign_in = (EditText) findViewById(R.id.email_name_text_sign_up);
        password_Edit_text_sign_in = (EditText) findViewById(R.id.password_edit_text_sign_up);
        confirm_password_Edit_text_sign_in = (EditText) findViewById(R.id.profession_edit_text_sign_in);
        imageView2 = (ImageView) findViewById(R.id.eye2);
        imageView = (ImageView) findViewById(R.id.eye1);
         pd=new ProgressDialog(this);
        pd.setTitle("please w8");
        pd.setMessage("signup in process");
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
                String usr=email_Edit_text_sign_in.getText().toString().trim();
                String pass=password_Edit_text_sign_in.getText().toString().trim();
                pd.show();

                if (!usr.equals("") && !pass.equals(""))
                {

                    signup(usr,pass);

                i = new Intent(GmailIntegration.this, Main3Activity.class);
                startActivity(i);
                }
                else
                {
                    email_Edit_text_sign_in.setError("Required");
                    password_Edit_text_sign_in.setError("Required");
                    pd.dismiss();
                }


            }
        });

        textView_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                i = new Intent(GmailIntegration.this, Main3Activity.class);
//                startActivity(i);
                String usr=email_Edit_text_sign_in.getText().toString().trim();
                String pass=password_Edit_text_sign_in.getText().toString().trim();
pd.show();

                if (!usr.equals("") && !pass.equals(""))
                {

                    signup(usr,pass);

                    i = new Intent(GmailIntegration.this, Main3Activity.class);
                    startActivity(i);
                }
                else
                {
                    email_Edit_text_sign_in.setError("Required");
                    password_Edit_text_sign_in.setError("Required");
                    pd.dismiss();
                }

            }
        });











        mAuthListener = new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };

    }
    @Override
    public void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            firebaseAuth.removeAuthStateListener(mAuthListener);
        }
    }
    public void signup(String email,String password)
    {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Toast.makeText(GmailIntegration.this, R.string.auth_failed,
                                    Toast.LENGTH_SHORT).show();
                            task.addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(GmailIntegration.this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                        else {
                            Toast.makeText(GmailIntegration.this, "sucess", Toast.LENGTH_SHORT).show();
                        }
pd.dismiss();
                        // ...
                    }
                });
    }

}

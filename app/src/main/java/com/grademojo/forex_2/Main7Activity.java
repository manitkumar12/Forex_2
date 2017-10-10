package com.grademojo.forex_2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;
import com.facebook.share.widget.ShareDialog;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.grademojo.forex.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main7Activity extends AppCompatActivity {


    private CardView card_View_Sign_in, card_view_login;

    private TextView sign_Text_view, login_text_view;

    Intent i;

    ImageView image_fb;

    private ImageView face_image, gmail_image;
    private CardView card_view_facebook;

    private SignInButton signInButton;
    private static final String TAG = "gp";

    private FirebaseDatabase database;
    private DatabaseReference myRef;
    private String current;

    private FirebaseAuth firebaseAuth;
    private GoogleApiClient mGoogleApiClient;
    private int RC_SIGN_IN = 123;

    private CallbackManager callbackManager;
    private ShareDialog shareDialog;
    private LoginButton login;
    private Dialog details_dialog;
    private TextView details_txt;
    private String facebook_id, f_name, m_name, l_name, gender, profile_image, full_name, email_id;
    private ProfilePictureView profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        FacebookSdk.sdkInitialize(getApplicationContext());


        card_View_Sign_in = (CardView) findViewById(R.id.card_view_sign_in);
        sign_Text_view = (TextView) findViewById(R.id.text_view_sign_in);
        card_view_login = (CardView) findViewById(R.id.login_card_view);
        login_text_view = (TextView) findViewById(R.id.login_text_view);
        card_View_Sign_in = (CardView) findViewById(R.id.card_face1);
        gmail_image = (ImageView) findViewById(R.id.gmail);
        signInButton = (SignInButton) findViewById(R.id.sign_in_button);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });


        callbackManager = CallbackManager.Factory.create();
        login = (LoginButton) findViewById(R.id.login_button);

        face_image = (ImageView) findViewById(R.id.fb);
        card_view_facebook = (CardView) findViewById(R.id.card_face);


        shareDialog = new ShareDialog(this);
        login.setReadPermissions("public_profile email");

        details_dialog = new Dialog(this);
        details_dialog.setContentView(R.layout.dialog_details);
        details_dialog.setTitle("Details");


        getKeyHash();


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */, new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

                    }
                } /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();


        card_View_Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Signin_Activity.class);
                startActivity(i);

            }
        });

        sign_Text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Signin_Activity.class);
                startActivity(i);

            }
        });


        card_view_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Sign_up.class);
                startActivity(i);

            }
        });

        login_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Sign_up.class);
                startActivity(i);

            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AccessToken.getCurrentAccessToken() != null) {

                    //profile.setProfileId(null);
                }
            }
        });


        login.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                facebook_id = f_name = m_name = l_name = gender = profile_image = full_name = email_id = "";

                if (AccessToken.getCurrentAccessToken() != null) {
                    RequestData();
                    Profile profile = Profile.getCurrentProfile();
                    if (profile != null) {
                        facebook_id = profile.getId();
                        Log.e("facebook_id", facebook_id);
                        f_name = profile.getFirstName();
                        Log.e("f_name", f_name);
                        m_name = profile.getMiddleName();
                        Log.e("m_name", m_name);
                        l_name = profile.getLastName();
                        Log.e("l_name", l_name);
                        full_name = profile.getName();
                        Log.e("full_name", full_name);
//                        profile_image=profile.getProfilePictureUri(400, 400).toString();
//                        Log.e("profile_image", profile_image);
                    }

                }
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException exception) {
            }
        });

    }

    private void getKeyHash() {

        PackageInfo info;
        try {
            info = getPackageManager().getPackageInfo("com.grademojo.facebookpractice", PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md;
                md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String something = new String(Base64.encode(md.digest(), 0));
                //String something = new String(Base64.encodeBytes(md.digest()));
                Log.e("hash key", something);
            }
        } catch (PackageManager.NameNotFoundException e1) {
            Log.e("name not found", e1.toString());
        } catch (NoSuchAlgorithmException e) {
            Log.e("no such an algorithm", e.toString());
        } catch (Exception e) {
            Log.e("exception", e.toString());
        }
    }

    public void RequestData() {
        GraphRequest request = GraphRequest.newMeRequest(AccessToken.getCurrentAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
            @Override
            public void onCompleted(JSONObject object, GraphResponse response) {

                JSONObject json = response.getJSONObject();
                System.out.println("Json data :" + json);
                try {
                    if (json != null) {
                        String text = "Name" + json.getString("name") + "Email : " + json.getString("email") + "Profile link : " + json.getString("link");
                        // details_txt.setText(Html.fromHtml(text));
                        //  details_txt.setText(json.getString(text));
                        profile.setProfileId(json.getString("id"));
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        Bundle parameters = new Bundle();
        parameters.putString("fields", "id,name,link,email,picture");
        request.setParameters(parameters);
        request.executeAsync();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);


        if (resultCode == Activity.RESULT_CANCELED) {
            return;
        }

        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if (result.isSuccess()) {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = result.getSignInAccount();
                firebaseAuthWithGoogle(account);
            } else {
                // Google Sign In failed, update UI appropriately
                // [START_EXCLUDE]
                Toast.makeText(Main7Activity.this, "fAILED", Toast.LENGTH_SHORT).show();
                // [END_EXCLUDE]
            }
        }

    }


    public void click_card_image(View v) {
        if (v == card_view_facebook) {

            login.performClick();
        }
    }

    public void click_image(View v) {
        if (v == face_image) {
            login.performClick();
        }
    }


    public void click_card_image1(View v) {
        if (v == card_View_Sign_in) {

            signIn();
        }
    }

    public void click_image1(View v) {
        if (v == gmail_image) {
            signIn();
        }


//
//        image_fb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i = new Intent(Main7Activity.this,Facebook_integration.class);
//                startActivity(i);
//            }
//        });


    }



    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        Log.d(TAG, "firebaseAuthWithGoogle:" + acct.getId());
        // [START_EXCLUDE silent]
        // [END_EXCLUDE]

        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithCredential:success");
                            String user = firebaseAuth.getCurrentUser().getEmail();
                               Toast.makeText(Main7Activity.this, "user", Toast.LENGTH_SHORT).show();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithCredential:failure", task.getException());
                              Toast.makeText(Main7Activity.this,"Authentication failed.",Toast.LENGTH_SHORT).show();
                        }

                        // [START_EXCLUDE]
                        // [END_EXCLUDE]
                    }
                });
    }

    private void signIn() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }
}

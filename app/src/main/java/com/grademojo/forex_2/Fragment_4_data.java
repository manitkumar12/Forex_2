package com.grademojo.forex_2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by sapling_a0 on 12/9/17.
 */

public class Fragment_4_data extends Fragment {


    private static final String TAG = "gp";
    private TextView btn;
    private CircleImageView imageview;
    private static final String IMAGE_DIRECTORY = "/demonuts";
    private int GALLERY = 1, CAMERA = 2;
    private EditText edit_text_name, edit_text_professional, edit_text_email, edit_text_phone;

    private FirebaseDatabase database;

    private DatabaseReference myRef;






    private CardView cardView_Next;

    private TextView textView_Next;

    Intent i;
    private String current;

    private FirebaseAuth firebaseAuth;
    private GoogleApiClient mGoogleApiClient;
    private int RC_SIGN_IN=123;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_4_layout, container, false);
        rootView.findViewById(R.id.sign_in_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signIn();


            }
        });

        firebaseAuth = FirebaseAuth.getInstance();



        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(getActivity())
                .enableAutoManage(getActivity() /* FragmentActivity */, new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

                    }
                } /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();

        cardView_Next = (CardView) rootView.findViewById(R.id.card_view_next);
        textView_Next = (TextView) rootView.findViewById(R.id.text_view_next);
        edit_text_name = (EditText)rootView.findViewById(R.id.name_text_sign_in_frag4);
        edit_text_professional = (EditText)rootView.findViewById(R.id.profession_edit_text_sign_in_frag4);
        edit_text_email = (EditText)rootView.findViewById(R.id.email_edit_text_sign_in_frag4_2);
        edit_text_phone = (EditText)rootView.findViewById(R.id.phone_edit_text_sign_in_frag4);

        database=FirebaseDatabase.getInstance();
        myRef=database.getReference("User");
        firebaseAuth= FirebaseAuth.getInstance();
         current = firebaseAuth.getCurrentUser().getEmail();


        btn = (TextView) rootView.findViewById(R.id.btn);
        imageview = (CircleImageView) rootView.findViewById(R.id.iv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPictureDialog();
            }
        });

        cardView_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit_text_name.getText().toString().trim();
                String prof = edit_text_professional.getText().toString().trim();
                String email = edit_text_email.getText().toString().trim();
                String phone = edit_text_phone.getText().toString().trim();
                HashMap<String,String> myyser=new HashMap<String, String>();
                myyser.put("name",name);
                myyser.put("prof",prof);
                myyser.put("email",email);
                myyser.put("phone",phone);


                myRef.child(email).setValue(myyser).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(getActivity(), "success", Toast.LENGTH_SHORT).show();
                        i = new Intent(getActivity(),Main4Activity_practice.class);
                        startActivity(i);




                    }
                });
            }
        });

        textView_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edit_text_name.getText().toString().trim();
                String prof = edit_text_professional.getText().toString().trim();
                String email = edit_text_email.getText().toString().trim();
                String phone = edit_text_phone.getText().toString().trim();
                HashMap<String,String> myyser=new HashMap<String, String>();
                myyser.put("name",name);
                myyser.put("prof",prof);
                myyser.put("email",email);
                myyser.put("phone",phone);

                myRef.child(email).setValue(myyser).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(getActivity(), "success", Toast.LENGTH_SHORT).show();
                        i = new Intent(getActivity(),Main4Activity_practice.class);
                        startActivity(i);
                    }
                });



            }
        });




        return rootView;

    }

    private void showPictureDialog(){
        AlertDialog.Builder pictureDialog = new AlertDialog.Builder(getActivity());
        pictureDialog.setTitle("Select Action");
        String[] pictureDialogItems = {
                "Select photo from gallery",
                "Capture photo from camera" };
        pictureDialog.setItems(pictureDialogItems,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                choosePhotoFromGallary();
                                break;
                            case 1:
                                takePhotoFromCamera();
                                break;
                        }
                    }
                });
        pictureDialog.show();
    }

    public void choosePhotoFromGallary() {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        startActivityForResult(galleryIntent, GALLERY);
    }

    private void takePhotoFromCamera() {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        getActivity();
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
                Toast.makeText(getActivity(), "fAILED", Toast.LENGTH_SHORT).show();
                // [END_EXCLUDE]
            }
        }
        if (requestCode == GALLERY) {
            if (data != null) {
                Uri contentURI = data.getData();
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), contentURI);
                    String path = saveImage(bitmap);
                    Toast.makeText(getActivity().getApplication(), "Image Saved!", Toast.LENGTH_SHORT).show();
                    imageview.setImageBitmap(bitmap);

                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(getActivity().getApplicationContext(), "Failed!", Toast.LENGTH_SHORT).show();
                }
            }

        } else if (requestCode == CAMERA) {
            Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
            imageview.setImageBitmap(thumbnail);
//            Matrix matrix = new Matrix();
//            matrix.postRotate(90);
            saveImage(thumbnail);
            Toast.makeText(getActivity().getApplication(), "Image Saved!", Toast.LENGTH_SHORT).show();
        }
    }

//    Bitmap realImage = BitmapFactory.decodeStream(stream);
//
//    ExifInterface exif=new ExifInterface(getRealPathFromURI(imagePath));
//
//Log.d("EXIF value", exif.getAttribute(ExifInterface.TAG_ORIENTATION));
//if(exif.getAttribute(ExifInterface.TAG_ORIENTATION).equalsIgnoreCase("6")){
//
//        realImage=ImageUtil.rotate(realImage, 90);
//    }else if(exif.getAttribute(ExifInterface.TAG_ORIENTATION).equalsIgnoreCase("8")){
//        realImage=ImageUtil.rotate(realImage, 270);
//    }else if(exif.getAttribute(ExifInterface.TAG_ORIENTATION).equalsIgnoreCase("3")){
//        realImage=ImageUtil.rotate(realImage, 180);
//    }

    public String saveImage(Bitmap myBitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        myBitmap.compress(Bitmap.CompressFormat.JPEG, 90, bytes);

        File wallpaperDirectory = new File(
                Environment.getExternalStorageDirectory() + IMAGE_DIRECTORY);
        // have the object build the directory structure, if needed.
        if (!wallpaperDirectory.exists()) {
            wallpaperDirectory.mkdirs();
        }

        try {
            File f = new File(wallpaperDirectory, Calendar.getInstance()
                    .getTimeInMillis() + ".jpg");
            f.createNewFile();
            FileOutputStream fo = new FileOutputStream(f);
            fo.write(bytes.toByteArray());
            MediaScannerConnection.scanFile(getContext(),
                    new String[]{f.getPath()},
                    new String[]{"image/jpeg"}, null);
            fo.close();
            Log.d("TAG", "File Saved::--->" + f.getAbsolutePath());

            return f.getAbsolutePath();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return "";




    }


    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        Log.d(TAG, "firebaseAuthWithGoogle:" + acct.getId());
        // [START_EXCLUDE silent]
        // [END_EXCLUDE]

        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithCredential:success");
                            String user = firebaseAuth.getCurrentUser().getEmail();
                            Toast.makeText(getActivity(), "user"+user, Toast.LENGTH_SHORT).show();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithCredential:failure", task.getException());
                            Toast.makeText(getActivity(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
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

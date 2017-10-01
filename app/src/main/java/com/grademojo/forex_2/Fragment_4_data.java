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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
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


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_4_layout, container, false);


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
}

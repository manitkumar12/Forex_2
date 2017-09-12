package com.grademojo.forex_2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.grademojo.forex.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import de.hdodenhof.circleimageview.CircleImageView;

public class Main4Activity extends AppCompatActivity {


    private TextView btn;
    private CircleImageView imageview;
    private static final String IMAGE_DIRECTORY = "/demonuts";
    private int GALLERY = 1, CAMERA = 2;




    private CardView cardView_Next;

    private TextView textView_Next;

    Intent i;





//    private RecyclerView recyclerView, recyclerView1;
//
//    private My_Adapter mAdapter;
//
//
//
//    private My_Adapter_2 myAdapter2;
//
//    private List<My_course_pojo_first> input;
//
//
//    private List<My_Course_pojo_second> input2;
//
//

//
//    private TextView textView_mu_course ,textView_suggested_course;
//
//    Intent i;
//
//    private RecyclerView.LayoutManager mLayoutManager, layoutManager2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);




        cardView_Next = (CardView) findViewById(R.id.card_view_next);
        textView_Next = (TextView) findViewById(R.id.text_view_next);

        btn = (TextView) findViewById(R.id.btn);
        imageview = (CircleImageView) findViewById(R.id.iv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPictureDialog();
            }
        });

        cardView_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main4Activity.this,Main4Activity_practice.class);
                startActivity(i);
            }
        });

        textView_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main4Activity.this,Main4Activity_practice.class);
                startActivity(i);
            }
        });








//        recyclerView = (RecyclerView) findViewById(R.id.recylcer_view_1);
//        recyclerView1 = (RecyclerView) findViewById(R.id.recylcer_view_2);
//
//        textView_mu_course = (TextView) findViewById(R.id.text_view_my_course);
//



//
//        textView_suggested_course = (TextView) findViewById(R.id.text_view_suggested_course);
//
//
//
//        textView_Intermediate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Main4Activity.this, Intermediate_4.class);
//                startActivity(i);
//            }
//        });
//
//        textView_Advance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Main4Activity.this, Advance_4.class);
//                startActivity(i);
//            }
//        });
//
//
//        textView_mu_course.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i = new Intent(Main4Activity.this,Main5Activity.class);
//                startActivity(i);
//            }
//        });
//
//
//        textView_suggested_course.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i = new Intent(Main4Activity.this,Main5Activity.class);
//                startActivity(i);
//            }
//        });
//
//
//        input = new ArrayList<>();
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref
//
//               ));
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref2
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref3
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref4));
//
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref2
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref3
//        ));
//
//
//
//        mAdapter = new My_Adapter(input);
//        recyclerView.setAdapter(mAdapter);
//
//
//
//
//        recyclerView.setAdapter(mAdapter);
//
//
//        SnapHelper snapHelper = new LinearSnapHelper();
//        snapHelper.attachToRecyclerView(recyclerView);
//
//
//
//
//
//
//
//        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//
//
//        recyclerView.setLayoutManager(mLayoutManager);
//
//
//        input2 = new ArrayList<>();
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref
//
//        ));
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref2
//        ));
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref3
//
//        ));
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref4));
//
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref
//
//        ));
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref2
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref3
//        ));
//
//
//
//        myAdapter2 = new My_Adapter_2(input2);
//        recyclerView1.setAdapter(myAdapter2);
//
//
//
//
//        recyclerView1.setAdapter(myAdapter2);
//
//
//        SnapHelper snapHelper1 = new LinearSnapHelper();
//        snapHelper1.attachToRecyclerView(recyclerView1);
//
//
//
//
//
//
//
//        layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//
//
//        recyclerView1.setLayoutManager(layoutManager2);
//
//
//
//
////        List<String> input1 = new ArrayList<>();
////        for (int i = 0; i < 15; i++) {
////            input.add("Test" + i);
////        }// define an adapter
////        myAdapter2 = new My_Adapter_2(c2,input);
////        recyclerView1.setAdapter(myAdapter2);
////
////
////
////
////        recyclerView.setAdapter(mAdapter);
////
////
////        SnapHelper snapHelper1 = new LinearSnapHelper();
////        snapHelper1.attachToRecyclerView(recyclerView1);
////
////
////
////
////
////
////
////        layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
////
////
////        recyclerView1.setLayoutManager(layoutManager2);
//
//




    }

    private void showPictureDialog(){
        AlertDialog.Builder pictureDialog = new AlertDialog.Builder(this);
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
        if (resultCode == this.RESULT_CANCELED) {
            return;
        }
        if (requestCode == GALLERY) {
            if (data != null) {
                Uri contentURI = data.getData();
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), contentURI);
                    String path = saveImage(bitmap);
                    Toast.makeText(Main4Activity.this, "Image Saved!", Toast.LENGTH_SHORT).show();
                    imageview.setImageBitmap(bitmap);

                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(Main4Activity.this, "Failed!", Toast.LENGTH_SHORT).show();
                }
            }

        } else if (requestCode == CAMERA) {
            Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
            imageview.setImageBitmap(thumbnail);
//            Matrix matrix = new Matrix();
//            matrix.postRotate(90);
            saveImage(thumbnail);
            Toast.makeText(Main4Activity.this, "Image Saved!", Toast.LENGTH_SHORT).show();
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
        myBitmap.compress(Bitmap.CompressFormat.JPEG,90, bytes);

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
            MediaScannerConnection.scanFile(this,
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



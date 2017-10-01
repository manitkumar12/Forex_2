package com.grademojo.forex_2;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.io.File;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TextView textView_Intermediate ,textView_Advance, textView_beginner;



    private View border_one ,border_two;



    FragmentManager main4 = getSupportFragmentManager();


    Beginner_41 beginner_41 = new Beginner_41();
    Advance_41 advance_41 = new Advance_41();
    Intermediate_41 intermediate_41 = new Intermediate_41();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        border_one = findViewById(R.id.view_1);
        border_two = findViewById(R.id.view_2);


        textView_Advance = (TextView) findViewById(R.id.text_for_Advance);
        textView_Intermediate = (TextView) findViewById(R.id.text_for_Intermediate);
        textView_beginner = (TextView) findViewById(R.id.text_for_beginner);



        if (savedInstanceState == null) {
//           fm.beginTransaction.(R.id.frmae_6, forex_video_6)
//                    .commit();


            main4.beginTransaction().replace(R.id.frame_4,beginner_41).commit();
        }

//        textView_beginner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                main4.beginTransaction().replace(R.id.frame_4,beginner_41).commit();
//
//
//            }
//        });
//
//        textView_Advance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//                main4.beginTransaction().replace(R.id.frame_4,advance_41).commit();
//
//
//            }
//        });

        textView_Intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                main4.beginTransaction().replace(R.id.frame_4,intermediate_41).commit();

                textView_Intermediate.setBackgroundResource(R.drawable.intermediate_background);
                textView_Advance.setBackgroundResource(R.drawable.advance_backgrond);

                textView_Intermediate.setTextColor(Color.parseColor("#ffffff"));

//              textView_Intermediate.setTextColor(ContextCompat.getColor(v.getContext(),R.color.white));
                textView_beginner.setTextColor(Color.parseColor("#989797"));
                textView_Advance.setTextColor(Color.parseColor("#989797"));
                border_one.setBackgroundResource(R.color.blue);
                textView_beginner.setBackgroundResource(R.drawable.begiiner_backround);
                textView_Intermediate.setTypeface(textView_Intermediate.getTypeface(), Typeface.BOLD);
                textView_beginner.setTypeface(textView_beginner.getTypeface(), Typeface.NORMAL);
                textView_Advance.setTypeface(textView_Advance.getTypeface(), Typeface.NORMAL);



//                border_one.setBackground(ContextCompat.getDrawable(context,R.color.blue));
//                textView_Intermediate.setTextColor(ContextCompat.getColor(context,R.color.white));



            }
        });


        textView_beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                main4.beginTransaction().replace(R.id.frame_4,beginner_41).commit();

                textView_beginner.setBackgroundResource(R.drawable.begginner_blue);
                textView_Intermediate.setTextColor(Color.parseColor("#989797"));
                textView_beginner.setTextColor(Color.parseColor("#ffffff"));
                textView_Advance.setTextColor(Color.parseColor("#989797"));
                textView_Advance.setBackgroundResource(R.drawable.advance_backgrond);
                textView_Intermediate.setBackgroundResource(R.drawable.intermediate_white);
                textView_Intermediate.setTypeface(textView_Intermediate.getTypeface(), Typeface.NORMAL);
                textView_beginner.setTypeface(textView_beginner.getTypeface(), Typeface.BOLD);
                textView_Advance.setTypeface(textView_Advance.getTypeface(), Typeface.NORMAL);



//                border_one.setBackground(ContextCompat.getDrawable(context,R.color.blue));
//                textView_Intermediate.setTextColor(ContextCompat.getColor(context,R.color.white));



            }
        });

        textView_Advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                main4.beginTransaction().replace(R.id.frame_4,advance_41).commit();
                textView_Advance.setBackgroundResource(R.drawable.back_ground_blue_article);
                textView_Intermediate.setTextColor(Color.parseColor("#989797"));
                textView_Advance.setTextColor(Color.parseColor("#ffffff"));
                textView_beginner.setTextColor(Color.parseColor("#989797"));
                textView_beginner.setBackgroundResource(R.drawable.begiiner_backround);
                //border_one.setBackgroundColor(R.color.white);
                border_one.setBackgroundResource(R.color.white);
                textView_Intermediate.setBackgroundResource(R.drawable.intermediate_white);
                textView_Intermediate.setTypeface(textView_Intermediate.getTypeface(), Typeface.NORMAL);
                textView_beginner.setTypeface(textView_beginner.getTypeface(), Typeface.NORMAL);
                textView_Advance.setTypeface(textView_Advance.getTypeface(), Typeface.BOLD);



//                border_one.setBackground(ContextCompat.getDrawable(context,R.color.blue));
//                textView_Intermediate.setTextColor(ContextCompat.getColor(context,R.color.white));



            }
        });




//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

 
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent   i = new Intent(MainActivity.this,Main5Activity.class);
            startActivity(i);


        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            StringBuilder sb = new StringBuilder();
            sb.append("Hi, I am using Forex to learning. I like this and I want you to check it out.");
           sb.append("https://play.google.com/store/movies/details/The_Boss_Baby?id=ITr_iM5OT2E");
            sharingIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Thanks to Share:FOREX");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, sb.toString());
            startActivity(Intent.createChooser(sharingIntent, "Thanks to Share:FOREX"));


        } else if (id == R.id.nav_send) {


            ApplicationInfo applicationInfo = getApplicationContext().getApplicationInfo();

            String filepath = applicationInfo.sourceDir;

            Intent intent = new Intent(Intent.ACTION_SEND);

            intent.setType("*/*");

            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filepath)));
            intent.setType("application/vnd.android.package-archive");
            startActivity(Intent.createChooser(intent,"Share app"));



        }
        else if (id == R.id.Logout)
        {


            Intent i = new Intent(MainActivity.this,Signin_Activity.class);

            startActivity(i);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

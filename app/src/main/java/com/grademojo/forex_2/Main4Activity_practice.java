package com.grademojo.forex_2;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.io.File;
import java.util.List;

public class Main4Activity_practice extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private RecyclerView  recyclerView1;

    private boolean blockBackButton;


    private TextView navbar;

    private DrawerLayout navDrawerStart;

    private My_Adapter_2 myAdapter2;

    private List<My_Course_pojo_second> input2;

    private CardView card_View_course;

    private TextView text_view_course ,textView_suggested_course;

    private Intent i;

    private RecyclerView.LayoutManager layoutManager2;

    private NavigationView navigationView;



    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_main4);

        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }





        // Get user "data" from intent
        Intent intent = getIntent();
        String jsonObj_data_str = intent.getStringExtra("data");
        //Log.d(All.TAG_LOG, "Intent has: " + jsonObj_data_str);

//        if(jsonObj_data_str == null){
//            // Restart app from scratch
//
//
//            fragmentManager.beginTransaction().replace(R.id.fragment_container_main,fragment_5_data).commit();
//
//
//
//
//
//            // Start the LaunchScreenActivity Activity
//
//        }

        if (savedInstanceState == null) {
            // Code to specify the fragment to be used
            //FragA0Homepage fragA0Homepage = new FragA0Homepage();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container_main, Fragment_5_data.newInstance())
                    .commit();
        }




        navDrawerStart = (DrawerLayout) findViewById(R.id.drawer_layout);
       navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




//
//        navbar = (TextView) findViewById(R.id.menu_bar);
//
//        navbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Log.d("@@@", "Custom nav button clicked!!");
//
//                if(navDrawerStart.isDrawerOpen(GravityCompat.START)) {
//                    navDrawerStart.closeDrawer(GravityCompat.START);
//                }else{
//                    navDrawerStart.openDrawer(GravityCompat.START);
//                }
//            }
//        });












        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public void onBackPressed() {
        if (blockBackButton) {
            return;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            // There is at least one fragment in the Back Stack
            // Time to resume it
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    private void y0OptionClick(String pos){

        switch(pos){
            case "0":

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container_main , Fragment_5_data.newInstance())
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();

                //showSnackBar("Direct to Chapter-Module selection screen.");
                break;
        }


    }

    private void y0OptionClick1(String pos){

        switch(pos){
            case "0":

                getSupportFragmentManager()
                        .beginTransaction()

                        .replace(R.id.fragment_container_main , Fragment_6_data.newInstance())
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();

                //showSnackBar("Direct to Chapter-Module selection screen.");
                break;
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

            i = new Intent(Main4Activity_practice.this,Main5Activity.class);
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


            Intent i = new Intent(Main4Activity_practice.this,Signin_Activity.class);

            startActivity(i);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}




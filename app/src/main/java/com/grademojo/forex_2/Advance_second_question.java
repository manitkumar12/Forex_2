package com.grademojo.forex_2;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.io.File;

public class Advance_second_question extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    WebView mWebView ,mwebview2,mwebview3;
    private TextView navbar;
    private NavigationView navigationView;

    private DrawerLayout navDrawerStart;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_second_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);
        mwebview3= (WebView) findViewById(R.id.web_text_3);

        load();


        navDrawerStart = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        navbar = (TextView) findViewById(R.id.advance_second_menu_bar);

        navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("@@@", "Custom nav button clicked!!");

                if(navDrawerStart.isDrawerOpen(GravityCompat.START)) {
                    navDrawerStart.closeDrawer(GravityCompat.START);
                }else{
                    navDrawerStart.openDrawer(GravityCompat.START);
                }
            }
        });



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
            Intent i = new Intent(Advance_second_question.this,Main5Activity.class);
            startActivity(i);


        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            StringBuilder sb = new StringBuilder();
            sb.append("Hi, I am using Forex to learning. I like this and I want you to check it out.");
            // sb.append("https://www.amazon.com/Sandhu-BYE-Book-Your-Event/dp/B071192YG2/ref=sr_1_1?s=mobile-apps&ie=UTF8&qid=1494678627&sr=1-1&keywords=bye");
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


            Intent i = new Intent(Advance_second_question.this,Signin_Activity.class);

            startActivity(i);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Tweezers form when two consecutive candlesticks have equal, or very close to equal, highs (tweezer top), or lows (tweezer bottom)</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");

        String text1 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">IThe equal highs or lows may also reflect the open or close of two consecutive candlesticks, or a combination of both</p> " + "</body></html>";
        mwebview2.loadData(text1, "text/html", "utf-8");

        String text2 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">The colors of the candlesticks that form a tweezer generally don’t matter Tweezer form more often on smaller timeframe charts</p> " + "</body></html>";
        mwebview3.loadData(text2, "text/html", "utf-8");




    }

}
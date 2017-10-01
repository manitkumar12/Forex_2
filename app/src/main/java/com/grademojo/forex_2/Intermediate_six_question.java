package com.grademojo.forex_2;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.io.File;

public class Intermediate_six_question extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private TextView navbar;
    private NavigationView navigationView;

    private DrawerLayout navDrawerStart;

    private WebView mWebView ,mwebview2 ,mwebview3  ,mwebview4 ,mwebview5 ,mwebview6 ,mwebview7 ,mwebview8 ,mwebview9;


    private CardView intermediate_cardview;

    private TextView intermediate_text_view;

    private Intent i ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_six_question);

        intermediate_cardview = (CardView) findViewById(R.id.card_view_intermediate_six_question);

        intermediate_text_view = (TextView) findViewById(R.id.text_view_intermediate_six_question);

        intermediate_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_six_question.this,Intermediate_seven_question.class);
                startActivity(i);

            }
        });

        intermediate_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_six_question.this,Intermediate_seven_question.class);
                startActivity(i);

            }
        });


        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);
        mwebview3 = (WebView) findViewById(R.id.web_text_3);
        mwebview4 = (WebView) findViewById(R.id.web_text_4);
        mwebview5 = (WebView) findViewById(R.id.web_text_5);
        mwebview6 = (WebView) findViewById(R.id.web_text_6);
        mwebview7 = (WebView) findViewById(R.id.web_text_7);
        mwebview8 = (WebView) findViewById(R.id.web_text_8);
        mwebview9 = (WebView) findViewById(R.id.web_text_9);




        navDrawerStart = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        navbar = (TextView) findViewById(R.id.intermediate_six_question_menu_bar);

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

        load();}



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


            Intent i = new Intent(Intermediate_six_question.this,Signin_Activity.class);

            startActivity(i);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">\n" +
                "Once you decide what type of trader you are, you should begin to invest yourself into education and research. Make continual learning a priority, each person’s strategy or methodology is unique and cannot be duplicated. Therefore your plan is most successful when it is based on your individual needs. Evaluate your needs and the effort required. Make sure you understand why you are placing trades. An initial investment maybe monetary but will benefit you over the long-term. Time and research should be continuing investments. Research by way of following current global events and keeping up to date on current analysis tools will help educate you further on all aspects of trading. Ask yourself, “Am I a fundamental or technical trader?</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");

        String text1 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">After determining some of the types of analysis you will use, it’s time to develop a trading strategy. This can be through fundamental analysis, technical analysis, or a combination of both. It is key that you develop a strategy and include it as a part of your trading plan.</p> " + "</body></html>";
        mwebview2.loadData(text1, "text/html", "utf-8");
        String text2 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Creating a strategy using fundamental and technical tools is key, but we first need to learn a little about each of these types. Some traders choose to use fundamental analysis to assist with their trading decisions. This type of analysis is based on the news. News can be considered anything ranging from economic, political, or even environmental events. As a result, fundamental analysis is much more subjective.</p> " + "</body></html>";
        mwebview3.loadData(text2, "text/html", "utf-8");
        String text3 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Other traders may choose to use technical analysis to drive their trading decisions. This type of analysis is more definitive and relies more on the math and probabilities behind trading. The specific type of analysis used can be an indicator. They could be either leading or lagging. There are very few leading indicators available, which may give an idea of where the market is going to go. Fibonacci is the most popular, but most misused and misunderstood.</p> " + "</body></html>";
        mwebview4.loadData(text3, "text/html", "utf-8");
        String text4 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">A strategy is a step-by-step systematic approach to how and when we are going to use tools developing a sequence of analysis. Here is what we can expect to see in a trading strategy:</p> " + "</body></html>";
        mwebview5.loadData(text4, "text/html", "utf-8");
        String text5 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">This sequence will lead us to what a high probability trade looks like visually based on the indicators and analysis we are using. Since we have what we need for our strategy, let’s take a look at the money and risk management side of trading.</p> " + "</body></html>";
        mwebview6.loadData(text5, "text/html", "utf-8");
        String text6 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">This sequence will lead us to what a high probability trade looks like visually based on the indicators and analysis we are using. Since we have what we need for our strategy, let’s take a look at the money and risk management side of trading.</p> " + "</body></html>";
        mwebview7.loadData(text6, "text/html", "utf-8");
        String text7 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\"  align=\"justify\">Let’s think in terms of probability. It is helpful to use the 3% rule and always have a cushion. This is an example of the 3% rule in action: 3% on a $10,000 account is equal to $300 risk per trade. Then divide the cost of risk by the account equity, to get the number of losing trades or $10,000/$300 or 33.3 trades. These answers will help you determine if you can meet your goals. It allows you to give yourself room for flexibility. Traders limit their trading and the plan if there is not enough room for the losses. When developing your trading plan and approach it’s important to take other costs into consideration, some may have more of an impact than others, but all contribute to your investment in a trading plan. Assuming we have the right strategy decided and how much equity to risk, let’s figure out timing.</p> " + "</body></html>";
        mwebview8.loadData(text7, "text/html", "utf-8");
        String text8 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Timing when trading can be everything. When do the markets open? When do they close? What instruments (like currency pairs) am I trading? Some markets are open when others are closed or they may overlap. Here are the open and close times for some of the major markets. More volatility occurs at market opening and closings but also when reports or news are released. The beauty of trading some instruments is the ability to trade them even if the market you physically reside in is closed. The illustration below shows the overlap of markets that are open. Notice the times where more than two markets are open simultaneously. From 8am Eastern Time or 1pm GMT to 12pm Eastern Time or 5pm GMT, it displays the most markets open globally. Picking your times to trade or watch the market maybe easier since there is likely a market open somewhere in the world.</p> " + "</body></html>";
        mwebview9.loadData(text8, "text/html", "utf-8");




    }

}
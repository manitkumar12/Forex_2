package com.grademojo.forex_2;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.io.File;

public class Main5Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
//    private RecyclerView recyclerView_3;
//
//    private My_Course_Adapter m_Adapter;


    private TextView textView_ongoing ,textView_Complted,textView_all;

    private View border;

    private TextView navbar;
    private NavigationView navigationView;

    private DrawerLayout navDrawerStart;



    FragmentManager main5 = getSupportFragmentManager();


    My_course_All_5 my_course_all_5 = new My_course_All_5();
    My_Course_Ongoing_5 my_course_ongoing_5 = new My_Course_Ongoing_5();
    My_Course_Completed_5 my_course_completed_5 = new My_Course_Completed_5();

    Intermediate_41 intermediate_41 = new Intermediate_41();
    Advance_41 advance_41 = new Advance_41();





//    private List<My_COurse_Pojo_class> input;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        setContentView(R.layout.activity_main5);


//        recyclerView_3 = (RecyclerView) findViewById(R.id.recycler_view_3);




        textView_ongoing = (TextView) findViewById(R.id.text_for_Ongoing);
        textView_Complted = (TextView) findViewById(R.id.text_for_Completed);
        textView_all = (TextView) findViewById(R.id.text_for_All);

        border = findViewById(R.id.all_course);


        navDrawerStart = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        navbar = (TextView) findViewById(R.id.menu_bar);



        if (savedInstanceState == null) {
//           fm.beginTransaction.(R.id.frmae_6, forex_video_6)
//                    .commit();


            main5.beginTransaction().replace(R.id.frame_5,my_course_all_5).commit();
        }




        textView_ongoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                main5.beginTransaction().replace(R.id.frame_5,my_course_ongoing_5).commit();
//
//                textView_ongoing.setBackgroundResource(R.drawable.intermediate_background);
//                textView_Complted.setBackgroundResource(R.drawable.advance_backgrond);
//
//                border.setBackgroundResource(R.color.blue);
//
//                textView_ongoing.setTextColor(Color.parseColor("#ffffff"));
//                textView_all.setTextColor(Color.parseColor("#989797"));
//                textView_Complted.setTextColor(Color.parseColor("#989797"));
//                textView_all.setBackgroundResource(R.drawable.begiiner_backround);
//                textView_ongoing.setTypeface(textView_ongoing.getTypeface(), Typeface.BOLD);
//                textView_all.setTypeface(textView_all.getTypeface(), Typeface.NORMAL);
//                textView_Complted.setTypeface(textView_Complted.getTypeface(), Typeface.NORMAL);


                main5.beginTransaction().replace(R.id.frame_5,intermediate_41).commit();

                textView_ongoing.setBackgroundResource(R.drawable.intermediate_background);
                textView_Complted.setBackgroundResource(R.drawable.advance_backgrond);

                textView_ongoing.setTextColor(Color.parseColor("#ffffff"));

//              textView_Intermediate.setTextColor(ContextCompat.getColor(v.getContext(),R.color.white));
                textView_all.setTextColor(Color.parseColor("#989797"));
                textView_Complted.setTextColor(Color.parseColor("#989797"));
                border.setBackgroundResource(R.color.blue);
                textView_all.setBackgroundResource(R.drawable.begiiner_backround);
                textView_ongoing.setTypeface(textView_ongoing.getTypeface(), Typeface.BOLD);
                textView_all.setTypeface(textView_all.getTypeface(), Typeface.NORMAL);
                textView_Complted.setTypeface(textView_Complted.getTypeface(), Typeface.NORMAL);



//                border_one.setBackground(ContextCompat.getDrawable(context,R.color.blue));
//                textView_Intermediate.setTextColor(ContextCompat.getColor(context,R.color.white));



            }
        });


        textView_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                main5.beginTransaction().replace(R.id.frame_5,my_course_all_5).commit();

                textView_all.setBackgroundResource(R.drawable.begginner_blue);

                textView_ongoing.setTextColor(Color.parseColor("#989797"));
                textView_all.setTextColor(Color.parseColor("#ffffff"));
                textView_Complted.setTextColor(Color.parseColor("#989797"));
                textView_Complted.setBackgroundResource(R.drawable.advance_backgrond);

                textView_ongoing.setBackgroundResource(R.drawable.intermediate_white);
                textView_ongoing.setTypeface(textView_ongoing.getTypeface(), Typeface.NORMAL);
                textView_all.setTypeface(textView_all.getTypeface(), Typeface.BOLD);
                textView_Complted.setTypeface(textView_Complted.getTypeface(), Typeface.NORMAL);



//                border_one.setBackground(ContextCompat.getDrawable(context,R.color.blue));
//                textView_Intermediate.setTextColor(ContextCompat.getColor(context,R.color.white));



            }
        });

        textView_Complted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                main5.beginTransaction().replace(R.id.frame_5, advance_41).commit();

                textView_Complted.setBackgroundResource(R.drawable.back_ground_blue_article);

                textView_ongoing.setTextColor(Color.parseColor("#989797"));
                textView_Complted.setTextColor(Color.parseColor("#ffffff"));
                textView_all.setTextColor(Color.parseColor("#989797"));
                textView_all.setBackgroundResource(R.drawable.begiiner_backround);
                border.setBackgroundResource(R.color.white);

                textView_ongoing.setBackgroundResource(R.drawable.intermediate_white);
                textView_ongoing.setTypeface(textView_ongoing.getTypeface(), Typeface.NORMAL);
                textView_all.setTypeface(textView_ongoing.getTypeface(), Typeface.NORMAL);
                textView_Complted.setTypeface(textView_Complted.getTypeface(), Typeface.BOLD);


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
            Intent i = new Intent(Main5Activity.this,Main5Activity.class);
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


            Intent i = new Intent(Main5Activity.this,Signin_Activity.class);

            startActivity(i);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



            }}


//
//        input = new ArrayList<>();
//
//
//        input.add(new My_COurse_Pojo_class(
//                R.drawable.ref2,
//
//                "What is Forex? "));
//
//        input.add(new My_COurse_Pojo_class(
//                R.drawable.ref3,
//
//                "Why Trade Forex?"
//        ));
//
//
//        input.add(new My_COurse_Pojo_class(
//                R.drawable.ref,
//                "Who Trades Forex?"
//        ));
//
//
//        input.add(new My_COurse_Pojo_class(
//                R.drawable.ref4,
//                "When Can You \n Trade Forex?"));
//
//
//
//        input.add(new My_COurse_Pojo_class(
//                R.drawable.ref,
//                "How Do You \n Trade Forex?"
//
//        ));
//
//
//
//        m_Adapter = new My_Course_Adapter(input);
//        recyclerView_3.setAdapter(m_Adapter);
//
//
//
//
//        int maxSpansPerRow = 6;
//
//
//
//        final GridLayoutManager gridview = new GridLayoutManager(this,maxSpansPerRow);
//
//        gridview.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//
//
//                if (input.size() % 2 == 1)
//
//                {
//                    if (position == input.size() - 1) {
//
//                        return 6;
//
//                    } else {
//
//                        return 3;
//                    }
//                }
//                else {
//
//                    return 3;
//                }
//
//
////                switch (position % 7) {
////                    // first three items span 3 columns each
////                    case 0:
////                    case 1:
////                    case 2:
////                    case 3:
////                    case 4:
////                    case 5:
////                        return 3;
////                    // next four items span 2 columns each
////
////
////                    case 6:
////                        return 6;
////                }
////                return position;
//            }
//
//
//
//        });
//
//        recyclerView_3.setLayoutManager(gridview)


package com.grademojo.forex_2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grademojo.forex.R;

/**
 * Created by sapling_a0 on 12/9/17.
 */

public class Fragment_6_data extends Fragment {


    private TextView textView_ongoing ,textView_Complted,textView_all;

    private View border;

    private TextView navbar;
    private NavigationView navigationView;

    private DrawerLayout navDrawerStart;








    My_course_All_5 my_course_all_5 = new My_course_All_5();
    My_Course_Ongoing_5 my_course_ongoing_5 = new My_Course_Ongoing_5();
    My_Course_Completed_5 my_course_completed_5 = new My_Course_Completed_5();

    Intermediate_41 intermediate_41 = new Intermediate_41();
    Advance_41 advance_41 = new Advance_41();

    FragmentManager main5 = getFragmentManager();






    public static Fragment_6_data newInstance(){
        Fragment_6_data frag = new Fragment_6_data();

        // Retain the fragment instance if the Mother Activity is recreated (say: for portrait to horizontal)
        // If User has typed something It will be retained.
        //frag.setRetainInstance(true);

        return frag;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.actvity_6_layout, container, false);


        textView_ongoing = (TextView) rootView.findViewById(R.id.text_for_Ongoing);
        textView_Complted = (TextView) rootView.findViewById(R.id.text_for_Completed);
        textView_all = (TextView) rootView.findViewById(R.id.text_for_All);

        border = rootView.findViewById(R.id.all_course);


        textView_ongoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                main5.beginTransaction().replace(R.id.frame_5_layout,my_course_ongoing_5).commit();
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

//
                main5.beginTransaction().replace(R.id.frame_5_layout,intermediate_41).commit();

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


                main5.beginTransaction().replace(R.id.frame_5_layout,my_course_all_5).commit();

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


                main5.beginTransaction().replace(R.id.frame_5_layout, advance_41).commit();

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

        return rootView;
    }
}

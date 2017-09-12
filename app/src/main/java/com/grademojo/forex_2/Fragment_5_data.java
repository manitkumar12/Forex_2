package com.grademojo.forex_2;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.util.ArrayList;
import java.util.List;



public class Fragment_5_data extends Fragment{

    private RecyclerView recyclerView1;


    private TextView navbar;

    private DrawerLayout navDrawerStart;

    private My_Adapter_2 myAdapter2;

    private List<My_Course_pojo_second> input2;

    private CardView card_View_course;

    private TextView text_view_course ,textView_suggested_course;

    private Intent i;

    private RecyclerView.LayoutManager layoutManager2;

    private NavigationView navigationView;

    Fragment_6_data fragment_6_data = new Fragment_6_data();

    android.support.v4.app.FragmentManager fm = getFragmentManager();





    public static Fragment_5_data newInstance(){

        Fragment_5_data frag = new Fragment_5_data();

        // Retain the fragment instance if the Mother Activity is recreated (say: for portrait to horizontal)
        // If User has typed something It will be retained.
        //frag.setRetainInstance(true);

        return frag;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_5_layout, container, false);


        recyclerView1 = (RecyclerView) rootView.findViewById(R.id.recylcer_view_2);

        card_View_course = (CardView) rootView.findViewById(R.id.cardview_processed_courses);

        text_view_course = (TextView) rootView.findViewById(R.id.textview_processed_courses);


        textView_suggested_course = (TextView) rootView.findViewById(R.id.text_view_suggested_course);

        card_View_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                i = new Intent(getActivity(), Fragment_6_data.class);
//                startActivity(i);

                  fm.beginTransaction().replace(R.id.fragment_container_main,fragment_6_data).commit();

            }
        });

        text_view_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                i = new Intent(getActivity(), Fragment_6_data.class);
//                startActivity(i);
                  fm.beginTransaction().replace(R.id.fragment_container_main,fragment_6_data).commit();
            }
        });


        textView_suggested_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getActivity(), Main5Activity.class);
                startActivity(i);
            }
        });


        input2 = new ArrayList<>();


        input2.add(new My_Course_pojo_second(
                R.drawable.ref

        ));

        input2.add(new My_Course_pojo_second(
                R.drawable.ref2
        ));


        input2.add(new My_Course_pojo_second(
                R.drawable.ref3

        ));


        input2.add(new My_Course_pojo_second(
                R.drawable.ref4));


        input2.add(new My_Course_pojo_second(
                R.drawable.ref

        ));


        input2.add(new My_Course_pojo_second(
                R.drawable.ref2

        ));


        input2.add(new My_Course_pojo_second(
                R.drawable.ref3
        ));


        myAdapter2 = new My_Adapter_2(input2);
        recyclerView1.setAdapter(myAdapter2);


        recyclerView1.setAdapter(myAdapter2);


        SnapHelper snapHelper1 = new LinearSnapHelper();
        snapHelper1.attachToRecyclerView(recyclerView1);


        layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);


        recyclerView1.setLayoutManager(layoutManager2);

        return rootView;


    }



}

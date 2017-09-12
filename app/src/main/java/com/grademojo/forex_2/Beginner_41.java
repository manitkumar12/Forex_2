package com.grademojo.forex_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

/**
 * Created by sapling_a0 on 21/8/17.
 */

public class Beginner_41 extends Fragment {


    private RecyclerView recyclerView, recyclerView1;

    private My_Adapter mAdapter;



    private My_Adapter_2 myAdapter2;

    private List<My_course_pojo_first> input;


    private List<My_Course_pojo_second> input2;


    private TextView textView_Intermediate ,textView_Advance;

    private TextView textView_mu_course ,textView_suggested_course;

    Intent i;

    private RecyclerView.LayoutManager mLayoutManager, layoutManager2;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.begginer_41, container, false);


        recyclerView = (RecyclerView) rootView.findViewById(R.id.recylcer_view_1);
        recyclerView1 = (RecyclerView) rootView.findViewById(R.id.recylcer_view_2);

        textView_mu_course = (TextView) rootView.findViewById(R.id.text_view_my_course);

        textView_Advance = (TextView) rootView.findViewById(R.id.text_for_Advance);
        textView_Intermediate = (TextView) rootView.findViewById(R.id.text_for_Intermediate);

        textView_suggested_course = (TextView) rootView.findViewById(R.id.text_view_suggested_course);





        textView_mu_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getActivity().getApplication(),Main5Activity.class);
                startActivity(i);
            }
        });


        textView_suggested_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getActivity().getApplication(),Main5Activity.class);
                startActivity(i);
            }
        });


        input = new ArrayList<>();


        input.add(new My_course_pojo_first(
                R.drawable.ref

        ));

        input.add(new My_course_pojo_first(
                R.drawable.ref2
        ));


        input.add(new My_course_pojo_first(
                R.drawable.ref3

        ));


        input.add(new My_course_pojo_first(
                R.drawable.ref4));



        input.add(new My_course_pojo_first(
                R.drawable.ref

        ));


        input.add(new My_course_pojo_first(
                R.drawable.ref2

        ));


        input.add(new My_course_pojo_first(
                R.drawable.ref3
        ));



        mAdapter = new My_Adapter(input);
        recyclerView.setAdapter(mAdapter);




        recyclerView.setAdapter(mAdapter);


        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);







        mLayoutManager = new LinearLayoutManager(this.getActivity(),LinearLayoutManager.HORIZONTAL,false);


        recyclerView.setLayoutManager(mLayoutManager);


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


        input.add(new My_course_pojo_first(
                R.drawable.ref3
        ));



        myAdapter2 = new My_Adapter_2(input2);
        recyclerView1.setAdapter(myAdapter2);




        recyclerView1.setAdapter(myAdapter2);


        SnapHelper snapHelper1 = new LinearSnapHelper();
        snapHelper1.attachToRecyclerView(recyclerView1);







        layoutManager2 = new LinearLayoutManager(this.getActivity(),LinearLayoutManager.HORIZONTAL,false);


        recyclerView1.setLayoutManager(layoutManager2);









        return  rootView;


    }
}

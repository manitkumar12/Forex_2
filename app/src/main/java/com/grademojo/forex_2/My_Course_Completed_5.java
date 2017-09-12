package com.grademojo.forex_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class My_Course_Completed_5 extends Fragment {


    private RecyclerView recyclerView_3;

    private My_Course_Adapter m_Adapter;




    private TextView textView_ongoing ,textView_Complted;



    private List<My_COurse_Pojo_class> input;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.my_course_all_5,container,false);



        recyclerView_3 = (RecyclerView) rootview.findViewById(R.id.recycler_view_3);


        textView_ongoing = (TextView) rootview.findViewById(R.id.text_for_Ongoing);
        textView_Complted = (TextView) rootview.findViewById(R.id.text_for_Completed);





//        textView_ongoing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getActivity().getApplication().this, a.class);
//                startActivity(i);
//            }
//        });
//
//
//        textView_Complted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                Intent  i = new Intent(Main5Activity.this,Completed_5.class);
//                startActivity(i);
//            }
//        });



        input = new ArrayList<>();


        input.add(new My_COurse_Pojo_class(
                R.drawable.ref2,

                "What is Forex? "));

        input.add(new My_COurse_Pojo_class(
                R.drawable.ref3,

                "Why Trade Forex?"
        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.ref,
                "Who Trades Forex?"
        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.ref4,
                "When Can You \n Trade Forex?"));



        input.add(new My_COurse_Pojo_class(
                R.drawable.ref,
                "How Do You \n Trade Forex?"

        ));



        m_Adapter = new My_Course_Adapter(input);
        recyclerView_3.setAdapter(m_Adapter);




        int maxSpansPerRow = 6;



        final GridLayoutManager gridview = new GridLayoutManager(getActivity(),maxSpansPerRow);

        gridview.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {


                if (input.size() % 2 == 1)

                {
                    if (position == input.size() - 1) {

                        return 6;

                    } else {

                        return 3;
                    }
                }
                else {

                    return 3;
                }


//                switch (position % 7) {
//                    // first three items span 3 columns each
//                    case 0:
//                    case 1:
//                    case 2:
//                    case 3:
//                    case 4:
//                    case 5:
//                        return 3;
//                    // next four items span 2 columns each
//
//
//                    case 6:
//                        return 6;
//                }
//                return position;
            }



        });

        recyclerView_3.setLayoutManager(gridview);



        return rootview;
    }
}
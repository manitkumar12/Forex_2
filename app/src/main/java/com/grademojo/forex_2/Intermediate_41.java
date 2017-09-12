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

public class Intermediate_41 extends Fragment {

    private RecyclerView recyclerView_3;

    private Intermediate_Adapter m_Adapter;




    private TextView textView_ongoing ,textView_Complted;



    private List<My_COurse_Pojo_class> input;






    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.intermediate_41, container, false);



        recyclerView_3 = (RecyclerView) rootView.findViewById(R.id.recycler_view_3);


        textView_ongoing = (TextView) rootView.findViewById(R.id.text_for_Ongoing);
        textView_Complted = (TextView) rootView.findViewById(R.id.text_for_Completed);





        input = new ArrayList<>();


        input.add(new My_COurse_Pojo_class(
                R.drawable.ref4,


                "How to Develop a\n Trading Plan ?"


        ));

        input.add(new My_COurse_Pojo_class(
                R.drawable.ref2,

                "How to build a \ntrading plan ?"
        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.ref3,
                "Why am I trading ?"
        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.ref,
                "What is your motivation ?"));



        input.add(new My_COurse_Pojo_class(
                R.drawable.advance_2,
                "Is the amount of money I have to trade with sensible to achieve my goals ?"

        ));


        input.add(new My_COurse_Pojo_class(
                R.drawable.advance_3,
                "How to match your goals to a trading style ?"

        ));
        input.add(new My_COurse_Pojo_class(
                R.drawable.advance_1,
                "Why a trading plan \ni s important ? "

        ));




        m_Adapter = new Intermediate_Adapter(input);
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





        return rootView;
    }
}

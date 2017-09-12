package com.grademojo.forex_2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.util.List;

/**
 * Created by sapling_a0 on 29/8/17.
 */

class Intermediate_Adapter extends RecyclerView.Adapter<Intermediate_Adapter.ViewHolder> {


private List<My_COurse_Pojo_class> value1;

    private int i;

        Context context;





public class ViewHolder extends RecyclerView.ViewHolder {


    public TextView textView_My_course;

    public ImageView image_My_Courses;


    public View layout_view;


    public ViewHolder(View itemView) {

        super(itemView);


        layout_view = itemView;

        textView_My_course = (TextView) itemView.findViewById(R.id.my_course_text_view);

        image_My_Courses = (ImageView) itemView.findViewById(R.id.my_course_images);


    }

}



    public Intermediate_Adapter( List<My_COurse_Pojo_class> my_data)
    {
        value1 = my_data;

    }




    @Override
    public Intermediate_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.my_course_relative_card_view,parent,false);

        Intermediate_Adapter.ViewHolder viewHolder = new Intermediate_Adapter.ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(Intermediate_Adapter.ViewHolder holder, final int position) {


        My_COurse_Pojo_class item = value1.get(position);


        String my_course_text_1 = value1.get(position).getMy_course_text();


        holder.image_My_Courses.setBackgroundResource(item.getMy_image_course());


        holder.textView_My_course.setText(""+my_course_text_1);

        context = holder.image_My_Courses.getContext();


        holder.image_My_Courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==0)
                {

                    Intent i = new Intent(context,Intermediate_first_question.class);
                    context.startActivity(i);



                }

                else  if (i==1)

                {

                    Intent i = new Intent(context,Intermediate_second_question.class);
                    context.startActivity(i);



                }


                else  if (i==2)

                {

                    Intent i = new Intent(context,Intermediate_third_question.class);
                    context.startActivity(i);



                }


                else  if (i==3)

                {

                    Intent i = new Intent(context,Intermediate_fourth_question.class);
                    context.startActivity(i);



                }

                else  if (i==4)

                {

                    Intent i = new Intent(context,Intermediate_five_question.class);
                    context.startActivity(i);


                }


                else  if (i==5)

                {

                    Intent i = new Intent(context,Intermediate_six_question.class);
                    context.startActivity(i);



                }


                else  if (i==6)

                {

                    Intent i = new Intent(context,Intermediate_seven_question.class);
                    context.startActivity(i);


                }
                else {

                    Intent i = new Intent(context,Main6Activity.class);
                    context.startActivity(i);

                }
            }
        });







//        holder.border_View.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_1()));
//
//        holder.border_View_first.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_2()));
//
//        holder.border_View_second.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_3()));

    }



    @Override
    public int getItemCount() {
        return value1.size();
    }

}


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

class Advance_Adapter extends RecyclerView.Adapter<Advance_Adapter.ViewHolder> {


private List<My_COurse_Pojo_class> value2;

        Context context;
        int i;





public class ViewHolder extends RecyclerView.ViewHolder {


    private TextView textView_My_course;

    private ImageView image_My_Courses;




    public View layout_view;


    public ViewHolder(View itemView) {

        super(itemView);


        layout_view = itemView;

        textView_My_course = (TextView) itemView.findViewById(R.id.my_course_text_view);

        image_My_Courses = (ImageView) itemView.findViewById(R.id.my_course_images);


    }

}



    public Advance_Adapter(List<My_COurse_Pojo_class> my_data)
    {
        value2 = my_data;

    }




    @Override
    public Advance_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.my_course_relative_card_view,parent,false);

        Advance_Adapter.ViewHolder viewHolder = new Advance_Adapter.ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(Advance_Adapter.ViewHolder holder, final int position) {


        final My_COurse_Pojo_class item = value2.get(position);


        String my_course_text_1 = value2.get(position).getMy_course_text();


        holder.image_My_Courses.setBackgroundResource(item.getMy_image_course());


        holder.textView_My_course.setText(""+my_course_text_1);

        context = holder.image_My_Courses.getContext();


        holder.image_My_Courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==0)
                {

                    Intent i = new Intent(context,Advance_first_question.class);
                    context.startActivity(i);



                }

                else  if (i==1)

                {

                    Intent i = new Intent(context,Advance_second_question.class);
                    context.startActivity(i);



                }


                else  if (i==2)

                {

                    Intent i = new Intent(context,Advance_third_question.class);
                    context.startActivity(i);



                }


                else  if (i==3)

                {

                    Intent i = new Intent(context,Advance_fourth_question.class);
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

                else {

                    Intent i = new Intent(context,Main6Activity.class);
                    context.startActivity(i);

                }
            }
        });







    }



    @Override
    public int getItemCount() {
        return value2.size();
    }

}


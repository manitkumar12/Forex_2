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
 * Created by sapling_a0 on 18/8/17.
 */

public class My_Course_Adapter extends RecyclerView.Adapter<My_Course_Adapter.ViewHolder> {


    private List<My_COurse_Pojo_class> value1;

    Context context;





    public class ViewHolder extends RecyclerView.ViewHolder{


        public TextView textView_My_course;

        public ImageView image_My_Courses;



        public View layout_view;


        public ViewHolder(View itemView) {

            super(itemView);


            layout_view =itemView;

            textView_My_course = (TextView) itemView.findViewById(R.id.my_course_text_view);

            image_My_Courses = (ImageView) itemView.findViewById(R.id.my_course_images);






        }
    }


    public My_Course_Adapter( List<My_COurse_Pojo_class> my_data)
    {
        value1 = my_data;

    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.my_course_relative_card_view,parent,false);

        My_Course_Adapter.ViewHolder viewHolder = new My_Course_Adapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        My_COurse_Pojo_class item = value1.get(position);


        String my_course_text_1 = value1.get(position).getMy_course_text();


        holder.image_My_Courses.setBackgroundResource(item.getMy_image_course());


        holder.textView_My_course.setText(""+my_course_text_1);

        context = holder.image_My_Courses.getContext();




        holder.image_My_Courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,Main6Activity.class);
                context.startActivity(i);
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


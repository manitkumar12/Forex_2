package com.grademojo.forex_2;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
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

public class My_Course_Forex_Adapter extends RecyclerView.Adapter<My_Course_Forex_Adapter.ViewHolder> {


    private List<My_Course_Forex_Pojo> value1_2;

    private int i;

    private Context context, context1, context2 ;




    public class ViewHolder extends RecyclerView.ViewHolder{

        public View border_forex;


        public TextView textView_My_course_forex, time , text_view_points;

        public ImageView image_My_Courses_forex;



        public View layout_view;


        public ViewHolder(View itemView) {

            super(itemView);


            layout_view =itemView;

            textView_My_course_forex = (TextView) itemView.findViewById(R.id.forex_text_view_my_course);

            image_My_Courses_forex = (ImageView) itemView.findViewById(R.id.forex_play_icon_my_course);

            time = (TextView) itemView.findViewById(R.id.timing);



            text_view_points = (TextView) itemView.findViewById(R.id.points);

            border_forex  = itemView.findViewById(R.id.forex_border_my_course);







        }
    }


    public My_Course_Forex_Adapter(List<My_Course_Forex_Pojo> my_data_2)
    {

        value1_2 = my_data_2;

    }




    @Override
    public My_Course_Forex_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.my_course_forex_relative,parent,false);

        My_Course_Forex_Adapter.ViewHolder viewHolder;
        viewHolder = new ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(final My_Course_Forex_Adapter.ViewHolder holder, int position) {


        final My_Course_Forex_Pojo item = value1_2.get(position);




        String my_course_text_2 = value1_2.get(position).getIntroduction();

        String timing_2 = value1_2.get(position).getTimimg_1();



        String points_2 = value1_2.get(position).getPoints();


        holder.image_My_Courses_forex.setBackgroundResource(item.getImage_icon());

        holder.border_forex.setBackgroundResource(item.getView_1());


       holder.textView_My_course_forex.setText(""+my_course_text_2);

        holder.time.setText(""+timing_2);


        holder.text_view_points.setText(""+points_2);


        context = holder.textView_My_course_forex.getContext();
        context1 = holder.image_My_Courses_forex.getContext();
        context2 = holder.border_forex.getContext();
       // context4 = holder.time.getContext();


        holder.textView_My_course_forex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {

                   holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

                    Intent i = new Intent(context, Beginner_forex_video_first_question.class);
                    context.startActivity(i);


                } else if (i == 1) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

                    Intent i = new Intent(context, Beginner_forex_video_second_question.class);
                    context.startActivity(i);
                } else if (i == 2) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

                    Intent i = new Intent(context, Beginner_forex_video_third_question.class);
                    context.startActivity(i);
                } else if (i == 3) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

                    Intent i = new Intent(context, Beginner_forex_video_fourth_question.class);
                    context.startActivity(i);
                } else if (i == 4) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

                    Intent i = new Intent(context, Beginner_forex_video_five_question.class);
                    context.startActivity(i);
                } else if (i == 5) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

                    Intent i = new Intent(context, Beginner_forex_video_six_question.class);
                    context.startActivity(i);
                } else if (i == 6) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

                    Intent i = new Intent(context, Beginner_forex_video_seven_question.class);
                    context.startActivity(i);
                }

            }
        });


        holder.image_My_Courses_forex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (i == 0) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context1, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context1,R.color.grey));



                    Intent i = new Intent(context1, Beginner_forex_video_first_question.class);
                    context1.startActivity(i);

                } else if (i == 1) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context1, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context1,R.color.grey));

                    Intent i = new Intent(context1, Beginner_forex_video_second_question.class);
                    context1.startActivity(i);
                } else if (i == 2) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context1, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context1,R.color.grey));

                    Intent i = new Intent(context1, Beginner_forex_video_third_question.class);
                    context1.startActivity(i);
                } else if (i == 3) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context1, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context1,R.color.grey));

                    Intent i = new Intent(context1, Beginner_forex_video_fourth_question.class);
                    context1.startActivity(i);
                } else if (i == 4) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context1, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context1,R.color.grey));

                    Intent i = new Intent(context1, Beginner_forex_video_five_question.class);
                    context1.startActivity(i);
                } else if (i == 5) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context1, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context1,R.color.grey));

                    Intent i = new Intent(context1, Beginner_forex_video_six_question.class);
                    context1.startActivity(i);
                } else if (i == 6) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context1, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context1,R.color.grey));

                    Intent i = new Intent(context1, Beginner_forex_video_seven_question.class);
                    context1.startActivity(i);
                }

            }
        });

        holder.border_forex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (i == 0) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context2, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context2,R.color.grey));

                    Intent i = new Intent(context2, Beginner_forex_video_first_question.class);
                    context2.startActivity(i);


                } else if (i == 1) {


                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context2, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context2,R.color.grey));

                    Intent i = new Intent(context2, Beginner_forex_video_second_question.class);
                    context2.startActivity(i);
                } else if (i == 2) {


                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context2, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context2,R.color.grey));

                    Intent i = new Intent(context2, Beginner_forex_video_third_question.class);
                    context2.startActivity(i);
                } else if (i == 3) {


                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context2, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context2,R.color.grey));


                    Intent i = new Intent(context2, Beginner_forex_video_fourth_question.class);
                    context2.startActivity(i);
                } else if (i == 4) {


                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context2, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context2,R.color.grey));

                    Intent i = new Intent(context2, Beginner_forex_video_five_question.class);
                    context2.startActivity(i);
                } else if (i == 5) {


                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context2, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context2,R.color.grey));

                    Intent i = new Intent(context2, Beginner_forex_video_six_question.class);
                    context2.startActivity(i);
                } else if (i == 6) {


                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context2, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context2,R.color.grey));

                    Intent i = new Intent(context2, Beginner_forex_video_six_question.class);
                    context2.startActivity(i);
                }

                else {



                }


            }
        });


//        holder.border_forex.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_1()));


//        holder.border_View.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_1()));
//
//        holder.border_View_first.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_2()));
//
//        holder.border_View_second.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_3()));


    }


            @Override
            public int getItemCount() {
                return value1_2.size();
            }
        }




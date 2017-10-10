package com.grademojo.forex_2;

import android.app.FragmentManager;
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



public class My_Course_Forex_Adapter extends RecyclerView.Adapter<My_Course_Forex_Adapter.ViewHolder> {


    private List<My_Course_Forex_Pojo> value1_2;

    private int i;

    private Context context, context1, context2,context4 ;

    Fragment_6_beginner_forex_data fragment_6_beginner_forex_data = new Fragment_6_beginner_forex_data();

    Beginner_forex_video_first_question beginner_forex_video_first_question = new Beginner_forex_video_first_question();

    FragmentManager fm  ;



    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        public View border_forex;


        public TextView textView_My_course_forex, time , text_view_points;

        public ImageView image_My_Courses_forex;



        public View layout_view;

        public interface ViewHolderClickListener {
            public void onView(int position);
        }

        public ViewHolderClickListener listener;



        public ViewHolder(View itemView , ViewHolderClickListener mListener) {

            super(itemView);

            listener = mListener;


            layout_view =itemView;

            textView_My_course_forex = (TextView) itemView.findViewById(R.id.forex_text_view_my_course);

            image_My_Courses_forex = (ImageView) itemView.findViewById(R.id.forex_play_icon_my_course);

            time = (TextView) itemView.findViewById(R.id.timing);



            text_view_points = (TextView) itemView.findViewById(R.id.points);

            border_forex  = itemView.findViewById(R.id.forex_border_my_course);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();

            listener.onView(position);

        }
    }


    public interface AdapToParentListener{
        public void adapToParent(int position);
    }

    private AdapToParentListener listener;


    public My_Course_Forex_Adapter(List<My_Course_Forex_Pojo> my_data_2, AdapToParentListener mListener) {


        listener = mListener;
        value1_2 = my_data_2;
    }






    @Override
    public My_Course_Forex_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.my_course_forex_relative,parent,false);


        ViewHolder viewHolder = new ViewHolder(view, new ViewHolder.ViewHolderClickListener() {
            @Override
            public void onView(int position) {

                listener.adapToParent(position);

            }
        });

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(final My_Course_Forex_Adapter.ViewHolder holder, int position) {


        My_Course_Forex_Pojo item = value1_2.get(position);








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

//                    ((FragmentActivity)context4).getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.fragment_container_main,beginner_forex_video_first_question)
//                            .commit();
//
//                    fm.beginTransaction().replace(R.id.fragment_container_main,beginner_forex_video_first_question).commit();



//                    Intent i = new Intent(context, Beginner_forex_video_first_question.class);
//                    context.startActivity(i);


                } else if (i == 1) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));


//                   Intent i = new Intent(context,Beginner_forex_video_second_question.class);
//
//                    context.startActivity(i);
                } else if (i == 2) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

//                    Intent i = new Intent(context, Beginner_forex_video_third_question.class);
//                    context.startActivity(i);
                } else if (i == 3) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

//                    Intent i = new Intent(context, Beginner_forex_video_fourth_question.class);
//                    context.startActivity(i);
                } else if (i == 4) {

                    holder.textView_My_course_forex.setTextColor(ContextCompat.getColor(context, R.color.green));
                    holder.image_My_Courses_forex.setImageResource(R.drawable.green_icon);
                    holder.border_forex.setBackgroundResource(R.color.green);
                    holder.time.setTextColor(ContextCompat.getColor(context,R.color.grey));

//                    ((FragmentActivity)context).getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.fragment_container_main,fragment_6_beginner_forex_data).commit();

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




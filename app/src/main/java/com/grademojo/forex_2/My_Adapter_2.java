package com.grademojo.forex_2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.grademojo.forex.R;

import java.util.List;


public class My_Adapter_2 extends RecyclerView.Adapter<My_Adapter_2.ViewHolder> {


    private List<My_Course_pojo_second> value;

    Context context;


    public class ViewHolder extends RecyclerView.ViewHolder{





        public ImageView text_Name ;

        public View layout;



        public ViewHolder(View itemView) {

            super(itemView);

            layout = itemView;
            text_Name = (ImageView) itemView.findViewById(R.id.mani);














//            text_Present.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    remove(getAdapterPosition());
//                }
//            });
        }



    }


    public My_Adapter_2(List<My_Course_pojo_second> myDataset) {


        value = myDataset;
    }






    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.card_view_recycler_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    public void onBindViewHolder(ViewHolder holder, int position) {

        My_Course_pojo_second item = value.get(position);
        context = holder.text_Name.getContext();






        holder.text_Name.setBackgroundResource(item.getMy_image_course());



        holder.text_Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,Main6Activity.class);
                context.startActivity(i);
            }
        });





    }

    @Override
    public int getItemCount() {
        return value.size();
    }


    // Information current=data.get(position);
    //   holder.title.setText(current.title);

    // holder.title.setText(current.title);


    //Integer.parseInt(view.getTag().toString())











//    public void remove(int position){
//
//        values.remove(position);
//        notifyItemRemoved(position);
//
//    }
}


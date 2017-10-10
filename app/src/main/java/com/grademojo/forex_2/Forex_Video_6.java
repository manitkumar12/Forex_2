package com.grademojo.forex_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.grademojo.forex.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Forex_Video_6 extends Fragment {


    private RecyclerView recyclerView_4, recyclerView_5;



    private TextView textView_hometask, textView_article;

    private WebView webView;




    private My_Course_Forex_Adapter my_course_forex_adapter;

    private YouTube_Adapter_class youTube_adapter_class;



    private Vector<You_tube_Video> you_tube_videos= new  Vector<You_tube_Video>();

    private RecyclerView.LayoutManager mLayoutManager;



    private List<My_Course_Forex_Pojo> input;

    String frameVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/e-EL0Mf4MTs?rel=0\" frameborder=\"0\" allowfullscreen></iframe> ? autoplay = 1";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.forex_video_6, container, false);



        recyclerView_4 = (RecyclerView) rootView.findViewById(R.id.recycler_view_4);
        webView = (WebView) rootView.findViewById(R.id.web);



        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadData(frameVideo, "text/html", "utf-8");




//        recyclerView_5 = (RecyclerView) rootView.findViewById(R.id.recycler_view_5);

//        recyclerView_5.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView_5.setHasFixedSize(true);



//        you_tube_videos.add(new You_tube_Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/e-EL0Mf4MTs\" frameborder=\"0\" allowfullscreen></iframe>"));


////         you_tube_videos.add( new You_tube_Video("\"<iframe width=\\\"100%\\\" height=\\\"100%\\\" src=\\\"https://www.youtube.com/embed/e-EL0Mf4MTs\\\" frameborder=\\\"0\\\" allowfullscreen></iframe>\"");
//        youTube_adapter_class= new YouTube_Adapter_class(you_tube_videos);
//
//        recyclerView_5.setAdapter(youTube_adapter_class);








        mLayoutManager = new LinearLayoutManager(getActivity());

        recyclerView_4.setLayoutManager(mLayoutManager);
        input = new ArrayList<>();


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,

                "What is Forex? ", R.color.grey,"3-min","5 points"));

        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,"When can I trade Forex ?"

                , R.color.grey,"3-min","5 points"
        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "Why trade forex", R.color.grey,"4-min","5 points"
        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "Charting Basics "
                , R.color.grey,"3-min","5 points"
        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "Understanding Technical \n Analysis", R.color.grey,"3-min","5 points"

        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "Five Key Drivers of \nthe Forex Markets", R.color.grey,"5-min"
                ,"5 points"

        ));


        input.add(new My_Course_Forex_Pojo(
                R.drawable.grey_icon,
                "What Is Fundamental \n Analysis", R.color.grey,"4-min","5 points"

        ));






        my_course_forex_adapter = new My_Course_Forex_Adapter(input, new My_Course_Forex_Adapter.AdapToParentListener() {
            @Override
            public void adapToParent(int position) {

                if (position==0)
                {

                    Intent i = new Intent(getActivity(),Beginner_forex_video_first_question.class);
                    startActivity(i);
                }

            }
        });
        recyclerView_4.setAdapter(my_course_forex_adapter);






        return rootView;
    }
}

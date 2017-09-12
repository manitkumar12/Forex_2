package com.grademojo.forex_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.grademojo.forex.R;

public class Beginner_forex_video_seven_question extends AppCompatActivity {


    WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_forex_video_seven_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        load();
    }

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Trading economic releases can be a very tenuous and unpredictable challenge. Many of the greatest minds at the major investment banks around the world have a difficult time predicting exactly what an economic release will ultimately end up being. They have models that take many different aspects into account, but can still be embarrassingly wrong in their predictions; hence the reason that markets move so violently after important economic releases. Many investors tend to go with the “consensus” of those experts, and typically markets will move in the direction of the consensus prediction before the release. If the consensus fails to predict the final result, the market then usually moves in the direction of the actual result – meaning that if it was better than consensus, a positive reaction unfolds and vice versa for a less-than-consensus result. The trick to trading the fundamental aspect of economic releases is to determine when you want to make your commitment. Do you trade before or after the figure is released? Both have their merits and their detractions. If you trade well before the release, you can try to take advantage of the flow toward the consensus expectation, but other fundamental events around the world can impact the market more than the consensus read. Trading moments before the economic release means that you have an opinion on whether the actual release will be better or worse than the consensus, but you could be dreadfully wrong and risk large losses on essentially a coin flip. Trading moments after the economic release means that you will be trying to establish a position in a low-volume market which presents the challenge of getting your desired price.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");


    }
}


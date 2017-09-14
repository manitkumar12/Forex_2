package com.grademojo.forex_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sapling_a0 on 13/9/17.
 */

public class Fragment_6_beginner_forex_data extends Fragment {





    public static Fragment_6_beginner_forex_data newInstance(){
        Fragment_6_beginner_forex_data frag = new Fragment_6_beginner_forex_data();

        // Retain the fragment instance if the Mother Activity is recreated (say: for portrait to horizontal)
        // If User has typed something It will be retained.
        //frag.setRetainInstance(true);

        return frag;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

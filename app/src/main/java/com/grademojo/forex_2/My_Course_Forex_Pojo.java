package com.grademojo.forex_2;

/**
 * Created by sapling_a0 on 18/8/17.
 */

public class My_Course_Forex_Pojo {


    private String introduction;


    private String timimg_1;

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    private String points;

    private int image_icon;

    private int view_1;

    public String getTimimg_1() {
        return timimg_1;
    }






    My_Course_Forex_Pojo(int ic, String s ,int v1, String s1 ,String p1 ) {
        this.image_icon= ic;
        this.introduction = s;
        this.view_1 = v1;
        this.timimg_1 = s1;

        this.points = p1;



    }



    public String getIntroduction() {
        return introduction;
    }

    public int getImage_icon() {
        return image_icon;
    }

    public int getView_1() {
        return view_1;
    }



    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setImage_icon(int image_icon) {
        this.image_icon = image_icon;
    }

    public void setView_1(int view_1) {
        this.view_1 = view_1;
    }

    public void setTimimg_1(String timimg_1) {
        this.timimg_1 = timimg_1;
    }







}
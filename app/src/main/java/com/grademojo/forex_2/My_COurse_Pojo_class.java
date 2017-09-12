package com.grademojo.forex_2;

/**
 * Created by sapling_a0 on 18/8/17.
 */

public class My_COurse_Pojo_class extends My_course_pojo_first {


    private String my_course_text;

    private int my_image_course;




    My_COurse_Pojo_class(int ic, String s) {
        this.my_image_course = ic;
        this.my_course_text = s;


    }




    public String getMy_course_text() {
        return my_course_text;
    }

    public int getMy_image_course() {
        return my_image_course;
    }



    public void setMy_course_text(String my_course_text) {
        this.my_course_text = my_course_text;
    }

    public void setMy_image_course(int my_image_course) {
        this.my_image_course = my_image_course;
    }







}

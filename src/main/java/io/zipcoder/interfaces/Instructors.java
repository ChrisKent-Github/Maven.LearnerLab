package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();


    private Instructors(){

    }


    public static Instructors getInstance(){
        return INSTANCE;
    }




}
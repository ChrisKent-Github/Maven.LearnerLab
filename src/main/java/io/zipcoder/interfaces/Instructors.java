package io.zipcoder.interfaces;

import java.sql.Array;
import java.util.ArrayList;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();


    private Instructors(){
//        this.add(new Instructor(321, "Fred"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
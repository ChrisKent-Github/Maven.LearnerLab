package io.zipcoder.interfaces;

import java.sql.Array;
import java.util.ArrayList;

public class Students extends People {
    private static final Students INSTANCE = new Students();


    private Students(){
//        add(new Student(123, "Lisa"));
//        add(new Student(234,"Rico"));
//        add(new Student(345,"Sarah"));
//        add(new Student(456,"AJ"));
//        add(new Student(567,"Berlin"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}

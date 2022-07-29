package io.zipcoder.interfaces;

import java.sql.Array;
import java.util.ArrayList;

public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();


    Students(){
//        this.add(new Student(123, "Lisa"));
//        this.add(new Student(234, "Rico"));
//        this.add(new Student(345, "Sarah"));
//        this.add(new Student(456, "AJ"));
//        this.add(new Student(567, "Berlin"));

    }

    public static Students getInstance(){
        return INSTANCE;
    }

    //    public Student[] getArray(){
//
//    }
}

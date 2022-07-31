package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();


    private Instructors(){
//    Instructor instructor = new Instructor (1234, "Autumn");
//    Instructor instructor2 = new Instructor (2345, "Andrew");
//    Instructor instructor3 = new Instructor (3456, "Adam");
//    Instructor instructor4 = new Instructor (4567, "Izzy");
//   personList = new ArrayList<Instructor>(Arrays.asList(instructor, instructor2, instructor3, instructor4));
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }

    public List<Instructor> getInstructors() {
        return personList;
    }

    public Instructor getInstructor(long id) {
        for (Person ins : INSTANCE.toArray()) {
            if (ins.getId() == id) {
                return (Instructor) ins;
            }
        }
        return null;
    }


//    public Instructor[] getArray(){
//
//    }

}
package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        //Given
        Students students = Students.getInstance();
        ZipCodeWilmington zcw = new ZipCodeWilmington();

        Instructor instructor = new Instructor(456, "Autumn");
        Student student10 = new Student(111, "Carlos");
        Student student20 = new Student(222, "Micah");
        Student student30 = new Student(333, "Nikki");
        Student student40 = new Student(444, "Mariah");
        Learner[] cohort = new Learner[4];
        for (int i = 0; i < cohort.length; i++) {
            cohort[i] = (Learner) students.personList.get(i);
        }
//        students.add(student10);
//        students.add(student20);
//        students.add(student30);
//        students.add(student40);

        //When
        zcw.hostLecture(456,80.0, cohort);
        double expectedHours = 20.0;
        //Then
        Assert.assertEquals(expectedHours, student30.getTotalStudyTime(), .1);
        students.removeAll();
    }
}

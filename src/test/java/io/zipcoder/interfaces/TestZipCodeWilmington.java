package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLectureById(){
        //Given
        Students students = Students.getInstance();
        ZipCodeWilmington zcw = new ZipCodeWilmington();

        Instructor instructor = new Instructor(456, "Autumn");
        Student student10 = new Student(111, "Carlos");
        Student student20 = new Student(222, "Micah");
        Student student30 = new Student(333, "Nikki");
        Student student40 = new Student(444, "Mariah");
        Learner[] cohort = new Learner[4];
        cohort[0] = (Learner) students.findById(111);
        cohort[1] = (Learner) students.findById(222);
        cohort[2] = (Learner) students.findById(333);
        cohort[3] = (Learner) students.findById(444);

        //When
        zcw.hostLecture(456,80.0, cohort);
        double expectedHours = 20.0;
        //Then
        Assert.assertEquals(expectedHours, student30.getTotalStudyTime(), .1);
        students.removeAll();
    }

    @Test
    public void testHostLectureByInstructor(){
        //Given
        Students students = Students.getInstance();
        ZipCodeWilmington zcw = new ZipCodeWilmington();

        Instructor instructor = new Instructor(456, "Autumn");
        Student student10 = new Student(111, "Carlos");
        Student student20 = new Student(222, "Micah");
        Student student30 = new Student(333, "Nikki");
        Student student40 = new Student(444, "Mariah");
        Learner[] cohort = new Learner[4];
        cohort[0] = (Learner) students.findById(111);
        cohort[1] = (Learner) students.findById(222);
        cohort[2] = (Learner) students.findById(333);
        cohort[3] = (Learner) students.findById(444);

        //When
        zcw.hostLecture(instructor,80.0, cohort);
        double expectedHours = 20.0;
        //Then
        Assert.assertEquals(expectedHours, student30.getTotalStudyTime(), .1);
        students.removeAll();
    }
}

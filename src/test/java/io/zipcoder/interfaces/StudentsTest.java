package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void testStudents(){
        //Given

        Students testStudents = Students.getInstance();
        //When
        Student student1 = new Student(012, "Lisa");
        Student student2 = new Student(123, "Rico");
        Student student3 = new Student(234, "Sarah");
        Student student4 = new Student(345, "Travis");

        //Then
        Assert.assertTrue(testStudents.getInstance().contains(student1));
        Assert.assertTrue(testStudents.getInstance().contains(student2));
        Assert.assertTrue(testStudents.getInstance().contains(student3));
        Assert.assertTrue(testStudents.getInstance().contains(student4));
        testStudents.removeAll();
    }

}

package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudents(){
        //Given
        //Instance static in Students
        //When
        Student student1 = new Student(012, "Lisa");
        Student student2 = new Student(123, "Rico");
        Student student3 = new Student(234, "Sarah");
        Student student4 = new Student(345, "Travis");

        //Then
        Assert.assertTrue(Students.getInstance().contains(student1));
        Assert.assertTrue(Students.getInstance().contains(student2));
        Assert.assertTrue(Students.getInstance().contains(student3));
        Assert.assertTrue(Students.getInstance().contains(student4));
    }
}

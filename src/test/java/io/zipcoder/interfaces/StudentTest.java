package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {


    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(0, "giancarlo");
        //When
        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(0, "giancarlo");
        //When
        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(0, "giancarlo");
        //When
        student.learn(40.0);
        student.learn(20.0);
        student.learn(5.0);
        double expectedHours = 65.0;
        //Then
        Assert.assertEquals(expectedHours, student.getTotalStudyTime(), .1);
    }
}
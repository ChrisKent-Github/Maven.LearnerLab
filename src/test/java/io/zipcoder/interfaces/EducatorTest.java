package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testTeach(){
        //Given
        Educator educator = Educator.AUTUMN;
        Student student = new Student(1, "Charity");
        //When
        educator.teach(student, 6.0);
        //Then
        Assert.assertEquals(6.0, student.getTotalStudyTime(),.1);
        Assert.assertEquals(6.0, educator.getTimeWorked(),.1);
    }

    @Test
    public void testLecture(){
        //Given
        Educator educator = Educator.IZZY;
        Student student1 = new Student(1, "Charity");
        Student student2 = new Student(2, "Sean");
        Student student3 = new Student(3, "Brandi");
        Student student4 = new Student(4, "AJ");
        Learner[] cohort = new Learner[4];
        cohort[0] = student1;
        cohort[1] = student2;
        cohort[2] = student3;
        cohort[3] = student4;
        //When
        educator.lecture(cohort, 101);
        double expectedHours = 25.25;
        //Then
        Assert.assertEquals(expectedHours, student1.getTotalStudyTime(), .1);

    }
}

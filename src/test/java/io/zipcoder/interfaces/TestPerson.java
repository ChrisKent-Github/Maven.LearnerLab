package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void testConstructor(){
        //Given
        Person person = new Person(0, "bob");
        //When
        long idExpected = 0;
        String nameExpected = "bob";
        //Then
        Assert.assertEquals(idExpected, person.getId());
        Assert.assertEquals(nameExpected, person.getName());
    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person(1, "notbob");
        //When
        String newNameExpected = "giancarlo";
        person.setName("giancarlo");
        //Then
        Assert.assertEquals(newNameExpected, person.getName());
    }


}

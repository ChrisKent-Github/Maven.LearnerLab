package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestPeople {

    @Test
    public void testAdd(){
        //Given
        People people = new People();
        //When

        Person person1 = new Person(0, "Lisa");
        Person person2 = new Person(1, "Rico");
        Person person3 = new Person(2, "Sarah");
        Person person4 = new Person(3, "Travis");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        Integer expectedSize = people.count();
        //Then
        Assert.assertEquals(expectedSize, people.count());
    }

    @Test
    public void testRemoveById(){
        //Given
        People<Person> people = new People<Person>();
        //When

        Person person1 = new Person(0, "Lisa");
        Person person2 = new Person(1, "Rico");
        Person person3 = new Person(2, "Sarah");
        Person person4 = new Person(3, "Travis");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        Integer expectedSize = 3;
        people.remove(0);
        //Then
        Assert.assertEquals(expectedSize, people.count());
    }

    @Test
    public void testRemoveByPerson(){
        //Given
        People<Person> people = new People<Person>();
        //When

        Person person1 = new Person(0, "Lisa");
        Person person2 = new Person(1, "Rico");
        Person person3 = new Person(2, "Sarah");
        Person person4 = new Person(3, "Travis");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        Integer expectedSize = 3;
        people.remove(person1);
        //Then
        Assert.assertEquals(expectedSize, people.count());
    }

    @Test
    public void testFindById(){
        //Given
        People<Person> people = new People<Person>();
        //When

        Person person1 = new Person(0, "Lisa");
        Person person2 = new Person(1, "Rico");
        Person person3 = new Person(2, "Sarah");
        Person person4 = new Person(3, "Travis");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        Person expectedPerson = people.findById(2);
        //Then
        Assert.assertEquals(expectedPerson, people.findById(2));
    }
}

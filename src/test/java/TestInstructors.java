import io.zipcoder.interfaces.Instructor;
import io.zipcoder.interfaces.Instructors;
import io.zipcoder.interfaces.Student;
import io.zipcoder.interfaces.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        //Given
        //Instance static in Instructors
        //When
        Instructor instructor1 = new Instructor(457, "Autumn");
        Instructor instructor2 = new Instructor(567, "Andrew");
        Instructor instructor3 = new Instructor(678, "Adam");
        Instructor instructor4 = new Instructor(789, "Izzy");

        //Then
        Assert.assertTrue(Instructors.getInstance().contains(instructor1));
        Assert.assertTrue(Instructors.getInstance().contains(instructor2));
        Assert.assertTrue(Instructors.getInstance().contains(instructor3));
        Assert.assertTrue(Instructors.getInstance().contains(instructor4));
        Instructors.getInstance().removeAll();
    }
}

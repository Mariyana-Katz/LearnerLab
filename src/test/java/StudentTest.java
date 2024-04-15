import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
//    Create a testImplementation method that asserts that a Student is an instanceof a Learner.
//    Create a testInheritance method that asserts that a Student is an instanceof a Person.
//    Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the specified numberOfHours by invoking the .learn method.
    @Test
    public void testImplementation(){
        Student student = new Student(5L, "John");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritans(){
        Student student = new Student(5L, "John");
       Assert.assertTrue(student instanceof Person);
    }

       @Test
       public void testLearn(){
           Student student = new Student(5L, "John");
           double expected = 20;
           student.learn(20.0);
           double actual = student.getTotalStudyTime();

           Assert.assertEquals(expected,actual, 0);

        }
    }







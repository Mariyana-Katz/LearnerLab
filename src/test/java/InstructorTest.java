import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InstructorTest {
    @Test
    public void InstructorTest()
    {
        Instructor instructor = new Instructor(5L, "Tom");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void InstructorTest1()
    {
        Instructor instructor = new Instructor(5L, "Tom");
        Assert.assertTrue(instructor instanceof Person);
    }



    //    Create a testTeach method that ensures when an Instructor invokes the teach method,
////    a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
////    Create a testLecture method that ensures when an Instructor invokes the lecture method,
////    a respective array of students'
//
   @Test
  public void testTeach(){
       Instructor instructor = new Instructor(5L, "Jo");
       Student student = new Student(5L, "Joe");
       Double expected = 50.5;
       instructor.teach(student, expected);
       Double actual = student.getTotalStudyTime();
       Assert.assertEquals(expected,actual);
    }

   @Test
   public void testLecture(){
       Instructor instructor = new Instructor(5L, "Jo");
      // double numberOfHoursPerLearner = numberOfHours / learners.length;
       int numberOfStudents = 3;
       Student[] students = new Student[numberOfStudents];
       for(int i = 0; i< students.length; i++){
           students[i] = new Student(3L + i, "Joe" + i );
       }
       Double numberOfHours = 60.0;
       instructor.lecture(students, numberOfHours);
       Double expected = numberOfHours/numberOfStudents;
       Double actual = students[0].getTotalStudyTime();
       Assert.assertEquals(expected, actual);



    }
}

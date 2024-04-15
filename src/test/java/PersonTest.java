import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testConstructor(){
        Person person = new Person( 5L, "John");
        String expected = "John";
        Long expectedLong = 5L;
        String actual = person.getName();
        Long actualLong = person.getId();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedLong, actualLong);

    }

    @Test
    public void setNameTest(){
        Person person = new Person( 5L, "John");
        String expected = "Tom";
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
}

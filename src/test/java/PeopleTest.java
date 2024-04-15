import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {


    @Test
    public void addTest(){
        Person person = new Person(3L, "Ben");
        People people = new People();
        people.add(person);
        Assert.assertTrue(people.contains(person));

    }

    @Test
    public void removeTest(){
        Person person = new Person(3L, "Ben");
        People people = new People();
        people.add(person);
        people.remove(person);
        Assert.assertFalse(people.contains(person));

    }

    @Test
    public void findById(){

        Long expected = 3L;
        Person person = new Person(expected, "Ben");
        People people = new People();
        people.add(person);
        Person p = people.findById(expected);
        Assert.assertEquals(p,person);
    }






}

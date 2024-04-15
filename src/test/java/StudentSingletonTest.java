import org.junit.Assert;
import org.junit.Test;

public class StudentSingletonTest {

    @Test
    public void test(){
        StudentSingleton s = StudentSingleton.getInstance();
        Person p = s.findById(4L);
        Person p1 = s.findById(2L);
        Assert.assertNotNull(p);
        Assert.assertNotNull(p1);
    }
}

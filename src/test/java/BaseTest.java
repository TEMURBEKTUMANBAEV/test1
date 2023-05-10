import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setUP(){
        System.out.println("Opening browser...");

    }
    @After
    public  void cleanUp(){
        System.out.println("Close browser...");
    }


}

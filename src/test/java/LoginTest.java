import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {

    @Before
    public void setUP(){
        System.out.println("Opening browser...");

    }
    @After
            public  void cleanUp(){
        System.out.println("Close browser...");
    }


    @Test
   public void verifyUserCanLogin(){

        System.out.println("verify login successful");

   }

   @Test
    public void verifyUserCannotLoginWithInvalidCredentials(){

       System.out.println("verify login unsuccessful for invalid credentials");

   }

   @Test
    public void verifyUserCanResentPassword(){

       System.out.println("verify user can resent password");

   }
}

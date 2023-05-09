import org.junit.Test;

public class LoginTest {
    @Test
   public void verifyUserCanLogin(){
        System.out.println("verify login successful");
   }

   @Test
    public void verifyUserCannotLoginWithInvalidCredentials(){
       System.out.println("verify login unsuccessful for invalid credentials");
   }
}

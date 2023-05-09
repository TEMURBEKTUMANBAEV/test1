import org.junit.Test;

public class LoginTest {
    @Test
   public void verifyUserCanLogin(){
        System.out.println("Opening browser...");
        System.out.println("verify login successful");
        System.out.println("Close browser...");
   }

   @Test
    public void verifyUserCannotLoginWithInvalidCredentials(){
       System.out.println("Opening browser...");
       System.out.println("verify login unsuccessful for invalid credentials");
   }

   @Test
    public void verifyUserCanResentPassword(){
        System.out.println("Opening browser...");
       System.out.println("verify user can resent password");
   }
}

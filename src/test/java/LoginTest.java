import org.junit.Test;

public class LoginTest {
    @Test
   public void verifyUserCanLogin(){

        System.out.println("verify login successful");
        System.out.println("Close browser...");
   }

   @Test
    public void verifyUserCannotLoginWithInvalidCredentials(){

       System.out.println("verify login unsuccessful for invalid credentials");
       System.out.println("Close browser...");
   }

   @Test
    public void verifyUserCanResentPassword(){
        
       System.out.println("verify user can resent password");
       System.out.println("Close browser...");
   }
}

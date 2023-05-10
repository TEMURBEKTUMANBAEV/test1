package com.automation.test;

import com.automation.test.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {

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

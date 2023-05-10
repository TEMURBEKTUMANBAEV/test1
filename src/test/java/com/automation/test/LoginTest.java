package com.automation.test;

import com.automation.catagories.SmokeTest;
import com.automation.test.BaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoginTest extends BaseTest {

    @Test
    @Category(SmokeTest.class)
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

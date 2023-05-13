package com.automation.test;

//1. a = 10, b = 5, expected = 2
//2. a =4 , b = 0, expected = exception
//3. a = 10, b = 10, expected = 1
//4. a = -10, b = 5, expected = -2
//5. a = -10, b = -5, expected = -2 *** <- this test we will make fail
//6. a = 10, b = 20, expected = 0
//7. a = 0, b = 10, expected = 0
//8.  a = 0, b = 0, expected = exception
// 9. a = 10000, b = 2500, expected = 4
//10. a = 10, b = -5, expected = -2

import com.dev.product.calculator;
import org.junit.Before;
import org.junit.Test;

public class DivTest {
    calculator cal;

      @Before
    public void setUp(){
     cal = new calculator();
      }
      @Test
    public void testPositive(){
          
      }

}

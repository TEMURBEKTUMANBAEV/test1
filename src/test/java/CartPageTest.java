import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CartPageTest {
    @Before
    public void setUP(){
        System.out.println("Opening browser...");

    }

    @After
    public  void cleanUp(){
        System.out.println("Close browser...");
    }

    @Test
    public void verifyUserCanAddProductToCart(){
        System.out.println("verify user can add item");
    }

    @Test
    public void verifyUserCanRemoveItemFromCart(){
        System.out.println("verify user can remove item");
    }

    @Test
    public void verifyUserCanChangeQuantityOfItem(){
        System.out.println("verify user can change quantity of item");
    }
}

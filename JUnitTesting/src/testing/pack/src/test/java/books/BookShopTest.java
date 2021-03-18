package testing.pack.src.test.java.books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import testing.pack.src.main.java.books.*;

public class BookShopTest {

    /**
     * TODO : Put your test here
     */

    @Test
    public void myFirstTest(){
    	BookShop test = new BookShop("Book shop");
    	//int[] arr = {1,3,2,3,1,4};
    	//int[] arr = {1,2,2};
    	int[] arr = {1,3,2,3,1,4,5};
    	double out = test.cost(arr);
    	assertEquals(42, out);
    	////assertEquals(22.88, out);
    	//assertEquals(39.04, out);
        //assertTrue(false);
    }
}
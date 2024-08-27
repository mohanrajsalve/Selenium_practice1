package testNG;

import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"login"})
    public void validLoginTest() {
       System.out.println("user sucefully login login tag");
    }

    @Test(groups = {"login"})
    public void invalidLoginTest() {
        // Code for invalid login test
    	 System.out.println("user invalidLoginTest login tag ");
    }
    
    @Test(groups = {"login1"})
    public void invalidLoginTest1() {
        // Code for invalid login test
    	 System.out.println("user invalidLoginTest1 ");
    }
    @Test(groups = {"login2"})
    public void invalidLoginTest2() {
        // Code for invalid login test
    	 System.out.println("user invalidLoginTest2 ");
    }

    @Test(groups = {"cart"})
    public void addItemToCartTest() {
    	System.out.println("addItemToCartTest ");   
    	}

    @Test(groups = {"cart"})
    public void removeItemFromCartTest() {
    	System.out.println("removeItemFromCartTest "); 
    }
}

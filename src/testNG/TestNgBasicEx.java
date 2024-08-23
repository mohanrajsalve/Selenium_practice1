package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestNgBasicEx {
	 @Test(priority=6)
	  public void addition () {
		  System.out.println("addition passed");
	  }
	  @Test(priority=6)
	  public void Substraction () {
		  System.out.println("Substraction passed");
	  }
	  @Test
	  public void multi () {
		  System.out.println("multi passed");
	  }
	  @Test(priority=0)
	  public void divison () {
		  System.out.println("divison passed");
	  }
	  //-2 | 0
	  @Test(priority=-2)
	  public void  multi1 () {
		  System.out.println("multi1 passed");
	  }
	  @Test(priority=1)
	  public void test1 () {
		  System.out.println("test1 passed");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	  System.out.println("beforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  System.out.println("afterMethod");
	  }
	  @BeforeTest
	  public void beforeTest() {
	    System.out.println("Test started");
	  }

	  @AfterTest
	  public void afterTest() {
	    System.out.println("Test End");
	  }
	  
	@BeforeClass
	public void beforeClass() {
	  System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass() {
	  System.out.println("after class");
	}
	@BeforeSuite
	public void beforeSuite() {
	  System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
	  System.out.println("after suite");
	}

}

//Beforesuite
//Beforetest
//Before class
//Before method
//Afer method
//After class
//After Test
//After Suite


//@BeforeMethod
//public void beforeMethod() {
//  System.out.println("before method");
//}

//@AfterMethod
//public void afterMethod() {
//  System.out.println("after method");
//}
//
//@BeforeClass
//public void beforeClass() {
//  System.out.println("before class");
//}
//
//@AfterClass
//public void afterClass() {
//  System.out.println("after class");
//}
//

//
//@BeforeSuite
//public void beforeSuite() {
//  System.out.println("before suite");
//}
//
//@AfterSuite
//public void afterSuite() {
//  System.out.println("after suite");
//}

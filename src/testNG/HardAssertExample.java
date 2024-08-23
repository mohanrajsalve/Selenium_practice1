package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HardAssertExample {
  @Test
  public void f() {
	  String str= "Pune";
	  if(str.equals("mumbai")) {
		  System.out.println("test failed");
	  }else {
		  System.out.println("test pass");
	  }
	  Assert.assertEquals("Mumbai",str);
	  Assert.assertEquals(str,getcityname());
  }
  public String getcityname() {
	  String str ="pune";
	  return str;
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }
}

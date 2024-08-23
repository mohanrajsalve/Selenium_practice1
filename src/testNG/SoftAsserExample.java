package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SoftAsserExample {
  @Test
	 public void SoftAssertex1() {
		  String str= "pune";
		  SoftAssert sa= new SoftAssert();
		  sa.assertEquals(str,"pune");
		  sa.assertEquals(str,"Mumbai");
		  sa.assertEquals(str,getCityName());
		  sa.assertAll();
	  }
	  public String getCityName() {
	  String city = "pune";
	  return city;
	  }
 
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}

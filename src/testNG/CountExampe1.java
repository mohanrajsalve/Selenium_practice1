package testNG;

import org.testng.annotations.Test;

import utilitise.BrowserStartup;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class CountExampe1 extends BrowserStartup {
	static WebDriver driver=null ;
  @Test(invocationCount=3 ,threadPoolSize=3)
  public void f() throws InterruptedException {
	  String url = "https://www.saucedemo.com/";
		driver= Startup(url, "CH");  
	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("#login-button")).click();		
	System.out.println("test run ");
  Reporter.log("Successfully passed");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method ");
  }

}

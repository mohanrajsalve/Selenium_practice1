package testNG;

import org.testng.annotations.Test;
import utilitise.BrowserStartup;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class DataProviderExample extends BrowserStartup  {
	WebDriver driver=null;
  @Test(dataProvider = "dp")
//  @Test(dataProvider = "loginCred")
  public void f(String username, String password) {
	  String url = "https://www.saucedemo.com/";
		driver= Startup(url, "CH");
	 driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).click();		
	
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method print");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aFTER method print");
  }


  @DataProvider
  public Object[][] dp() {
	  Object [][] data=new Object[3][2];
	  data[0][0]="standard_user";
	  data[0][1]="secret_sauce";
	  data[1][0]="problem_user";
	  data[1][1]="secret_sauce";
	  data[2][0]="performance_glitch_user";
	  data[2][1]="secret_sauce";
	  return data;
	  
   
    }

}

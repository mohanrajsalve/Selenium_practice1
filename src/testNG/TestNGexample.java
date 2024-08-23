package testNG;

import org.testng.annotations.Test;

import utilitise.BrowserStartup;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestNGexample extends BrowserStartup {
	static WebDriver driver=null ;
	
  @Test(priority=1)
  public void Checkifuserrightclick() {
	  WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
	  Actions actions = new Actions(driver); 
	  actions.contextClick(btnElement).perform();
	   System.out.println("Right click Context Menu displayed");
	   Reporter.log("Test Checkifuserrightclick passed");
  }
  @Test(priority=2)
  public void Checkifuserdoubleclick() {
	  WebElement  btnElement = driver.findElement(By.id("doubleClickBtn")); 
	  Actions actions = new Actions(driver); 
	  actions.doubleClick(btnElement).perform();
  }
  @Test(priority=3)
  public void bird() {
	  System.out.println("third method printed");
  }
  @Test(priority=4)
  public void pet() {
	  System.out.println("Fourth method printed");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("Method Started");
	 Reporter.log("Test started");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Method End");
	  Reporter.log("Test passed");
  }
  	@BeforeClass
	public void beforeClass() {
  		String url ="http://demoqa.com/buttons";
		driver= Startup(url, "CH");
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
  @BeforeTest
  public void beforeTest() {
	  
	}
	
  @AfterTest
  public void afterTest() {
		 
	}

}

package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilitise.BrowserStartup;

public class ParameteringEx1 extends BrowserStartup  {
	

    @Test@Parameters({"username", "password"})
    public void loginTest (String username, String password) {
    	WebDriver driver=null;
    	String url = "https://www.saucedemo.com/";
		driver= Startup(url, "CH");
	 driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).click();
    }
}

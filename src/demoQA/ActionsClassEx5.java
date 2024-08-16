package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitise.BrowserStartup;

public class ActionsClassEx5 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		// Enter the Full Name
		String url = "https://demoqa.com/text-box";
		driver= Startup(url, "CH");
		 WebElement TextBox = driver.findElement(By.xpath("//h1[@class='text-center']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", TextBox); 
		 Actions actions = new Actions(driver);
	       
	        
	        // Enter the Full Name
	        WebElement fullName = driver.findElement(By.id("userName"));
	        fullName.sendKeys("Mr.Peter Haynes");
	        
	        //Enter the Email
	        WebElement email=driver.findElement(By.id("userEmail"));
	        email.sendKeys("PeterHaynes@toolsqa.com");
	        
	        
	        // Enter the Current Address
	        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	        
	        currentAddress.sendKeys("43 School Lane London EC71 9GO");
	        
	        
	        // Select the Current Address using CTRL + A
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("a");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        // Copy the Current Address using CTRL + C
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("c");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        //Press the TAB Key to Switch Focus to Permanent Address
	        actions.sendKeys(Keys.TAB);
	        actions.build().perform();
	        
	        //Paste the Address in the Permanent Address field using CTRL + V
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("v");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        
	        
	        //Compare Text of current Address and Permanent Address
	        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
//	        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
	        
	       

		}

	}



package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitise.BrowserStartup;

public class ActionClassEx1 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		String url ="http://demoqa.com/buttons";
		driver= Startup(url, "CH");
		 Actions actions = new Actions(driver);
		 
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		   actions.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");
		   
		   //doubleclick
		   btnElement = driver.findElement(By.id("doubleClickBtn")); 
			
			//Double Click the button 
			actions.doubleClick(btnElement).perform(); 
			
		   
	}

}

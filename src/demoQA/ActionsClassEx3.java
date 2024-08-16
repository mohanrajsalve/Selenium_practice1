package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitise.BrowserStartup;

public class ActionsClassEx3 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		String url = "https://demoqa.com/menu/";
		driver= Startup(url, "CH");
		 Actions actions = new Actions(driver);
		 WebElement menuOption = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		 WebElement Menu = driver.findElement(By.xpath("//h1[@class='text-center']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Menu);
	    	//Mouse hover menuOption 'Music'
		 WebElement submenuOption = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	    	actions.moveToElement(menuOption)
	    	.moveToElement(submenuOption)
	    	.build()
	    	.perform();
	}

}

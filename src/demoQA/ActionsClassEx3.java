package demoQA;

import org.openqa.selenium.By;
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
		 WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
	    	//Mouse hover menuOption 'Music'
	    	actions.moveToElement(menuOption).perform();
	}

}

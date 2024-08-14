package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitise.BrowserStartup;

public class ActionClassEx4 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://demoqa.com/tool-tips";
		driver= Startup(url, "CH");
		 Actions actions = new Actions(driver);
		
		 WebElement element = driver.findElement(By.id("tooltipDemo")); 
			
			// Use action class to mouse hover 
			actions.moveToElement(element).perform(); 
			
			WebElement toolTip = driver.findElement(By.cssSelector(".tooltiptext")); 
			
			// To get the tool tip text and assert 
			String toolTipText = toolTip.getText();
			System.out.println("toolTipText-->"+toolTipText); 
		
	}

}

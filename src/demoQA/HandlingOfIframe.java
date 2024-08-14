package demoQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitise.BrowserStartup;

public class HandlingOfIframe extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		String url ="https://demoqa.com/frames";
		driver= Startup(url, "CH");
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		driver.switchTo().frame(0); 		//index
		driver.switchTo().frame("iframe1"); //NAME
		driver.switchTo().frame("IF1"); //id
		
		driver.switchTo().defaultContent();
//		driver.quit();

	}

}

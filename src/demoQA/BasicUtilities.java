package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicUtilities extends XpathEx2  {
	static ChromeDriver driver=null ;
		
	public WebElement findbyID(String value,ChromeDriver driver) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(options);
		
	WebElement findbyID =driver.findElement(By.xpath("//*[@id='"+value+"']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", findbyID);
	return findbyID;
	}
	
	
	

}

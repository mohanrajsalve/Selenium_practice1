package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitise.BrowserStartup;

public class AlertEx1 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
//		BrowserStartup bu =new BrowserStartup();
		String url ="https://demoqa.com/";
		driver= Startup(url, "CH");
		WebElement element =  driver.findElement(By.xpath("//*[@class='card mt-4 top-card']//*[text()='Alerts, Frame & Windows']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 element.click();
		 WebElement WT=driver.findElement(By.xpath("//*[text()='Alerts']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", WT);
	       WT.click();
	       WebElement clickmebtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
	       clickmebtn.click();
	       driver.switchTo().alert().accept();
	       WebElement clickmeconfirmbtn=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	       clickmeconfirmbtn.click();
//	       driver.switchTo().alert().accept();
	       driver.switchTo().alert().dismiss();
//	       driver.switchTo().alert().sendKeys("test");
	       
	}

}

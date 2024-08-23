package demoQA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitise.BrowserStartup;

public class RobotClassEx1 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) throws AWTException {
		String url = "https://demoqa.com/upload-download";
		driver= Startup(url, "CH");
		WebElement choosefile = driver.findElement(By.xpath("//input[@class='form-control-file']"));		
		//click  Browse button 
		WebElement Menu = driver.findElement(By.xpath("//h1[@class='text-center']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Menu);
//		choosefile.sendKeys(Keys.ENTER);
//		choosefile.click();
		//Create object of Robot class
		Robot robot = new Robot();
		//Code to Enter D1.txt 
		//Press Shify key 
		robot.keyPress(KeyEvent.VK_SHIFT);
		//Press d , it gets typed as upper case D as Shift key is pressed
		robot.keyPress(KeyEvent.VK_D);
		//Release SHIFT key to release upper case effect
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyPress(KeyEvent.VK_T);
		
		//Press ENTER to close the popup
        robot.keyPress(KeyEvent.VK_ENTER);  

        //Wait for 1 sec
//        Thread.sleep(1000);
			 
		//This is just a verification part, accept alert
//        webElement = driver.findElement(By.id("uploadButton"));
//		
//		webElement.click();				 
//		WebDriverWait wait = new WebDriverWait(driver, 10);		 
//		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());	       	 
//		//Accept the Alert		 
//		myAlert.accept();
//
//		//Close the main window 
//		driver.close();
	}

		
	}



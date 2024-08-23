package demoQA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitise.BrowserStartup;

public class RobotClassEx2  extends BrowserStartup{
	static WebDriver driver=null ;
	public static void main(String[] args) throws AWTException {
		String url = "https://demoqa.com/upload-download";
		driver= Startup(url, "CH");
		
		//click  Browse button 
		
		WebElement Menu = driver.findElement(By.xpath("//h1[@class='text-center']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Menu);	
		WebElement choosefile = driver.findElement(By.xpath("//input[@class='form-control-file']"));		
		int x=choosefile.getLocation().getX();
		int y=choosefile.getLocation().getY();
		System.out.println("("+x+","+","+y+")");
		Robot robot = new Robot();	
        robot.mouseMove(365, 340); // move mouse point to specific location	
        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step	
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click	
        robot.delay(1500);	
        robot.keyPress(KeyEvent.VK_DOWN);
        
	}

}

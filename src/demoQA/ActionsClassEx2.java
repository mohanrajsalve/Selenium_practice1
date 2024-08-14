package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilitise.BrowserStartup;

public class ActionsClassEx2 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		String url ="https://demoqa.com/droppable/";
		driver= Startup(url, "CH");
		 Actions builder = new Actions(driver);
		 WebElement from = driver.findElement(By.id("draggable"));
		 WebElement to = driver.findElement(By.id("droppable"));	 
			builder.dragAndDrop(from, to).perform();	
			String textTo = to.getText();

			if(textTo.equals("Dropped!")) {
				System.out.println("PASS: Source is dropped to target as expected");
			}else {
				System.out.println("FAIL: Source couldn't be dropped to target as expected");
			}
			
	}

}

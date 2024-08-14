package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import java.util.Iterator; 
import java.util.Set;
import utilitise.BrowserStartup;

public class Multiplewindow extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		String url ="https://demoqa.com/browser-windows";
		driver= Startup(url, "CH");
		 String currHandle=driver.getWindowHandle();
	      System.out.println(currHandle);
//	      driver.switchTo().newWindow(WindowType.TAB);
//	      driver.switchTo().newWindow(WindowType.WINDOW);
	      String parent=driver.getWindowHandle();
	      WebElement newwindow=driver.findElement(By.xpath("//button[@id='tabButton']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", newwindow);
	      newwindow.click();
	      Set<String>s=driver.getWindowHandles();

	      // Now iterate using Iterator
	      Iterator<String> I1= s.iterator();
	      while(I1.hasNext())
	      {

	      String child_window=I1.next();


	      if(!parent.equals(child_window))
	      {
	      driver.switchTo().window(child_window);
	     String sampleheading= driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
	      
	      System.out.println("We have switch to new window = "+sampleheading);
	      driver.manage().window().maximize();
		
		
	}

}
}}
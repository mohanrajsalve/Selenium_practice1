package demoQA;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablesEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Drivers/ChromeDriver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
        // URL of the login website that is tested
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
       WebElement element =  driver.findElement(By.xpath("//*[@class='card mt-4 top-card']//*[text()='Elements']"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
       element.click();
       WebElement WT=driver.findElement(By.xpath("//*[text()='Web Tables']"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", WT);
       WT.click();
       List<WebElement>tableCT =new ArrayList<WebElement>();
       tableCT=driver.findElements(By.xpath("//div[@class='rt-td']"));
       System.out.println(tableCT.size());
       for(WebElement s:tableCT) {
    	   if(s.getText().equalsIgnoreCase("Alden")) {
    	  System.out.println(s.getText()); 
    	  System.out.println("Alden word is added . test has been passed ");
       }

	}

}
}
package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckboxEx1 {

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
       WebElement checkbox=driver.findElement(By.xpath("//*[text()='Check Box']"));
       checkbox.click();
       WebElement checkbox1=driver.findElement(By.xpath("//label[@for='tree-node-home']//span[1]")); 
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", checkbox1);
       checkbox1.click();
       driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click(); 
       driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
       
       
	}

}

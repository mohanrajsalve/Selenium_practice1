package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Drivers/ChromeDriver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
        // URL of the login website that is tested
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
       WebElement element =  driver.findElement(By.xpath("//*[@class='card mt-4 top-card']//*[text()='Widgets']"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
       element.click();
       WebElement SM=driver.findElement(By.xpath("//*[text()='Select Menu']"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", SM);
       SM.click();
       Select dropdown = new Select(driver.findElement(By.id("oldSelectMenu")));  
//       dropdown.selectByVisibleText("Green");  
//       dropdown.selectByIndex(4);
       dropdown.selectByValue("8");
       WebElement SO=driver.findElement(By.xpath("//div[@id='withOptGroup']"));
       SO.click();
       driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
       
	}

}

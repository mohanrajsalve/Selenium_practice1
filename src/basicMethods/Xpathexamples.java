package basicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpathexamples {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:/Drivers/ChromeDriver/chromedriver.exe");
	
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
        // URL of the login website that is tested
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize(); 
//        driver.findElement(By.xpath("//a[@class='MV3Tnb'][2]")).click();
//        driver.findElement(By.xpath("//a[@aria-label='Search for Images ']")).click();  
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("java_selenium");
	}

}

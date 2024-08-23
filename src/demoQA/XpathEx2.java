package demoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathEx2 {
	public static ChromeDriver driver=null;

	public static void main(String[] args) {
		BasicUtilities bu =new BasicUtilities();
		System.setProperty("webdriver.chrome.driver","C:/Drivers/ChromeDriver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
        // URL of the login website that is tested
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement element =  driver.findElement(By.xpath("//*[@class='card mt-4 top-card']//*[text()='Elements']"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
       element.click();
       WebElement textbox =   driver.findElement(By.xpath("//*[@class='element-list collapse show']//child::li[1]"));
//       WebElement textbox = new WebDriverWait(driver, Duration.ofSeconds(10))
//		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='element-list collapse show']//child::li[1]")));
       textbox.click();
       WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(textbox));
    		   
       WebElement full_name =driver.findElement(By.xpath("//*[@id='userName']")); 
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", full_name);
       bu.findbyID("userName",driver).sendKeys("Java_Selenium");
      
//       full_name.sendKeys("Java_Selenium");
//       WebElement Email =driver.findElement(By.xpath("//*[@id='userEmail']")); 
//       Email.sendKeys("wertre@email.com");
       bu.findbyID("userEmail",driver).sendKeys("sgjkdrfn@email");
       
	}

}

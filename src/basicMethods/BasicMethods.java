package basicMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BasicMethods {

	public static void main(String[] args) {
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
//        driver.navigate().to("https://www.google.co.in");
//        driver.navigate().refresh();  
        driver.navigate().back();
        driver.navigate().forward();
//        driver.switchTo().window("windowName");  
        driver.close();
     
	}

}

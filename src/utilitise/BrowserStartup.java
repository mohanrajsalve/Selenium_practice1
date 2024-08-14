package utilitise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserStartup {


		public static WebDriver Startup(String url,String BrowserName) {
			String path ="C:/Drivers/ChromeDriver/chromedriver.exe";
			System.out.println("path = "+path);
//			String BrowserName= "FF";
			WebDriver driver = null;
//			ChromeDriver driverCH=null;
//			FirefoxDriver driverFF= null;
			if(BrowserName.equalsIgnoreCase("CH")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
//				ChromeDriver driver = new ChromeDriver(options);
				System.setProperty("webdriver.chrome.driver",path);
				driver=new ChromeDriver(options);
				
			}else if(BrowserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver",path+"\\browser\\geckodriver.exe");
				driver= new FirefoxDriver();
				
			}else if(BrowserName.equalsIgnoreCase("ME")) {
				System.setProperty("webdriver.edge.driver",path+"\\browser\\msedgedriver.exe");
				driver= new EdgeDriver();
				
			}
			else {
				System.out.println("Browser name is invalid");
			}	
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
			
		}


	}


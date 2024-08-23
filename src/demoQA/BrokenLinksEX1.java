package demoQA;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitise.BrowserStartup;
//200 – Valid Link/success
//301/302 - Page redirection temporary/permanent
//404 – Page not found
//400 – Bad request
//401 – Unauthorized
//500 – Internal Server Error
public class BrokenLinksEX1 extends BrowserStartup {
	static WebDriver driver=null ;
	public static void main(String[] args) {
		String url ="https://demoqa.com/broken";
		driver= Startup(url, "CH");
		 List<WebElement> links = driver.findElements(By.tagName("a"));

	        // This line will print the number of links and the count of links.
	        System.out.println("No of links are "+ links.size());  
	      
	        //checking the links fetched.
	        for(int i=0;i<links.size();i++)
	        {
	            WebElement E1= links.get(i);
	            String link= E1.getAttribute("href");
	            verifyLinks(link);
	        }
	        
	       
	    }
	    
	    
	    public static void verifyLinks(String linkUrl)
	    {
	        try
	        {
	            URL url = new URL(linkUrl);

	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()>=400)
	            {
	            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
	            }    
	       
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	        }catch (Exception e) {
	      }
	   }

	}


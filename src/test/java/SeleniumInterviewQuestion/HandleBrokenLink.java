package SeleniumInterviewQuestion;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HandleBrokenLink {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        
       List<WebElement> links=driver.findElements(By.tagName("a"));
       int brokenlinks=0;
        for(WebElement element:links)
        {
        	String url=element.getDomProperty("href");
        	if(url==null|| url.isEmpty())
        	{
        		System.out.println("url is empty");
        		continue;
        	}
        	
        	URL link = new URL(url);//URL CLASS//string chnaged to url format
        	try {
        	HttpURLConnection http =(HttpURLConnection) link.openConnection(); 
        	http.connect();
        	if(http.getResponseCode()>=400)
        	{
        		System.out.println("broken link" +http.getResponseCode() +"url"+url);
        		brokenlinks++;
        	}
        	
        	else
        	{
        		System.out.println("valid link" +http.getResponseCode());
        	}
        }
        	
        	catch(Exception e)
        	{
        		
        	}
        	
        	
	}
        System.out.println("print the total broken link;" +brokenlinks);


	}
}


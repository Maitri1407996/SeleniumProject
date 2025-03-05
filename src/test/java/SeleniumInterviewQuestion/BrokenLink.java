package SeleniumInterviewQuestion;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> Alllinks=driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+Alllinks.size());
		int noOfBrokenlinks =0;
	
		//1....capture all the href and check is it any value or not
		for( WebElement LinkElement: Alllinks) {
			String href= LinkElement.getDomProperty("href");
			if(href == null|| href.isEmpty())
			{
				System.out.println("href null or empty not possible to check");
				continue;
			}
			
			
			//2...hit to the server -- string to url convert then only hit the server
			try
			{
			URL LinkUrl = new URL(href);//CONVERT STRING TO URL FORMAT
			//ESTABLISHED THE CONNECTION
			HttpURLConnection connectionURL = (HttpURLConnection) LinkUrl.openConnection();
			connectionURL.connect();//connect to server and sent request the server
			
			//3.check the stature code
			if(connectionURL.getResponseCode()>=400)
			{
				System.out.println(href +"======>broken link");
				noOfBrokenlinks++;
			}
			else
			{
				System.out.println(href +"=======>not broken");
			}
			}
			catch(Exception e)
			{
				
			}		
		}
		System.out.println("number of broken links:" +noOfBrokenlinks);
	}

}

package SeleniumInterviewQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementVsfindElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        WebElement searhstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searhstore.sendKeys("hello");
        
        WebElement sear =driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(sear.getText());
        
         List<WebElement> links =driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(links.size());
        for(WebElement obj:links)
        {
        	System.out.println(obj.getText());
        }
        	        
        
	}

}

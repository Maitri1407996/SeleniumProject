package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        
        WebElement searhstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searhstore.sendKeys("hello");
        searhstore.clear();
        searhstore.sendKeys("hi");
        System.out.println(driver.getTitle());
        System.out.println(searhstore.getDomProperty("value"));
        

	}

}

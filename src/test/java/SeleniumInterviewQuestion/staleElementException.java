package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class staleElementException {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pavantestingtools.com/");
	    driver.manage().window().maximize();
		WebElement link = driver.findElement(By.xpath("//a[text() ='Online Training']"));
		link.click();
	    driver.navigate().back();
		
		try {
			link.click();
		}
		catch(StaleElementReferenceException e)
		{
			link= driver.findElement(By.xpath("//a[text() ='Online Training']"));
			link.click();
		}
	  // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
		
	}

}

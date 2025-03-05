package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicateinalist {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
      
     Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='animals']")));  
     //Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='colors']")));  
     Set<String> uniqueOption = new HashSet<String>();
     boolean flag=false;
     List<WebElement> options= dropDown.getOptions();
 	
 	for(WebElement e:options)
 	{
 		String optionText = e.getText();
 		if(!uniqueOption.add(optionText))
 		{
 			System.out.println("duplicate option found:" +optionText);
 			flag=true;
 		}
 	}
 	if(!flag)
 	{
 		System.out.println("no duplicate found");
 	}
	}

}

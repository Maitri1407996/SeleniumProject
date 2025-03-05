package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

       //sorted
        //Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
	//unsorted
     Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='colors']")));  
     ArrayList original = new ArrayList();
	ArrayList temp = new ArrayList();
	List<WebElement> options= dropDown.getOptions();
	
	for(WebElement e:options)
	{
		original.add(e.getText());
		temp.add(e.getText());
		
	}
	
	System.out.println("before sorting");
	System.out.println("original"+original);
	System.out.println("temp" +temp);
	
	Collections.sort(temp);
	
	System.out.println("after sorting");
	System.out.println("original"+original);
	System.out.println("temp" +temp);
	
	if(original.equals(temp))
	{
		System.out.println("list box sorted");
	}
	else
	{
		System.out.println("list is not sorted");
	}
	
			}

}

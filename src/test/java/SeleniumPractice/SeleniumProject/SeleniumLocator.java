package SeleniumPractice.SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumLocator {

	public static void main(String[] args) {
		
     WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://demo.nopcommerce.com/register");
        //Maximize the window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("q")).sendKeys("form fill up");
		driver.findElement(By.id("FirstName")).sendKeys("Maitri");
		//driver.findElement(By.linkText("Electronics")).click();
		//List<WebElement> number = driver.findElements(By.className("header-upper"));
	    //System.out.println(number.size());
		WebElement nu= driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
	    System.out.println(nu);
		List<WebElement> num=driver.findElements(By.xpath("//select[@name='DateOfBirthDay']"));
	    System.out.println("number:" +num.size());
	    List<WebElement> linkNumber= driver.findElements(By.tagName("a"));
	    System.out.println(linkNumber.size());
	    
	    List<WebElement> image= driver.findElements(By.tagName("img"));
	    System.out.println(image.size());
	    driver.close();
	}

}

package SeleniumInterviewQuestion;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class StatusofWebelement {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searhstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(searhstore.isDisplayed());
		System.out.println(searhstore.isEnabled());
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(male.isSelected());
		male.click();
		System.out.println(male.isSelected());
	}

}

package SeleniumPractice.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//open url
				driver.get("https://demo.nopcommerce.com/register");
		        //Maximize the window
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				//tag+id
				//Input tag name with tag or without still it will run
				//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("hello");
				//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("hello");
	
				//tag+class
				//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("maitri");
				//without tag name also it will run
				//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("maitri");
				
				
				//tag+attribute
				//driver.findElement(By.cssSelector("input[data-val-required = \"First name is required.\"]")).sendKeys("maitri");
	            //without tag name also it will run
				//driver.findElement(By.cssSelector("[data-val-required = \"First name is required.\"]")).sendKeys("maitri");
	
				//tag+class+attribute
				driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("Maitri");
	            //driver.findElement(By.cssSelector(".field-validation-valid[data-valmsg-for=\"FirstName\"]")).sendKeys("mai");
	}

}

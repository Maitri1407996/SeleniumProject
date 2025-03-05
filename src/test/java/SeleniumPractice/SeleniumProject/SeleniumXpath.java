package SeleniumPractice.SeleniumProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SeleniumXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//open url
				driver.get("https://demo.nopcommerce.com/register");
		        //Maximize the window
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//absolute xpath
				///html/body/div[6]/div[1]/div[2]/div[2]/form/input
				//relative xpath
				////*[@id="small-searchterms"]
				//#small-searchterms-css selector
          //xpath with single attribute
				driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("pwc");
		//xpath with multiple attribute
				driver.findElement(By.xpath("//input[@id='Email'][@data-val-regex='Wrong email']")).sendKeys("maitridasxx2016@gmail.com");
	    //xpath with or and operator
		//driver.findElement(By.xpath("//input[@id='Email'and @data-val-regex='Wrong email']")).sendKeys("maitridasxx2016@gmail.com");
	    //driver.findElement(By.xpath("//input[@id='Email'and @name='Email']"));
		//driver.findElement(By.xpath("//input[@id='Email'or @name='Email']"));
	
		//check the label
		String companyname=	driver.findElement(By.xpath("//label[text()='Company name:']")).getText();
		
		System.out.println(companyname);
		
		//chained xpath
		 boolean image =driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();		
		//contains
		System.out.println(image);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("hello");
		//starts wth
		
	driver.findElement(By.xpath("//input[starts-with(@name,'First')]")).sendKeys("maitri");
	//by using inner text  method
	driver.findElement(By.xpath("//button[text()='Subscribe']")).click();
	
	
	}

}

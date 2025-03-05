package SeleniumTestNgPractice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider ="dp")
	void testLogin(String username, String pwd)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status==true)
		{
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	@DataProvider(name="dp",indices= {0,2})
	Object[][] loginData()
	{
		Object data[][]=
			{
				    {"abs","sbh"},
					{"Admin","admin123"},
					{"Adghh","adhjkj"},
								
			};
		return data;
				}
}





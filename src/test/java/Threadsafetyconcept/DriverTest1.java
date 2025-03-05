package Threadsafetyconcept;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DriverTest1 {

	
	private static ThreadLocal <WebDriver> tdriver = new ThreadLocal<>();
	WebDriver driver;
	
	
	public void setDriver(WebDriver driver)
	{
		tdriver.set(driver);//assigning the driver to tdriver
	}
	
	public WebDriver getDriver()
	{
		return tdriver.get();
	}
	@Test
	void mytest1() 
	{
		driver=new ChromeDriver();
		setDriver(driver);
		getDriver().get("https://www.google.com/");
		System.out.println(getDriver().getTitle());
		getDriver().quit();
	}
	
	@Test
	void mytest2() 
	{
		driver=new EdgeDriver();
		setDriver(driver);
		getDriver().get("https://www.bing.com/");
		System.out.println(getDriver().getTitle());
		getDriver().quit();
	}
	
	
	
}

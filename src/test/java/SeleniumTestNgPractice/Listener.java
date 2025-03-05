package SeleniumTestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(SeleniumTestNgPractice.ExtendReportManager.class)
public class Listener {
WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    }
	@Test(priority=1)
	void logoValidate()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo is displayed:" +status);
		Assert.assertEquals(status,true);
		}
	@Test(priority=2)
	void testUrl()
	{
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/");
	}
	
	@Test(priority=3,dependsOnMethods={"testUrl"})
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterClass
	void clossApp()
	{
		driver.quit();
	}
}



package SeleniumInterviewQuestion;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilictWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
      
       WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
    
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);//==mouse action
		//WebElement element =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium Tutorial']")));
		//element.click();//here for element we are specifying the time same on another element we can provide the wait

		//writing the general method when we have to specify for many elements
	By elocator = By.xpath("//h3[text()='Selenium Tutorial']");
	WebElement ele=waitforElementPresent(driver,elocator,10);
	ele.click();
	
	}
		public static WebElement waitforElementPresent(WebDriver driver ,By locator ,int timeout) 
		{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
		return driver.findElement(locator);
		}
		
		
	}


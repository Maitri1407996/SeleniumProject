package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       /* 
        //fluent wait declaration part
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        	       .withTimeout(Duration.ofSeconds(30))
        	       .pollingEvery(Duration.ofSeconds(5))
        	       .ignoring(NoSuchElementException.class);
        
        driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
       //writing the code for element specific
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//h3[text()='Selenium Tutorial']"));
		     
		     }
		   });
		   */
        driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        
        By elocator = By.xpath("//h3[text()='Selenium Tutorial']");
        WebElement ele =waitforElemenetwithFluentWait(driver,elocator);
        ele.click();
	}
        //generic method
        
        public static WebElement waitforElemenetwithFluentWait(WebDriver driver ,By locator) 
		{
        	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
          	       .withTimeout(Duration.ofSeconds(30))
          	       .pollingEvery(Duration.ofSeconds(5))
          	       .ignoring(NoSuchElementException.class);
		
        	 WebElement element = wait.until(new Function<WebDriver, WebElement>() {
    		     public WebElement apply(WebDriver driver) {
    		       return driver.findElement(locator);
    		     }
        	 });
        	 return element;
		}
	}



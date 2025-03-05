package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarOperate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.manage().window().maximize();
        
        WebElement box =driver.findElement(By.id("datepicker"));
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        mywait.until(ExpectedConditions.visibilityOfAllElements(box));
        box.click();
        
       String month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
       String years =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
       
       while(!(month.equals("February")&& years.equals("2026")))
       {
    	   driver.findElement(By.xpath("//a[@data-handler='next']")).click();
    	   month =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
          years= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
       }
        
    	
        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='17']")).click();

	}

}

package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[text()='Load AJAX Content']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='AJAX Content Loaded']")));
       // WebElement loaded=driver.findElement(By.xpath("//h2[text()='AJAX Content Loaded']"));
System.out.println(element.getText());
        
	}

}

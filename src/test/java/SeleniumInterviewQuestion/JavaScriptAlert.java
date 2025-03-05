package SeleniumInterviewQuestion;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
      
        //1.
        //Alert alert = driver.switchTo().alert();
        //alert.accept();
        
        //2 explicit wait
        
        /*WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert alert =mywait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        */
        
        //3 java script
        JavascriptExecutor js = (JavascriptExecutor)driver;
        try
        {
        	js.executeScript("window.alert=function{};");
        }
        catch(Exception e)
        {
        	
        }
        
        
        

	}

}

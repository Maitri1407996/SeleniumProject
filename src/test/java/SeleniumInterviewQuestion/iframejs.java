package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframejs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        
        //1.
        WebElement frameElement = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
       // driver.switchTo().frame(frameElement);
        //driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("testing");
        
//2 explicit wait
        
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        mywait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("testing");
      
	}

}

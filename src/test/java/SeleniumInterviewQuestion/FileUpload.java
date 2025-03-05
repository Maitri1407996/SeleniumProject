package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.foundit.in/UPLOAD");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
        Thread.sleep(3000);
        
        //driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\WINDOWS 10\\Downloads\\Maitri Das_Tester_3.6YOE");
        
        //JS EXECUTOR
        
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@id='file-upload']")));

	}

}

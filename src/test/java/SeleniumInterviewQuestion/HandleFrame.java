package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
       
driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
WebElement outerframe= driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));                                                                       
driver.switchTo().frame(outerframe);//passing frame as web element

WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
driver.switchTo().frame(innerframe);
   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");     
	}
}

        

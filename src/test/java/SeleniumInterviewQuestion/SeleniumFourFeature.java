package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;
public class SeleniumFourFeature {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        //above
        WebElement nameBox=  driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());
        
        //below
       WebElement dob = driver.findElement(By.xpath("//input[@class='form-control' and @name='bday']"));
       driver.findElement(with(By.tagName("input")).below(dob)).click();
       
       //TOLEFTOF
       WebElement left= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
       driver.findElement(with(By.tagName("input")).toLeftOf(left)).click();
        //driver.quit();
       
       ////input[@id='inlineRadio1']
       //TORIGHTOF
       WebElement right= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
       System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(right)).getText());
}
}

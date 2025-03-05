package SeleniumInterviewQuestion;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        
        //WebElement button= driver.findElement(By.xpath("//span[text()='right click me']"));===right click
        //double click
        WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions ac = new Actions(driver);
        //ac.contextClick(button).build().perform();====right click
        //right click
        ac.doubleClick(button).perform();
        Alert obj =driver.switchTo().alert();
        obj.accept();

	}

}

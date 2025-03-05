package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DiffBetweenActionsAndAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        
       WebElement feature = driver.findElement(By.xpath("//a[text()='Electronics ']"));
       Actions ac = new Actions(driver);
       ac.moveToElement(feature).perform();
       
       //actions class
       //action interface
       //build- return the action
       //perform- execute the action
       //if end we only write perform it will be fine
       //under perform we have already  build method defined

	}

}

package SeleniumInterviewQuestion;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        
        //element want to drag
        WebElement bank =driver.findElement(By.xpath("//li[@class='block14 ui-draggable' and @id='credit2']"));
        WebElement drop = driver.findElement(By.xpath("//ol[@id='bank']"));
        Actions ac = new Actions(driver);
        ac.dragAndDrop(bank, drop).perform();

	}

}

package SeleniumInterviewQuestion;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class keyboardActionMultipleKey {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        
        WebElement firstBox =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement secondBox =driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        
        firstBox.sendKeys("hello");
        Actions ac = new Actions(driver);
        
        //ctrl+a
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("a");
        ac.keyUp(Keys.CONTROL);
        ac.perform();
        Thread.sleep(3000);
        
        //ctrl+c
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("c");
        ac.keyUp(Keys.CONTROL);
        ac.perform();
        Thread.sleep(3000);
        
        //tab key
        ac.sendKeys(Keys.TAB);
        ac.perform();
        Thread.sleep(3000);
        
        //ctrl+v
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("v");
        ac.keyUp(Keys.CONTROL);
        ac.perform();
        Thread.sleep(3000);
        
        //compare text
        if(firstBox.getAttribute("value").equals(secondBox.getAttribute("value")))
        {
        	System.out.println("copied");
        }
        else
        	System.out.println("not copied");
	}

}

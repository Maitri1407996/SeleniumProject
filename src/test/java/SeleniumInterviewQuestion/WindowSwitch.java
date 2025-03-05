package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();   
        
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String PARENTiD = it.next();
        String childId = it .next();
        driver.switchTo().window(childId);
        String email=driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
        
        driver.switchTo().window(PARENTiD);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
        driver.quit();
       /* Set<String> handles= driver.getWindowHandles();
        List<String> hList = new ArrayList<String>(handles);
        
        if(switchToRightWindow("Human Resources Management Software",hList))
        {
        	System.out.println(driver.getCurrentUrl()+" :" +driver.getTitle());
        }
        switchToParentWindow(parentWindowId);
        System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
	}
	
	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
	}
	
	public static void switchToRightWindow(String windowTitle, List<>) {
		driver.switchTo().window();
	} */

	}

}

package SeleniumInterviewQuestion;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInsameBrowser {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> windowids= driver.getWindowHandles();
        Iterator<String> it = windowids.iterator();
         String parentid=it.next();
         String childid= it.next();
         driver.switchTo().window(childid);
         driver.get("https://rahulshettyacademy.com/");
       //a[text()='All-Access Membership-Complete Access to 25+ Courses (and counting!)']
         String course=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
   driver.switchTo().window(parentid);
   WebElement name = driver.findElement(By.cssSelector("[name='name']"));
   name.sendKeys(course);
   
   //web element screenshot
   
    File file=name.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file,new File("namepig.png"));
     
     System.out.println(name.getRect().getDimension().getHeight());
     System.out.println(name.getRect().getDimension().getWidth());
   }

}

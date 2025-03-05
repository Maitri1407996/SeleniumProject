package SeleniumInterviewQuestion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        
        //full page screenshot
       /*TakesScreenshot ts = (TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File trg = new File("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\screenshots\\homepage.png");
       FileUtils.copyFile(src, trg);
       */
        
        //PARTICULAR SECTION
      /*WebElement section = driver.findElement(By.xpath("//a[text()='Computers ']"));
      section.click();
      File src = section.getScreenshotAs(OutputType.FILE);
      File trg = new File("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\screenshots\\section.png");
      FileUtils.copyFile(src, trg); 
      */
       
        //particular webelement
        WebElement section = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\screenshots\\logo.png");
        FileUtils.copyFile(src, trg);
        
      driver.close();
        }

}

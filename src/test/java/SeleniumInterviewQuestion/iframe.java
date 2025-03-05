package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(0);
        System.out.println("inner text:" +driver.findElement(By.xpath("//h1")).getText());
        driver.switchTo().parentFrame();
        System.out.println("outer frame text:" +driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]\"")).getText());
	}

}

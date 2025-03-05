package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//all tag
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//get the link count of the footer section
		WebElement footerElement =driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
		System.out.println(footerElement.findElements(By.tagName("a")).size());
		
		//footer section first column link find out
		WebElement footerFirstColumn=footerElement.findElement(By.xpath("table/tbody/tr/td[1]/ul"));
		System.out.println(footerFirstColumn.findElements(By.tagName("a")).size());
		
		//click each and every link on footer column
		for(int i=1;i<footerFirstColumn.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerFirstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
			//print the every link page title
			Thread.sleep(5000);
		}
			Set<String> windowId= driver.getWindowHandles();
			Iterator<String> it = windowId.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			}
		
	}



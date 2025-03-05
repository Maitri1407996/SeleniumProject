package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
        //List<WebElement> option =driver.findElements(By.xpath("//li[@class='sa_sg  sa_blue_hv']//span"));)
        List<WebElement> option =driver.findElements(By.xpath("//li[@class='sa_sg sa_blue_hv']//span"));
	    System.out.println(option.size());
	    Thread.sleep(3000);
;	    for(WebElement element:option)
	    {
	    	if(element.getText().contains("webdriver"))
	    	{
	    		element.click();
	    		break;
	    	}
	    }
	}

}

package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class pseudoElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
        driver.manage().window().maximize();
        List <WebElement> element=driver.findElements(By.xpath("//form[@id='form-register']//label"));                                                                                                
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        for(WebElement lable:element)
        {
        	String script="return window.getComputedStyle(arguments[0],'::Beforer').getPropertyValue('content');";
        	String content=js.executeScript(script,element).toString();
        	if(content.contains("*"))
        	{
        		System.out.println(element.getFirst() + "mandatory field");
        	}
        	else
        	{
        		System.out.println("not mandatory");
        	}
        }
        
	}


}

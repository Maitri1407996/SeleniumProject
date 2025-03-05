package SeleniumInterviewQuestion;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStarp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//div[@class='currency-selector']/select")).click();
        List<WebElement> option = driver.findElements(By.xpath("//div[@class='currency-selector']/select/option"));
	    System.out.println(option.size());
	    for(WebElement select:option)
	    {
	    	if(select.getText().equals("Euro"))
	    	{
	    		select.click();
	    		break;
	    }
	}

	}
}

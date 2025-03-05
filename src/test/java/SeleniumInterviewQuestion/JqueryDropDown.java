package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class JqueryDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
        //selectChoiceValues(driver,"choice 1");
        
      //selectChoiceValues(driver,"choice 2","choice 2 2","choice 6");
      selectChoiceValues(driver,"all");
	}
        public static void selectChoiceValues(WebDriver driver,String... value)
        {
        	 List<WebElement> choice= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
        
        if(!value[0].equalsIgnoreCase("all"))
        	
        {
        	for(WebElement item:choice)
        	{
        		String text = item.getText();
        		for(String val:value)
        		{
        			if(text.equals(val))
        			{
        				item.click();
        				break;
        			}
        		}
        	}
        }
        else 
        {
        	try {
        	for(WebElement item:choice)
        	{
        		item.click();
        	}
        	}
        	catch(Exception e)
        	{
        		
        	}
        	
        }
        }
        

	}


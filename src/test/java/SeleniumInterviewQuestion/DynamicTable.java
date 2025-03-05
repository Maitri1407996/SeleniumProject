package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.expandtesting.com/dynamic-table");
        driver.manage().window().maximize();

        List<WebElement> rows= driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        // m nnSystem.out.println(rows);
        for(int r =1;r<=rows.size();r++)
        {
        	WebElement name =driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[1]"));
          System.out.println(name.getText());
          if(name.getText().equals("chrome"))
          {
        	String cpuLoad=  driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
        	String value =driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
        	if(value.contains(cpuLoad))
        	{
        		System.out.println("equal");
        	}
        	else
        	{
        		System.out.println("not equal");
        	}
        	break;
          }
        }
	}

}

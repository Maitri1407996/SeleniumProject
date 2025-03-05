package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSortedOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://twoplugs.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text() ='Live Posting']")).click();
        WebElement drpelement =driver.findElement(By.name("category_id"));
        Select drselect = new Select(drpelement);
        
        List<WebElement> options =drselect.getOptions();
        System.out.println(options);
        
        ArrayList OriginalList = new ArrayList();
        ArrayList TemporaryList = new ArrayList();
        
        for(WebElement option:options)
        {
        	OriginalList.add(option.getText());
        	TemporaryList.add(option.getText());
        }
        
        System.out.println("print originallist:" +OriginalList);
       System.out.println("print temporaryList:" +TemporaryList);
        
       Collections.sort(TemporaryList);
       System.out.println("after sorting:" +TemporaryList);
       
       if(OriginalList.equals(TemporaryList))
       {
    	   System.out.println("drop sorted");
       }
       else
       {
    	   System.out.println("not sorted");
       }
        
	}

}

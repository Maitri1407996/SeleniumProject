package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Checkboxhandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        //single check box
        
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();
//select all the checkbox
        
       /* List<WebElement> total =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day')]"));
	  System.out.println(total.size());
	  for(int i = 0;i<total.size();i++)

	  {
		  total.get(i).click();
	  }
	}*/
      
        //selecting any 2 values
       /* List<WebElement> total =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day')]"));
  	  System.out.println(total.size());
  	  for(WebElement chbox:total)

  	  {
  		  String checkboxname = chbox.getAttribute("id");
  		if(checkboxname.equals("monday")||checkboxname.equals("sunday"))
  		{
  			chbox.click();
  		}
	}*/
        //select last 2 check box
       /*List<WebElement> total =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day')]"));
  	  System.out.println(total.size());
  	  int checkbox=total.size();
  	  for(int i = checkbox-2;i<checkbox;i++)
  	  {
  		  total.get(i).click();
  	  }*/
        
        //select 1st few number checkbox
        List<WebElement> total =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day')]"));
    	  System.out.println(total.size());
    	  int checkbox=total.size();
    	  for(int i = 0;i<checkbox;i++)
    	  {
    		  if(i<3)
    		  {
    			  
    		  
    		  total.get(i).click();
    		  }
    	  }
	
	}
}

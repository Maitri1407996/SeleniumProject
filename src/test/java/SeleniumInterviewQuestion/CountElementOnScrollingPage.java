package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class CountElementOnScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://www.booksbykilo.in/new-books");
        driver.manage().window().maximize();
        
        
      //1 when page is not scrolling  
      /* List<WebElement> books= driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
	     System.out.println("print the number of books:" +books.size();*/
      
     //for scrolling we need js
        /* this is also not work because it is taking one scroll as the end of the page
         * 
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        List<WebElement> books= driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
	     System.out.println("print the number of books:" +books.size());
	     */
        
        //logic;
        int previousCount=0;
        int currentCount=0;
        while(true)
        {
        	List<WebElement> books= driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
        	currentCount=books.size();
        	if(currentCount==previousCount)
        	{
        		break;
        	}
        	previousCount=currentCount;
        	//one way js another action class 
        	//JavascriptExecutor js = (JavascriptExecutor)driver;
            //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        	
        	Actions ac = new Actions(driver);
        	ac.sendKeys(Keys.END).perform();
        	
            Thread.sleep(3000);
        }
        System.out.println("total number of books:" +previousCount);
	}

}

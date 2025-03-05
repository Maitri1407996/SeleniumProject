package SeleniumInterviewQuestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class findelementinscrollpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://www.booksbykilo.in/new-books");
        driver.manage().window().maximize();
        
       // driver.findElement(By.xpath("//h3[normalize-space()='Help, help Little Frog']"));

	boolean found = false;
	while(!found)
	{
		List<WebElement> books= driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
	for(WebElement book:books)
	{
		if(book.getText().equals("Help, help Little Frog"))
				{
			System.out.println("book found");
			found= true;
			break;
				}
	}
	
	//1st way
	
	/*JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	*/
	
	//2nd way
    Actions ac = new Actions(driver);
	ac.sendKeys(Keys.END).perform();
	
    Thread.sleep(3000);
	}
	
	}

}

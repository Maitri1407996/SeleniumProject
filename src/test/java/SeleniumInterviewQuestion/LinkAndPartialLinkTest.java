package SeleniumInterviewQuestion;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndPartialLinkTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=14671241360355794040&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007828&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
   driver.manage().window().maximize();
   driver.findElement(By.linkText("Today's Deals")).click();
    List<WebElement> links =driver.findElements(By.tagName("a"));
    
    int num =links.size();
    for(int i=0;i<=num;i++)
    {
    	System.out.println(links.get(i).getText());
    }
   
	}

}

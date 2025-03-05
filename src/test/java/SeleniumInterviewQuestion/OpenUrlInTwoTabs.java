package SeleniumInterviewQuestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlInTwoTabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//SAME WINDOWN DIFFERENT TAB
       /* driver.get("https://demo.nopcommerce.com/register");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();
        */
        
        //DIFFERENT WINDOw
        driver.get("https://demo.nopcommerce.com/register");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();
        
        

	}

}

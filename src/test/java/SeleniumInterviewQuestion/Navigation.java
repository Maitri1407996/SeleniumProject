package SeleniumInterviewQuestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //both possible
        //driver.navigate().to("https://www.google.com/");
		
        driver.get("https://demo.nopcommerce.com/register");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		

	}

}

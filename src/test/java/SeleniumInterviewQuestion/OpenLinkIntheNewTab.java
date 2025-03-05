package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class OpenLinkIntheNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        //String tab =Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText("Register")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}

}

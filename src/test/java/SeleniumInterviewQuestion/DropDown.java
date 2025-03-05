package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        WebElement drpcountry = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select drpcountry1 = new Select(drpcountry);
        //drpcountry1.selectByVisibleText("17");
        drpcountry1.selectByValue("17");
        
        

	}

}

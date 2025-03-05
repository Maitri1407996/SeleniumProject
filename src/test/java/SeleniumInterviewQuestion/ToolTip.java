package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement input =driver.findElement(By.xpath("//input[@id='age']"));
        String tooltip =input.getDomAttribute("title");
        System.out.println(tooltip);
        driver.close();

	}

}

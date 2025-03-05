package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
        driver.manage().window().maximize();
        WebElement min_slider =driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println(min_slider.getLocation());
		System.out.println(min_slider.getSize());
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(min_slider, 100, 0).perform();
		WebElement max_slider =driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
        action.dragAndDropBy(max_slider, -150, 0).perform();
	}

}

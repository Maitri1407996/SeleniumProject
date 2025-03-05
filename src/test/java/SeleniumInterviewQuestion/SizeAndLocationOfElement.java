package SeleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement logo =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
	////*[@id="app"]/div[1]/div/div[1]/div/div[1]/img
        //location--methdo 1;
        System.out.println("location(x,y):"+logo.getLocation());
        System.out.println("location(x):"+logo.getLocation().getX());
        System.out.println("location(x):"+logo.getLocation().getY());
        
        
      //location--methdo 2;
        System.out.println("location(x):"+logo.getRect().getX());
        System.out.println("location(x):"+logo.getRect().getY());
        
        //size-method1
        System.out.println("size(width,height):"+logo.getSize());
        System.out.println("size(width):"+logo.getSize().getWidth());
        System.out.println("size(height):"+logo.getSize().getHeight());
        
        //size-method2
        System.out.println("size(width):"+logo.getRect().getDimension().getWidth());
        System.out.println("size(height):"+logo.getRect().getDimension().getHeight());
	}

}

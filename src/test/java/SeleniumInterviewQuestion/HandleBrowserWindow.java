package SeleniumInterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();
        
        //getWindowHandle()
        //String window =driver.getWindowHandle();
        // System.out.println(window);//1st run:4C3BC3D1C51160D06861410C94917A87
        
         //2nd run:F20B2C5F25A4DB3C0FB1638091BE446A
      
         //getWindowHandles()
         
         driver.findElement(By.xpath("//a[text()='merrymoonmary']")).click();
        Set<String> windowids= driver.getWindowHandles();
        //1) method capture the id iterator method
       /*Iterator<String> it = windowids.iterator();
       String parentid= it.next();
       String childid= it.next();
       
       System.out.println("ist window" +parentid);
       System.out.println("2nd window" +childid);*/
       
       //2)/ method capture the id to change it to list
        
         /*List<String>WindowIDS=new ArrayList(windowids);//====>set changing to list
        String parent= WindowIDS.get(0);
        String child= WindowIDS.get(1);
        */
        
        /*System.out.println("print parent:" +parent);
        System.out.println("print child:" +child);
        
        //how to use window id for switching
          driver.switchTo().window(parent);
          System.out.println("parent window title:"+driver.getTitle());
uals
          driver.switchTo().window(child);
          System.out.println("child window title:"+driver.getTitle());
          */
        
          //FOR EACH loop --capture winid and switching
        //when we have multiple window have to use 
        for(String eachwindow:windowids)
        {
        	String title =driver.switchTo().window(eachwindow).getTitle();
        	System.out.println(title);
        	//closing the particular window as per our choice
        	if(title.equals("Automation Testing Practice"))
        	{
        		driver.close();
        	}
            
            
            
        }
        //driver.close();//close the child window 
        //driver.quit();//close every window
   }
	
	

}

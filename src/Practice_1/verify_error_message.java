package Practice_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class verify_error_message {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		        
		// maximize browser
		driver.manage().window().maximize();
		        
		// Open URL
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		String mainwindow=I1.next();
		String popup=I1.next();
		Thread.sleep(2000);
		 
		System.out.println(driver.switchTo().window(popup).getTitle());
		driver.switchTo().window(popup).close();
		
        driver.switchTo().window(mainwindow);
        Thread.sleep(2000);
		 
		// Click on login button
		driver.findElement(By.xpath(".//*[@id='sbtLog']")).click();
		driver.findElement(By.xpath(".//*[@id='lgnFrm']/div[8]/button")).click(); 
		
		// This will capture error message
		String actual_msg=driver.findElement(By.id("eLogin_err")).getText();
		    
		// Store message in variable
		String expect="plz enter valid email";
		                
		// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
		//exception and fail testcases
		 
		// Verify error message
		Assert.assertEquals(actual_msg, expect);
		
		
	}
}

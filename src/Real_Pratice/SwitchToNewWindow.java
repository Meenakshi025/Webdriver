package Real_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToNewWindow {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
	       
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"n");
		try{
			Thread.sleep(2000);
			for(String WinHandle:driver.getWindowHandles())
			{
				driver.switchTo().window(WinHandle);
			}
			driver.get("http://bling.com");
		}
		catch(Exception e){
			System.out.println(e);
		}
		driver.close();
	}

}

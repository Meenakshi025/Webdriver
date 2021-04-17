package Real_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollOnWebElement {

	public static void main(String[] args) throws Exception {
		
		       WebDriver driver = new FirefoxDriver();
		       
				driver.get("https://en.wikipedia.org/wiki/Main_Page");
				Thread.sleep(2000);
				           	
				JavascriptExecutor je = (JavascriptExecutor)driver;
				 je.executeScript("arguments[0].scrollIntoView(true); ", driver.findElement(By.partialLinkText("St Silin's")));
	   }
  }

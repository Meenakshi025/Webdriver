package Real_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenRightMouseClick {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		WebElement WE = driver.findElement(By.linkText("About"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(WE);
		action.contextClick(WE).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDowns {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.htmlandcssbook.com/code-samples/chapter-07/drop-down-list-box.html");
		WebElement element=driver.findElement(By.name("devices"));
		Select se=new Select(element);
		se.selectByIndex(2);
	}
	
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumFormElement {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://www.softwaretestingclass.com/wp-content/uploads/2016/08/STC-HTML-Form.html");

	
		driver.findElement(By.name("firstname")).sendKeys("softwaretestingclass");
		Thread.sleep(1000);
	
		driver.findElement(By.name("password")).sendKeys("testingclass");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value='male']")).click();
		Thread.sleep(1000);
		
		Select dropDown = new Select(driver.findElement(By.name("vehicle")));
		dropDown.selectByVisibleText("Truck");
		Thread.sleep(1000);
	
		Select selectItem = new Select(driver.findElement(By.name("profession")));
		selectItem.selectByVisibleText("Doctor");
		Thread.sleep(1000);

		driver.findElement(By.tagName("textarea")).sendKeys("Selenium WebDriver Tutorials");

		Thread.sleep(1000);

		WebElement Button = driver.findElement(By.name("button"));
		Button.click();
		// Links
		//driver.findElement(By.linkText("Visit our Selenium tutorial"));

	}

}

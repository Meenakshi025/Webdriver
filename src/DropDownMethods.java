import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_option_selected");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.cssSelector("html>body>select"));
		Select se=new Select(element);
		Thread.sleep(2000);
		
		//se.selectByVisibleText("Volvo");
		se.selectByVisibleText("Volvo");
		
		//To get all the options present in the dropdown
		List<WebElement> allOptions = se.getOptions();
		for (WebElement webElement : allOptions)
		{
			System.out.println(webElement.getText());
		}
		Thread.sleep(2000);
		
		//To get all the options that are selected in the dropdown.
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
			System.out.println("You have selected::"+ webElement.getText());
		}
		Thread.sleep(2000);
		
		//To get the first selected option in the dropdown
		WebElement firstOption = se.getFirstSelectedOption();
		System.out.println("The First selected option is::" +firstOption.getText());
		
		if(se.isMultiple())
		{
		System.out.println("Select tag allows multiple selection");	
		}
	}
}

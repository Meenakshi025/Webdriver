package Real_Pratice;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import javax.management.openmbean.OpenType;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;







import sun.net.ftp.FtpDirEntry.Type;

public class DropownBoxesOnPage {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		// Count total number of dropdownboxes on webpage
        List<WebElement> dropdownboxes =  driver.findElements(By.tagName("select"));
		System.out.println(" total number of dropdownboxes on webpage = "+dropdownboxes.size());
		
		// Count total number of textboxes on webpage
		List<WebElement> textboxes =  driver.findElements(By.className("inputtext"));
		System.out.println(" total number of textboxes on webpage = "+textboxes.size());
		
		// Count total number of button on webpage
		List<WebElement> button =  driver.findElements(By.tagName("button"));
		System.out.println(" total number of button on webpage = "+button.size());
		
		// Count total number of radiobutton on webpage and is displayed or not
			List<WebElement> radiobutton =  driver.findElements(By.name("sex"));
			System.out.println(" total number of radiobutton on webpage = "+radiobutton.size());
			
	   // Count total number of links on webpageand prit the link of text
		 List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println(" total number of links on webpage = "+links.size());
		for(WebElement link: links){
			System.out.println(link.getText());
		}
		//retrieve value from textbox
		driver.findElement(By.id("email")).sendKeys("meenifsss@gmail.com");
		String str = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("value: "+str);
		
		 // Count total number of IMAGES on webpage
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("http://akhilreddy.com/");
		
		//Get Domain Name
		URL url = new URL(driver.getCurrentUrl());
		String domain = url.getHost();
		System.out.println(domain);
		
		List<WebElement> image =  driver.findElements(By.tagName("img"));
		System.out.println(" total number of image on webpage = "+image.size());
		
		//To verify page title using assert method
		String Title = driver.getTitle();
		System.out.println("Page title :"+Title);
		Assert.assertTrue(Title.contains("Akhil Reddy Technologies |Testing Tools Training In Hyderabad"));
		
		//verify text present on webpage
		if(driver.getPageSource().contains("Learn Any Where Any Time")){
			System.out.println("Text present on webpage");
		}else{
			System.out.println("Text not present on webpage");
		}
		//Scroll to bottom of page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2500)");
		
		//Capture screenshots
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Screenshot\\screens.png"));
		Thread.sleep(2000);
		
		driver.quit();
	    }
}	

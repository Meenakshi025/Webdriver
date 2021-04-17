package Real_Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllImageUrlsOnWebpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
	       
		driver.get("https://google.com");
		Thread.sleep(2000);

        List<WebElement> listimages = driver.findElements(By.tagName("img"));
       System.out.println("Number of images: "+listimages.size());
       
	}

}

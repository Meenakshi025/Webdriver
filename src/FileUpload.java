import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUpload {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.tinypic.com");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='the_file']")).sendKeys("C:\\Users\\Sachin\\Desktop\\ffffd.txt");
	}

}

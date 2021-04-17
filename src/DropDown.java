import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		String sCellValue1 =  driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[3]")).getText();
		String sCellValue2 = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[4]")).getText();
		System.out.println(sCellValue);
		System.out.println(sCellValue1);
		System.out.println(sCellValue2);
		
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
	    driver.close();
		
	}

}

package Real_Pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_From_WebTable {
	
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 driver.get("http://toolsqa.wpengine.com/automation-practice-table");
	
      List rows = driver.findElements(By.xpath(".//*[@id='content']/table/thead/tr[2]"));
      System.out.println("Rows size "+rows.size());
      
 for(int i = 0; i < rows.size(); i++){
	 
	 System.out.println(rows.get(i));
	 
 }
}
}

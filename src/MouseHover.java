import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		  
	     // Wait For Page To Load
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	     // Go to URL
	     driver.get("http://www.myntra.com"); 
	     // Maximize Window
	     driver.manage().window().maximize();
	  
	     // Mouse Over On " Women link " 
	     Actions a1 = new Actions(driver);
	     a1.moveToElement(driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div/nav/div/div[1]/div/a"))).click().build().perform();
	     
	     Thread.sleep(3000);
	  
	     // Wait For Page To Load
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	     // Click on " Indian & Fusion Wear " link
	     driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[3]/div[2]/div[1]/a[1]")).click();
	  
	     // click on the categories - Bagpacks

	     // Hover on the 1st bag 
	     Actions a2 = new Actions(driver);
	     a2.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[5]/ul/li[5]/div[1]/span[2]"))).build().perform();
	    driver.findElement(By.xpath("html/body/div[4]/div[2]/div[3]/div[3]/div[3]/button[2]")).click();
	    driver.findElement(By.xpath("html/body/div[4]/div[2]/div[3]/div[5]/button")).click(); 
	    
	     // Wait For Page To Load
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	     // Hover over the shopping bag icon present on the top navigatinal bar   
	     Actions a3 = new Actions(driver);
	     a3.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/a[2]/span"))).build().perform();
	  
	     // click on the remove icon
	     driver.findElement(By.xpath(".//*[@id='prod-item-1475783353']/div[2]/div[5]/span[4]")).click();
	  
	     //closing current driver window 
	     driver.close();
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Commands {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();

		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("http://www.bbc.com");
		driver.manage().window().maximize();
		// Storing Title name in String variable so that we can get the title name
		String btitle = driver.getTitle();
		// Printing the Title name in 2 ways
		System.out.println("Title " + btitle);

		// Storing Title length in Int variable because we are dealing with Integers that's why int is used.
		int bTitleLength = driver.getTitle().length();
		// Printing Title l0ength
		System.out.println("Lengthhe Title is : " + bTitleLength);
		
		// Storing URL in String variable
		String b1 = driver.getCurrentUrl();
		// Printing URL on Console Window
		System.out.println("URL " + b1);

		// Storing URL length
		int b2 = driver.getCurrentUrl().length();
		// Printing URL length on console Window
		System.out.println("URLth is : " + b2);

		// COMMAND FOR NAVIGATION THROUGH PAGES.

		//Open the NEWS Page.
		String b3 = driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[1]/a")).getText();
		
		// Print the Tab name which is being clicked.
		System.out.println("Name Tab which is being clicked is : " + b3);
		Thread.sleep(2000);
		
		// Click on the Tab
		driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[1]/a")).click();
		Thread.sleep(1000);
		
		//Get the text where Xpath is pointing.
		String b4 = driver.getTitle();
		
		// Print the text of the current page
		System.out.println("Text of current page is : " + b4);
		Thread.sleep(1000);
		
		//Navigate to previous Page.
		driver.navigate().back();
		Thread.sleep(2000);
		String b5 = driver.getTitle();
		
		// Print the text of the previous page
		System.out.println("Text of previous page is : " + b5);

		//Navigate to Next page.
		driver.navigate().forward();
		Thread.sleep(2000);
		
		// Print the text of the NEXT page
		String b6 = driver.getTitle();
		System.out.println("Texthe NEXT page is : " + b6);
		Thread.sleep(1000);
		
		// COMMAND FOR REFRESHING THE CURRENT PAGE

	    driver.get(driver.getCurrentUrl());
	    Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		// PAGE SOURCE COMMAND
		// Storing Page Source in String variable.
		/*String b7 = driver.getPageSource();
		Thread.sleep(1000);*/
		// Printing the Page Source
		//System.out.println("Pagece : " + b7);

		// Storing Page Source length in Int variable
		int b8 = driver.getPageSource().length();
		// Printing the Page Source length
		System.out.println("Length of page source is : " + b8);

		//close the browser or page currently which is having the focus.
		driver.close();
	}

}

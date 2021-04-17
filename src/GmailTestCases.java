import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTestCases {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium testing Videos\\Software\\Exe files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Create Object For Chrome Driver		
	 // WebDriver driver = new FirefoxDriver(); // Create Object For Firefox Driver
		driver.get("https://www.messenger.com/");
		Thread.sleep(4000); // wait for 4 sec
		driver.navigate().refresh(); // page refresh
		// driver.manage().window().maximize(); // maximize browser window
		
		try {
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(
					"meenifsss@gmail.com");
			Thread.sleep(2000);

			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(
					"Meenu@676");
			Thread.sleep(2000);

			driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
			Thread.sleep(2000);

			driver.findElement(
					By.xpath(".//*[@id='row_header_id_user:100002683008403']"))
					.click();
			Thread.sleep(3000);

			driver.findElement(
					By.xpath("//*[@id='cch_f236bbf3c8c05a4']/div[2]/div[2]/div[2]/div[1]/div/div"))
					.sendKeys("Hi Shital" + "\n" + "This is a test message");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='js_8i']/em")).click();

		} catch (Throwable t) {

			t.getStackTrace();

		}
		driver.close();
	}

}

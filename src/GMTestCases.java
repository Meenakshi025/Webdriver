import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GMTestCases {

	public static void main(String[] args) throws Exception {	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		
		try {	
			
			// -------------------------CASE – 1 [ Enter wrong user Name and Click on next button ] ----------------------------------------------------------------
			WebElement gmail = driver	.findElement(By.xpath(".//*[@id='Email']"));
			WebElement nextbutton = driver.findElement(By.xpath(".//*[@id='next']"));
			WebElement password = driver.findElement(By	.xpath(".//*[@id='Passwd']"));
			WebElement signinbutton = driver.findElement(By.xpath(".//*[@id='signIn']"));	
			gmail.sendKeys("meenagmail.com");			
			nextbutton.click();
			Thread.sleep(2000);
			WebElement emailerror = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']"));
			System.out.println(emailerror.getText());			
			driver.findElement(By.xpath(".//*[@id='Email']")).clear();

			// -------------------------CASE – 1  [ Enter wrong user Name and Click on next button ] ----------------------------------------------------------------
					
		} catch (Throwable e) {
			System.out.println("Emaild not found: " + e.getMessage());
		}
	try{
		//------------------------- CASE – 2 [ Enter Correct UserName and Wrong Password. ] Start------------------------------------------------------------------
		WebElement gmail = driver	.findElement(By.xpath(".//*[@id='Email']"));
		WebElement nextbutton = driver.findElement(By.xpath(".//*[@id='next']"));
		WebElement password = driver.findElement(By	.xpath(".//*[@id='Passwd']"));
		WebElement signinbutton = driver.findElement(By.xpath(".//*[@id='signIn']"));	
		gmail.sendKeys("meenakshi.patil04@gmail.com");
		nextbutton.click();
		Thread.sleep(2000);		
		password.sendKeys("meenakshi");			
		signinbutton.click();			
		Thread.sleep(2000);
		WebElement passworderror = driver.findElement(By	.xpath(".//*[@id='errormsg_0_Passwd']"));
		System.out.println(passworderror.getText());	
		driver.findElement(By.xpath(".//*[@id='link-signin-different']/a")).click();
		//------------------------- CASE – 2 [ Enter Correct UserName and Wrong Password. ] End------------------------------------------------------------------
	}
	catch (Throwable e) {
		System.out.println("Emaild not found: " + e.getMessage());
	}
	
	try{
		//------------------------ CASE – 3 [ Enter Correct UserName and Correct Password. ] Start-----------------------------------------------------------------

		WebElement gmail = driver	.findElement(By.xpath(".//*[@id='Email']"));
		WebElement nextbutton = driver.findElement(By.xpath(".//*[@id='next']"));
		WebElement password = driver.findElement(By	.xpath(".//*[@id='Passwd']"));
		WebElement signinbutton = driver.findElement(By.xpath(".//*[@id='signIn']"));	
		gmail.sendKeys("meenakshi.patil04@gmail.com");
		nextbutton.click();
		Thread.sleep(2000);
		password.sendKeys("Meenu@676");
		signinbutton.click();
		Thread.sleep(2000);
		System.out.println("...........Login was Sucessful..........");

		String Expected = "https://mail.google.com/mail/u/0/#inbox";
		String URLTitle = driver.getCurrentUrl();
		if (URLTitle.contains(Expected)) {
			System.out.println("Login Sucessful");
		} else {
			System.out.println("Login failed");
		}			
		//------------------------ CASE – 3 [ Enter Correct UserName and Correct Password. ] End-----------------------------------------------------------------
	}
	catch (Throwable e) {
		System.out.println("Emaild not found: " + e.getMessage());
	}
    driver.close();
	}

}

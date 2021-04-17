package Real_Pratice;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckFireFoxVersion {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Capabilities caps = ((RemoteWebDriver)driver).getCapabilities();
		
		String browserName = caps.getBrowserName();
		String browserVersion = caps.toString();
        System.out.println(browserName+" "+browserVersion); 
	}

}

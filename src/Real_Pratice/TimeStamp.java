package Real_Pratice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeStamp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		DateFormat df= new SimpleDateFormat("yyyy_MM_dd_HH_MM_SS");
		Date d = new Date();
		String time = df.format(d);
		
		driver.get("http://google.cpm");
		System.out.println(time);
		driver.close();
		

	}

}

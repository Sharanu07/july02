package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	// Browser related code
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\software\\chrom\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
	     return driver;
	}
	
	//public static WebDriver openFirefoxBrowser() {
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\software\\geckodriver.exe");
	//	 WebDriver driver= new FirefoxDriver();
	   //  return driver;
	//}

}

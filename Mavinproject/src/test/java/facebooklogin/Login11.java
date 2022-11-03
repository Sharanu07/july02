package facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LogU;

public class Login11 {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\software\\chrom\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	LogU logs = new LogU (driver);
	
	logs.sendEmailId();
	logs.sendPassword();
	logs.ClickonLogin();

}
}

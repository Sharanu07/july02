package facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class Logn {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\software\\chrom\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
			
			LoginPage logd= new LoginPage(driver);
			logd.sendUserName();
			logd.sendPassword();
			logd.clickonLoginButton();

		//	String url= driver.getCurrentUrl();
				String title=driver.getTitle();
	
				if(title.equals("Log in to Facebook"))
				{
					System.out.println("PASSED");
				}
				else
				{
					System.out.println("FAILED");
		    	}
	}
	}
package facebooklogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;
import setup.Base;

public class TestClassforcrossbrws  extends Base{
		 private WebDriver driver;
		 private LoginPage loginpage;
		 private MessengerPage messengerpage;
		 private RoomsPage roomspage;
	   
  
	@BeforeTest
	  @Parameters("browserName")
	public void launchBrowser(String browserName) {
		
		if(browserName.equals("Chrome"))
		{
		driver= openChromeBrowser();
		}
		
		if(browserName.equals("Firefox"))
		{
			driver= openFirefoxBrowser();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@BeforeClass
public void createPOMObjects() {
	loginpage= new LoginPage(driver);
	 messengerpage = new MessengerPage(driver);
	 roomspage =new RoomsPage(driver);
}
	
	
	
	
	
	
@BeforeMethod
	public void beforeMethod() {
			System.out.println("before Method");
			driver.get("https://www.facebook.com/");

			loginpage.openMessengerPage();
		
			messengerpage.clickonRoomstab();
			
	
	}
	
	@Test
	public void test123() {
		System.out.println("test 1");
		roomspage.returnTomessenger();
		
		//Actual results
		String  url=driver.getCurrentUrl();
		//String title = driver.getTitle();
		
		Assert.assertEquals(url, "https://www.messenger.com/");
		
	
	}

	
	@Test
	public void test1234() {
		System.out.println("test 2");
		roomspage.goBackToHelpCenter();
		
		//Actual results
				String url=driver.getCurrentUrl();
				//String title = driver.getTitle();
				
				Assert.assertEquals(url, "https://www.messenger.com/help");
				
				
		
	}
	
	@AfterMethod 
	public void logOutFromApllication() {
		System.out.println("aftr method");
		System.out.println("logout");
	}
	
	@AfterClass
	public void clearObject() {
		loginpage=null;
		messengerpage=null;
		 roomspage=null;
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null;
		System.gc();
	}

}

package facebooklogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;

public class TestClass1 {
	
	 private WebDriver driver;
	 private LoginPage loginpage;
	 private MessengerPage messengerpage;
	 private RoomsPage roomspage;
	 
	 @Parameters("browser")
	 
@BeforeTest
public void launchBrowser(String browserName) {
	
	if(browserName.equals("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\software\\chrom\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	
	if(browserName.equals("Firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\software\\New folder\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@BeforeMethod
public void beforeMethod() {
		System.out.println("before Method");
		driver.get("https://www.facebook.com/");
		
		loginpage= new LoginPage(driver);
		loginpage.openMessengerPage();
		
		 messengerpage = new MessengerPage(driver);
		messengerpage.clickonRoomstab();
		
		 roomspage =new RoomsPage(driver);
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

}


}

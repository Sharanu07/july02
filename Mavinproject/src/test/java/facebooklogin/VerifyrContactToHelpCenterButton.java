package facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;

public class VerifyrContactToHelpCenterButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\software\\chrom\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
			
			LoginPage loginpage= new LoginPage(driver);
			loginpage.openMessengerPage();
			
			MessengerPage messengerpage = new MessengerPage(driver);
			messengerpage.clickonRoomstab();
			
			RoomsPage roomspage =new RoomsPage(driver);
			roomspage.goBackToHelpCenter();
	
	}}

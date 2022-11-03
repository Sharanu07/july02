package facebooklogin;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.SignupPopup;



public class Signuptest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\software\\chrom\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	SignupPopup signuppopup =new SignupPopup(driver) ;
	    signuppopup.clicksignup();
	    
	    signuppopup.clickonfirstname();
	    
		signuppopup.sendFirstName();
		
		signuppopup.sendLasttName();
		
		signuppopup.sendMobileNo();
		
		signuppopup.sendnewpassword();
		
		signuppopup.selectdate();
		
		signuppopup.ClickonMonth();
		
		signuppopup.selectmonth();
		
		signuppopup.Clickonyear();
		
		signuppopup.selectyear();
		
		signuppopup.SelectGender();
		
		signuppopup.SubmitButton();
	

	
}}

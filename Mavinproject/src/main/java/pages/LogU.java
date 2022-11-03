package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogU {
	
	@FindBy (xpath="//input[@name='email']")
	  private WebElement Emailid;
	
	@FindBy (xpath="//input[@name='pass']")
	  private WebElement Password;

	@FindBy (xpath="//button[text()='Log in']")
	  private WebElement Loginbutton;

	
	
	// constructor
	public LogU(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions on Web elements 
	
	public void ClikEmailId() {
		Emailid.click();
	}
	
	public void sendEmailId() {
		Emailid.sendKeys("dhareppamugali98@gmail.com");
	}
	
	public void sendPassword() {
		 Password.sendKeys("7026006052");
	}
	
	public void ClickonLogin() {
		Loginbutton.submit();
	}
}

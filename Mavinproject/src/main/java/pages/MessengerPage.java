package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	
	//variables-WebElement
			@FindBy (xpath = "//a[text()='Rooms']")
			private WebElement rooms ;
			
			@FindBy (xpath = "//a[text()='Features']")
			private WebElement features ;
			
			@FindBy (xpath = "//a[text()='Desktop app']")
			private WebElement desctopApp;
			
			//Constructor- Initialization
			public MessengerPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			// Methods-Actions on Webelemet
			public void clickonRoomstab() {
				rooms.click();
			}
			
			public void clickonfeatures() {
				features.click();
			}
			
			public void clickondesctopApp() {
				desctopApp.click();
			}

}

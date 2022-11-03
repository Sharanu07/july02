	package pages;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class LoginPage {
		
		//variables-WebElement
		@FindBy (xpath = "//input[@id='email']")
		private WebElement userName ;
		
		@FindBy (xpath = "//input[@name='pass']")
		private WebElement password ;
		
		@FindBy (xpath = "//button[text()='Log in']")
		private WebElement loginButton;
		
		@FindBy (xpath = "//a[text()='Messenger']")
		private WebElement messengerLink ;
		
		// constructor-Initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
		
		//Methods- Actions on webelement
		
		public void sendUserName() {
			userName.sendKeys("sharanureshmi");
		}	
			public void sendPassword() {
				password.sendKeys("9980793528");
				
	    }
		
		public void clickonLoginButton() {
			loginButton.click();
			
		}
		
		public void openMessengerPage() {
			messengerLink.click();
		}
	
		//Group of actions
		public void loginToAplicaton() {
			userName.sendKeys("sharanureshmi");
			password.sendKeys("8073740755");
			loginButton.click();
			
			
		
			
			
			
		}
	}


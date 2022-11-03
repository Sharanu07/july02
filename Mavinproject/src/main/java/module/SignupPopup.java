package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPopup {
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firstName ;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement lastName ;
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement mobileNo;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement Newpassword;
    
	@FindBy (xpath = "//a[text()='Create New Account']")
	private WebElement signupbutton;
	
	@FindBy (xpath = "//select[@aria-label='Day']")
	private WebElement SelectDate;

	
	@FindBy (xpath = "//select[@aria-label='Month']")
	private WebElement SelectMonth;
	
	@FindBy (xpath = "//select[@aria-label='Year']")
	private WebElement SelectYear;
	
	
	@FindBy (xpath = "(//span[@class='_5k_2 _5dba'])[2]")
	private WebElement Selectgender;
	
	
	@FindBy (xpath = "(//button[@type='submit'])[1]")
	private WebElement submitbutton;
	
	
	

	//Constructor-Initialization
	public SignupPopup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}

	// Method -Actions on WebElement
	 public void sendFirstName() {
	
		 firstName.sendKeys("dhareppa");
	 }
	 
	 public void sendLasttName() {
		 lastName.sendKeys("mugali");
	 }
	 
	 public void sendMobileNo() {
		 mobileNo.sendKeys("8317488876");
	 }
	 
	 public void clicksignup() {
		 signupbutton.click();;
	 }
	 
	 public void clickonfirstname() {
		 firstName.click();
	 }
	 
	 public void sendnewpassword() {
		 Newpassword.sendKeys("7026006052");
	 }
	 public void selectdate() {
		 Select drop = new Select(SelectDate);
		 drop.selectByVisibleText("27");
	 }
	 
	 public void ClickonMonth() {
		 SelectMonth.click();
	 }
	 
	 public void selectmonth() {
		 Select month = new Select(SelectMonth);
		 month.selectByValue("9");
	 }
	 
	 public void Clickonyear() {
		 SelectYear.click();
	 }
	 
	 public void selectyear() {
		 Select year = new Select(SelectYear);
		 year.selectByVisibleText("1999");
	 }
	 
	 public void SelectGender() {
		 Selectgender.click();
	 }
	 
	 public void SubmitButton() {
		 submitbutton.submit();
	 }
	 
	 
	 }

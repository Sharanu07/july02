package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontPage {
	
	@FindBy (xpath="(//input[@aria-autocomplete='list'])[1]")
	private WebElement SearchButton;
	

}

package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {
	
	WebDriver ldriver;
	
	public SearchCustomerPage(WebDriver rDriver) {
		
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	
	@FindBy(id="SearchEmail")
	WebElement email;
	
	@FindBy(id="search-customers")
	WebElement searchCustomerButton;
	
	// //
	
	public void entermail(String mail) {
		
		email.sendKeys(mail);
	}
	
	public void serachbutton() {
		
		searchCustomerButton.click();
	}
	
	
	
	
	
	

}

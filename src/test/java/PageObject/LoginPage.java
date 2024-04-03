package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver) {
		
		ldriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement logOut;
	
	
	
	public void enterEmailAddress(String emailAdd) {
		
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pass) {
		
		password.clear();
		password.sendKeys(pass);
	}
	
	public void clickLoginButton() {
		
		loginButton.click();
	}
	
	public void clickLogoutButton() {
		
		logOut.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

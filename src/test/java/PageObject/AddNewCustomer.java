package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	WebDriver ldriver;
	
	public AddNewCustomer(WebDriver rDriver) {
		
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")
	WebElement customerDD;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	WebElement customer;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/a")
	WebElement AddNew;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Gender_Male")
	WebElement gender;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
	WebElement saveButton;
	
	@FindBy(xpath="The new customer has been added successfully.")
	WebElement confirmationMessage;
	
	
	
	
	public void clickCustomerDD() {
		
		customerDD.click();
	}
	
	public void clickCustomer() {
		
		customer.click();
	}
	
	public void AddNewCust() {
		
		AddNew.click();
	}
	
	public void enteremail(String mail) {
		
		email.sendKeys(mail);
	}
	
	public void enterPass(String pass) {
		
		password.sendKeys(pass);
	}
	
	
	public void enterfirstname(String name) {
		
		firstName.sendKeys(name);
	}
	
	public void enterlastname(String lname) {
		
		lastName.sendKeys(lname);
	}
	
	public void genderselection() {
		
		gender.click();
	}
	
	public void clicksavebutton() {
		
		saveButton.click();
	}
	
	
	
	
	
	
	

}

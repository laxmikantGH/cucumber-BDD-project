package Base;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddNewCustomer;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;
import org.apache.logging.log4j.*;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public AddNewCustomer addNewCust;
	public SearchCustomerPage searchCP;
	public static Logger log;
	
	
	public static String emailGenarator() {
		
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return(generatedString+"@gmail.com");
	}
	
	

}

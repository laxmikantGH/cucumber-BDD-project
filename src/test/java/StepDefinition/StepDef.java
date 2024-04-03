package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;
import PageObject.AddNewCustomer;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDef extends BaseClass{
	
	

	
	@Given("Chrome Browser is open")
	public void chrome_browser_is_open() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage=new LoginPage(driver);
		addNewCust=new AddNewCustomer(driver);
		searchCP=new SearchCustomerPage(driver);
		log = LogManager.getLogger("StepDef"); 
		log.info("################ Chrome browser is launched and test ceses will be start #############");
	   
	}

	@When("User open URL as {string}")
	public void user_open_url_as(String url) {
		
		driver.get(url);
	 
	}

	@When("Enter Email as {string}")
	public void enter_email_as(String email) {
		
		loginPage.enterEmailAddress(email);
	  
	}

	@When("Password as {string}")
	public void password_as(String password) {
	  
		loginPage.enterPassword(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		
		loginPage.clickLoginButton();
	
	}

	@SuppressWarnings("deprecation")
	@Then("User should should see page title as {string}")
	public void user_should_should_see_page_title_as(String expextedTitle) {
	  String ActualTitle=driver.getTitle();
	  
	  if(ActualTitle.equals(expextedTitle)) {
		  
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.assertTrue(false);
	  }
	  
	}

	@When("click on Logout button")
	public void click_on_logout_button() throws InterruptedException {
		Thread.sleep(3000);
		loginPage.clickLogoutButton();
	  
	}

	

	@Then("close browser")
	public void close_browser() {
		
		driver.close();
		driver.quit();
	  
	}
	
	@When("User Click on Customers Drop Down")
	public void user_click_on_customers_drop_down() {
		
		addNewCust.clickCustomerDD();
	  
	}

	@When("Clicks on Customers option")
	public void clicks_on_customers_option() {
		addNewCust.clickCustomer();
	}

	

	@When("User clicks on AddNew button")
	public void user_clicks_on_add_new_button() {
		
		addNewCust.AddNewCust();
	  
	}

	@When("Provides all data of new customer")
	public void provides_all_data_of_new_customer() {
		addNewCust.enteremail(BaseClass.emailGenarator());
		addNewCust.enterfirstname("RRajlpo");
		addNewCust.enterlastname("Olllboroyqasde");
		addNewCust.enterPass("polakshpo");
		addNewCust.genderselection();
		log.info("new customers info is sent");
	}

	@When("click on save button")
	public void click_on_save_button() {
		
		addNewCust.clicksavebutton();
		log.info("save button clicked done");
		
	}

	@Then("confirmation message will be displayed as {string}")
	public void confirmation_message_will_be_displayed_as(String expectedMess) {
		
		WebElement body=driver.findElement(By.tagName("body"));
		
		if(body.getText().contains(expectedMess)) {
			
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
		
	   
	}
	
	@Then("User should should see Dashboard as {string}")
	public void user_should_should_see_dashboard_as(String string) {
		String AM=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]")).getText();
	  
	  Assert.assertTrue(AM.equals(string));
	  
	}

	@When("Enters email in to email field as {string}")
	public void enters_email_in_to_email_field_as(String string) {
	   
		searchCP.entermail(string);
	}


	@After
	public void teardown(Scenario sc) throws IOException {
		
		if(sc.isFailed()) {
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\DELL\\eclipse-workspace\\CucumberBDDFramework\\Screenshots\\imgage.png"));
		}
	}
	
	

	@Then("Close browser")
	public void close_browsers() {
		
		driver.close();
		driver.quit();
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

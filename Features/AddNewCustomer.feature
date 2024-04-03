
Feature: Adding New Customer

Background: Commen steps performed in every Scenario
    Given  Chrome Browser is open
 		When  User open URL as "https://admin-demo.nopcommerce.com/login"
 		And Enter Email as "admin@yourstore.com"
 		And Password as "admin"
 		And Click on Login button
  

@Smoke
Scenario: Adding New Customer In Application
   
 		Then User should should see page title as "Dashboard / nopCommerce administration"
 		When User Click on Customers Drop Down
 		And Clicks on Customers option
 		When User clicks on AddNew button
 		And Provides all data of new customer
 		And click on save button
 		Then confirmation message will be displayed as "The new customer has been added successfully." 
 		
@Sanity	
Scenario: Serach Customer By Using Email
    
 		When User Click on Customers Drop Down
 		And Clicks on Customers option
 		And Enters email in to email field as "admin@yourstore.com"
 		And Close browser
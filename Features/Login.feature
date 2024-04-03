
Feature: Login functionality Of Application



  

@Sanity
Scenario: Verify Login Functionality With Valid Credentials
    Given  Chrome Browser is open
 		When  User open URL as "https://admin-demo.nopcommerce.com/login"
 		And Enter Email as "admin@yourstore.com"
 		And Password as "admin"
 		And Click on Login button
 		Then User should should see page title as "Dashboard / nopCommerce administration"
 		When click on Logout button
 		Then User should see "Your store. Login" 
 		And close browser

Scenario Outline:   Verify Login Functionality With Valid Credentials

    Given  Chrome Browser is open
 		When  User open URL as "https://admin-demo.nopcommerce.com/login"
 		And Enter Email as "<email>"
 		And Password as "<password>"
 		And Click on Login button
 		Then User should should see page title as "Dashboard / nopCommerce administration"
 		When click on Logout button
 		Then User should see "Your store. Login" 
 		And close browser

Examples: 
|email|password|
|admin@yourstore.com|admin|
	
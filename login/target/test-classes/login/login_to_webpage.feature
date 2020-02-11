
Feature:  Login Functionality
@tag1
Scenario: Successfull login into webpage with valid crtedntials
Given navigate to home page of that webpage
When User valid enters username and password 
|username|password|
|mercury|mercury| 
|Rick|Rick123|
|Andrew|Andrew123|
Then  it shows message as login successfully 
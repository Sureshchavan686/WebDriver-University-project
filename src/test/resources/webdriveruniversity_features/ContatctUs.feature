Feature: In the Webdriveruniversity.com user enters details in contatct us form then form is submitted successfully. 
	If the user clicks on reset then all data entered by user should be deleted.
		
Background: 
	Given User access webdriveruniversity.com 
	When User click on Contact us button 
	
Scenario: User submits the details in contact us form 
	Then User enteres FirstName  
	Then User Enters Lastname 
	Then User enters valid email 
	Then User enters comments 
	And Clicks on Submit button 
	

Scenario: User resets the data filled by him
	Then User enteres invalid FirstName
	|xyzz|  
	Then User Enters invalid Lastname
	|dsdsd|  
	Then User enters invalid valid email 
	|ssadsdsd|
	Then User enters invalid comments 
	And Clicks on Submit button 
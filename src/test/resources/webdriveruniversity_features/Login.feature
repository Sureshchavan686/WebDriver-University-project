Feature: User logins to webdriveruniversity.com with diff credentials

Background:
Given user is on webdriveruniversity.com page
When user click on login portal to sign in

@Smoke
Scenario Outline: User login to webdriver university with valid data	
Then user enters Username "<Username>"
Then user enters Password "<Password>"
And user submits the details

Examples: 
|Username	|Password	|
|sasasa|	dsds|
|ddsdsd|	uuttyt	|


Scenario Outline: User login to webdriver university with invalid data
Then user enters Username "<Username>"
Then user enters Password "<Password>"
And user submits the details

Examples: 
|Username	|Password	|
|121212|	dfsfd|
|888888|	ujklo	|
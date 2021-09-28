Feature: Test whether application launcesh


Scenario: Launch application
Given User is on specified url
When User enters username and password
Then Login page displayed
And User logged in successfully
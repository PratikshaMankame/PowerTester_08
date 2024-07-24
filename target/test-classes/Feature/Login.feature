Feature: Login functionality of SwagLabs application

Scenario Outline: Login with valid credential
Given User navigates to login page
When User enters valid username "<username>"
And User enters valid password "<password>"
And Clicks on login button
Then User should login successfully

Examples:
|username|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|


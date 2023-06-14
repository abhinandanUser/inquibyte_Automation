Feature: Login to gmail site
Scenario: Successful login with valid crendentials.
Given User launch chrome browser
When User open URL "https://mail.google.com"
Then User enters Email as "automationtest491@gmail.com" 
And Click on next button by entring email
Then User enters Password as "automation@123"
And Click on next button by entering pasword



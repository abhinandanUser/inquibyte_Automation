Feature: Compose function in gmail

 Background: Below are common steps for every scenario
Given User launch chrome browser
When User open URL "https://mail.google.com"
Then User enters Email as "automationtest491@gmail.com" 
And Click on next button by entring email
Then User enters Password as "automation@123"
And Click on next button by entering pasword

Scenario: To Test Compose function in gmail.
When Click on Compose option
Then Title should be visible "New Message"
And Verify text fields must be visible - Recipients,Subject 
And Verify buttons must be visible - Send,Formatting options,Attach files,Insert link, Insert emoji,Insert files using drive,Insert photo,Toggle confidential mode, Insert signature,Discard draft



Scenario: To send an email by adding all mandatory data.
When Click on Compose option
Then Enter reciptients email adresss "automationtest491@gmail.com"
Then Enter email subject "Incubyte"
And Enter Email body "Automation QA test for Incubyte"
And Click on Send button
Feature: This is a Contact Page Functionalities


@DisplayEmailfield
Scenario: Verify Contact Email field in Contact Page 
Given Launch demoblaze <"URL"> Application
Then Click Contact Link
Then Verify Contact Email field in Contact Page 

@DisplayNamefield
Scenario: Verify Contact Name field in Contact Page 
Given Launch demoblaze <"URL"> Application
Then Click Contact Link
Then Verify Contact Name field in Contact Page 


@DisplayMessagefield
Scenario: Verify Message field in Contact Page 
Given Launch demoblaze <"URL"> Application
Then Click Contact Link
Then Verify Message field in Contact Page 


@DisplayMessagebutton
Scenario: Verify send message button is clickable
Given Launch demoblaze <"URL"> Application
Then Click Contact Link
Then Click send message button
Then Verify send message button is clickable



@DisplayVerification
Scenario: Verify User able to send a message after clicking the Send button 
Given Launch demoblaze <"URL"> Application
Then Click Contact Link
Then Enter email address in contact email field
Then Enter contact name in contact name field
Then Enter message in message field
Then Click send message button
Then Verify  User able to send a message after clicking the Send button 
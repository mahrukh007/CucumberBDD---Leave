Feature: apply leaves 

Scenario: Login into account with correct validation and apply leaves 

Given User navigates to ESS  
And User enters login credentials 
And User navigates to Leave Managment >> Leave Request
And User clicks ADD button 
And User selects leave type 
And User enters days 
And User enters start date 
And User enters Reason 
And User clicks save button 
When User clicks submit for approval button 
Then Record is submitted 


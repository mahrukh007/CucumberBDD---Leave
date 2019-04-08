Feature: apply expense 

Scenario: Submit an expense

Given User navigates to ESS  
And User enters login credentials 
And navigate to ESS >> Expense Management >> expenses 
And Click add 
And select expense head as monthly expense 
And Enter Expense head details 
And Enter the month 
And Click save 
And Click add in employee expense detail grid 
And Select project 
And Select Expense name 
And Enter expense description 
And Select expense date 
And Select currency 
And Enter amount 
When Click save  
Then Click submit for approval 

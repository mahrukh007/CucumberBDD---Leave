Feature: apply leaves 

Scenario Outline: Login into account with correct validation and apply leaves 

Given User navigates to ESS  
And User enters login credentials 
And User navigates to Leave Managment >> Leave Request
And User clicks ADD button 
And User selects "<leave_type>" 
And User enters "<number_of_days>" 
And User enters "<day> , <month> , <year>" 
And User enters Reason 
And User clicks save button 
When User clicks submit for approval button 
Then Record is submitted 

Examples: 
|leave_type | number_of_days | day  | month   | year |
|    1       |      1	      | 03/  |  05/   | 2019 |
|    2       |		1 	      | 04/  |  06/   | 2019 |
|    3       |      1         |  05/ |  07/   | 2019 |



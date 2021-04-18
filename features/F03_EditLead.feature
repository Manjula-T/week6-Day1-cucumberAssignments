Feature: leaftaps application Edit Lead test cases

Scenario Outline: TC_03_Edit Lead (scenario Outline is implemented)
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on login button
Then Click crmsfa link
And Click on Leads
And Click on Find Leads
Given Click Phone Button
And Enter phone number as <phonenumber>
When Click on Find Leads button
Then Click on first lead from the search result
Given click on Edit Button
And update the company name
When Click on update button

Examples: 

|phonenumber|
|'9'|
|'7'|


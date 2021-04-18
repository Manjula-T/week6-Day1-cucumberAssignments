Feature: leaftaps application Duplicate Lead test case

Scenario: TC_04_Edit Lead
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on login button
Then Click crmsfa link
And Click on Leads
And Click on Find Leads
Given Click Phone Button
And Enter phone number
When Click on Find Leads button
Then Click on first lead from the search result
Given click on Duplicate Button
When Click on Create Lead Button

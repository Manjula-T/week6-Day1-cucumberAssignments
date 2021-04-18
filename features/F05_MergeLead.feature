Feature: leaftaps application Merge Lead test case

Scenario: TC_05_Merge Lead
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on login button
Then Click crmsfa link
And Click on Leads
And Click on Merge Leads
And Click on Find Lead icon
And Go to child1 window
And Enter the first name as 'Manju'
And Click on Find Leads button
And click on the lead ID1
And Go to parent1 window
Given Click on to Lead icon
And Go to child2 window
And Enter the Second name as 'La'
And Click on Find Leads button
And click on the lead ID2
When Go to parent2 window
Then click on Merge button
And accept the alert









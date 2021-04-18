Feature: leaftaps application Create Lead test cases

#@smoke @sanity
Scenario Outline: TC_03_Create Lead (scenario Outline is implemented)
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on login button
Then Get current title
Given Click crmsfa link
And Click on Leads
Given Click Create Lead Button
And Enter company name as <company name>
And Enter Firstname as <Firstname>
And Enter lastname as <lastname>
When click on Create Lead

Examples:
|company name|Firstname|lastname|
|'wipro'|'Manju'|'La'|
|'TCS'|'Manjula'|'T'|
|'Google'|'Manjula'|'Thangavel'|



Feature: test Login feature
This feature includes scenario that validate the following features
1.Login as Admin
2.Login as Linda.anderson
3.Login with negative scenario


Scenario: Login as Admin
Given  Able to navigate onto the login page
When In enter the user name as "Admin"
And I Enter the password as "admin123"
And I Enter the login button
Then I should log in as username "Welcome Fiona"

#Scenario: Login as Linda.anderson
#Given Able to navigate onto the login page
#When In enter the user name as "Linda.anderson"
#And I Enter the password as "Linda.anderson"
#And I Enter the login button
#Then I should log in as username "Welcome Linda"

Scenario: Login as Sarita
Given Able to navigate onto the login page
When In enter the user name as "Sarita"
And I Enter the password as "Sarita"
And I Enter the login button
Then I should see a error message as "Invalid credentials"


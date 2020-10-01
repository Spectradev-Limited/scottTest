Feature: Signin test


@Register
Scenario Outline: Verify user can log in successfully


Given user navigates to HomePage
And user clicks Sign in link
And user should be redirected to RegisterPage
When user enters "<emailID>" and "<password>"
Then verify account creation is successful


Examples:

|  emailID                       |  password    |
|   B4G651346C9B8A3@Test.co.uk   | Password007  |




@Register
Scenario Outline: Verify user can log in successfully


Given user navigates to HomePage
And user clicks Sign in link
And user should be redirected to RegisterPage
And user enters "<emailID>" and "<password>"
And verify account creation is successful
And user clicks womens tab
And user selects and adds a dress




Examples:

|  emailID                       |  password    |
|   B4G651346C9B8A3@Test.co.uk   | Password007  |
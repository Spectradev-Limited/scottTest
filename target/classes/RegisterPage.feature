Feature: Registration Tests

@Register
Scenario: Create an account

Given user navigates to HomePage
And user clicks Sign in link
And user should be redirected to RegisterPage
And user enters new email id
And user clicks submit button
When user fills relevant registration fields
Then verify account creation is successful



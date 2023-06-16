Feature: Login Features
@Scenario#1
Scenario: positive login scenario
Given user is on login page
When user enters name and password
And user clicks on submit button
Then user is on home page
@Scenario#2
Scenario: Add Item to cart
Given Browser is Launched and maximized
When Select Item
And Add Item to Cart
Then Item is Added to Cart


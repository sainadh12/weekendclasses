@tag
Feature: Validate the functionality of Target web features
  Validating all the login functionalities and navigations

  @tagmultiple
  Scenario Outline: To be navigated to Registry page
    Given I have launched "<website>" in browser

  Examples:
  |website|
  |https://www.sony.com/|
  |https://www.apple.com/in/|
  |https://cucumber.io/|
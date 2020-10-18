@tag
Feature: Validate the functionality of Target web features
  Validating all the login functionalities and navigations

  @tagmultiple
  Scenario Outline: To be navigated to Registry page
    Given I have launched "<website>" "<username>" "<password>" in browser

  Examples:
  |website|username|password|
  |https://www.sony.com/|asdf|asdf|
  |https://www.apple.com/in/|asdf|asdf|
  |https://cucumber.io/|asdf|asdf|
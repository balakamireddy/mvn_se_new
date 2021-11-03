Feature: Login Feature
  Scenario: Login with valid username and password

    Given User Navigate to website

    When User enter "standard_user" and "secret_sauce"

    Then User login successfully
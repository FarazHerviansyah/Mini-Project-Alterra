@tag
Feature: Get User Information

  @tag1
  Scenario Outline: User see user information
    Given Get call to https://alta-shop.herokuapp.com/api/auth/info
    When Set body parameter
    Then I receive valid HTTP response code 200

  @tag2
  Scenario Outline: Get Category By ID
    Given Get call to https://alta-shop.herokuapp.com/api/auth/info
    Then I receive invalid HTTP response code 401
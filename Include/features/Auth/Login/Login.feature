@tag
Feature: Login

  @tag1
  Scenario Outline: Login User Valid
    Given Post call to https://alta-shop.herokuapp.com/api/auth/login
    When Set body parameter
    Then I receive valid HTTP response code 200

  @tag2
  Scenario Outline: Login User With Unregist Email
    Given Post call to https://alta-shop.herokuapp.com/api/auth/login
    Then I receive valid HTTP response code 400
    
  @tag3
  Scenario Outline: Login User With Unregist password
    Given Post call to https://alta-shop.herokuapp.com/api/auth/login
    Then I receive valid HTTP response code 400
@tag
Feature: Register

  @tag1
  Scenario Outline: User Create New Account
    Given Post call to https://alta-shop.herokuapp.com/api/auth/register
    When Set body parameter
    Then I receive valid HTTP response code 200
    
  @tag2
  Scenario Outline: User Create New Account With Blank Password
    Given Post call to https://alta-shop.herokuapp.com/api/auth/register
    When Set body parameter
    Then I receive valid HTTP response code 400
    
  @tag3
  Scenario Outline: User Create New Account With Blank Email
    Given Post call to https://alta-shop.herokuapp.com/api/auth/register
    When Set body parameter
    Then I receive valid HTTP response code 400
    
  @tag4
  Scenario Outline: User Create New Account With Invalid Email
    Given Post call to https://alta-shop.herokuapp.com/api/auth/register
    When Set body parameter
    Then I receive valid HTTP response code 200
    
   
@tag
Feature: Product Categories

  @tag1
  Scenario Outline: Create A Category
    Given Post call to https://alta-shop.herokuapp.com/api/categories
    When Set body parameter
    Then I receive valid HTTP response code 200

  @tag2
  Scenario Outline: Get Category By ID
    Given Get call to https://alta-shop.herokuapp.com/api/categories/510
    Then I receive valid HTTP response code 200
    
  @tag3
  Scenario Outline: Get All Categories
    Given Get call to https://alta-shop.herokuapp.com/api/categories
    Then I receive valid HTTP response code 200
   
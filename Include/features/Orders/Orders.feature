@tag
Feature: Orders

  @tag1
  Scenario Outline: Create a New Order
    Given Post call to https://alta-shop.herokuapp.com/api/orders
    When Set body parameter
    Then I receive valid HTTP response code 200
    
  @tag2
  Scenario Outline: Get All Orders
    Given Get call to https://alta-shop.herokuapp.com/api/orders/953
    Then I receive valid HTTP response code 200
    
  @tag3
  Scenario Outline: Get order by ID
    Given Get call to https://alta-shop.herokuapp.com/api/orders/1
    Then I receive valid HTTP response code 200
    
    

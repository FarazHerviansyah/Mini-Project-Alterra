@tag
Feature: products

 	@tag1
  Scenario Outline: Add New Products
    Given Post call to https://alta-shop.herokuapp.com/api/products
    When Set body parameter
    Then I receive valid HTTP response code 200

  @tag2
  Scenario Outline: Add New Products With Blank Price
    Given Post call to https://alta-shop.herokuapp.com/api/products
    Then I receive valid HTTP response code 200
    
  @tag3
  Scenario Outline: Get Products by ID
    Given Get call to https://alta-shop.herokuapp.com/api/products/584
    Then I receive valid HTTP response code 200
    
  @tag4
  Scenario Outline: Negative get Product by ID Using Invalid ID-caller
    Given Get call to https://alta-shop.herokuapp.com/api/products/1
    Then I receive Invalid HTTP response code 404
    
  @tag5
  Scenario Outline: Assign a product rating
    Given Post call to https://alta-shop.herokuapp.com/api/products/582/ratings
    Then I receive valid HTTP response code 200
    
  @tag6
  Scenario Outline: Assign a product rating without login account
    Given Post call to https://alta-shop.herokuapp.com/api/products/510/ratings
    Then I receive Invalid HTTP response code 401
    
  @tag7
  Scenario Outline: User see Product rating
    Given Get call to https://alta-shop.herokuapp.com/api/products/582/ratings
    Then I receive valid HTTP response code 200
    
  @tag8
  Scenario Outline: Create a comment for product
    Given Post call to https://alta-shop.herokuapp.com/api/products/582/comments
    Then I receive valid HTTP response code 200
    
  @tag9
  Scenario Outline: Create a comment for product wihtout login account
    Given Post call to https://alta-shop.herokuapp.com/api/products/510/comments
    Then I receive Invalid HTTP response code 401
    
  @tag10
  Scenario Outline: User see Product comment
    Given Get call to https://alta-shop.herokuapp.com/api/products/510/comments
    Then I receive valid HTTP response code 200
    
  @tag11
  Scenario Outline: User see all product
    Given Get call to https://alta-shop.herokuapp.com/api/products
    Then I receive valid HTTP response code 200
    
  @tag12
  Scenario Outline: User delete a product
    Given Delete call to https://alta-shop.herokuapp.com/api/products/510
    Then I receive valid HTTP response code 200
# language: en
# Source: http://github.com/aslakhellesoy/cucumber/blob/master/examples/i18n/en/features/addition.feature
# Updated: Tue May 25 15:51:43 +0200 2010

@DeliveryPrice
Feature:  StockDeliveryPrice
  In order to determinate the global price of a stock delivery
  As a Seller
  I want to add products with price and name and calculate the sum of products in stock*the price of product

  Scenario Outline: Alimentation
    Given a new quantity of products in stock delivery <input_1>
    And I have entered the price of product <input_2> 
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1 | input_2 | button  | output |
      | 20      | 3       | stockPrice | 60  |
      | 10      | 5       | stockPrice | 50  |


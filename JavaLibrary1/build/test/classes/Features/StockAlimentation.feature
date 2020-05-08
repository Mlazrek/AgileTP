# language: en
# Source: http://github.com/aslakhellesoy/cucumber/blob/master/examples/i18n/en/features/addition.feature
# Updated: Tue May 25 15:51:43 +0200 2010

@Alimentation
Feature:  StockAlimentation
  In order to avoid an out of stock products
  As a stock manager
  I want to add a new quantity of products to the current quantity

  Scenario Outline: Alimentation
    Given a quantity of stock product <input_1>
    And I have entered <input_2> the stock
    When I press <button>
    Then the result should be <output> on the screen

    Examples: 
      | input_1 | input_2 | button | output |
      | 20      | 30      | add    | 50     |
      | 2       | 5       | add    | 7      |
      | 0       | 40      | add    | 40     |

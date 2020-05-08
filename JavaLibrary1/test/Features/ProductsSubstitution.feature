# language: en
# Source: http://github.com/aslakhellesoy/cucumber/blob/master/examples/i18n/en/features/addition.feature
# Updated: Tue May 25 15:51:43 +0200 2010
@Substitution
Feature: ProductsSubstitution
   En tant que Vendeur
   Je veux en substituer par un produit de la même catérogie
   Afin de substituer un produit par un autre de la même catégorie en cas de besoin

  Scenario Outline: Substutition de deux produits
    Given deux produits du stock
    And j'entre <produit_substitue> pour le premier produit
    And j'entre <produit_substituable> pour le deuxieme produit
    When je teste "isSubstituable()" sur le produit1 par le produit2
    Then le resultat affiche doit être <output>

    Examples: 
      | produit_substitue | produit_substituable |output|
      | prod1 | prod2 |true |
      | prod3 | prod4 |false|


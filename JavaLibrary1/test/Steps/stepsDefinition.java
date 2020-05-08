/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 *
 * @author hp
 */

public class stepsDefinition {
    
    @Given("^deux produits du stock$")
public void deux_produits_du_stock() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^j'entre prod(\\d+) pour le premier produit$")
public void j_entre_prod_pour_le_premier_produit(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^j'entre prod(\\d+) pour le deuxieme produit$")
public void j_entre_prod_pour_le_deuxieme_produit(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // System.out.format("product2: %n\n", arg1);
    throw new PendingException();
}

@When("^je teste \"([^\"]*)\" sur le produit(\\d+) par le produit(\\d+)$")
public void je_teste_sur_le_produit_par_le_produit(String arg1, int arg2, int arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le resultat affiche doit être true$")
public void le_resultat_affiche_doit_être_true() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^le resultat affiche doit être false$")
public void le_resultat_affiche_doit_être_false() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^a quantity of stock product (\\d+)$")
public void a_quantity_of_stock_product(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I have entered (\\d+) the stock$")
public void i_have_entered_the_stock(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I press add$")
public void i_press_add() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^the result should be (\\d+) on the screen$")
public void the_result_should_be_on_the_screen(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^a new quantity of products in stock delivery (\\d+)$")
public void a_new_quantity_of_products_in_stock_delivery(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I have entered the price of product (\\d+)$")
public void i_have_entered_the_price_of_product(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I press stockPrice$")
public void i_press_stockPrice() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}


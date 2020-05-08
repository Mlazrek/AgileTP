package testRunners;

import .*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Product { 
    
    private int id;
    private String name;
    private int price;
    private String category; 
    public Product(String name,String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public Product() {
 
}
    public Integer getId() {
        return id;
}
    public void setId(int id) {
      this.id = id;
}
    public String getName() {
        return name;
}
    public void setName(String name) {
        this.name = name;
}
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
}
    public String getCategory() {
        return category;
}
    public void setCategory(String category) {
        this.category = category;
}
    
      public boolean isSubstituable(Product product1)
    {
        // Insérez votre code ici
        if ((this.getCategory()).equals(product1.getCategory())) {
            return true;
        } 
        return false;
    }
}
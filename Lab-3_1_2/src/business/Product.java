/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author Abhi
 */
public class Product {
    
    private String productName;
    private double price;
    private int availnumber;
    private String description;
    private Date createdon;
    
    public Product(){
        
        this.createdon= new Date();
           
    }
    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailnumber() {
        return availnumber;
    }

    public void setAvailnumber(int availnumber) {
        this.availnumber = availnumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedon() {
        return createdon;
    }
    
    @Override
    public String toString() {
        return this.getProductName(); //To change body of generated methods, choose Tools | Templates.
    }
    
       
}
    


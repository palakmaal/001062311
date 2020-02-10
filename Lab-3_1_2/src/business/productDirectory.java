/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import sun.management.counter.AbstractCounter;



/**
 *
 * @author Abhi
 */
public class productDirectory {
    
    private ArrayList <Product> productList;

    public productDirectory() {
        this.productList =new ArrayList<Product>();
        
    }
    
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct(){
        
        Product product = new Product();
        productList.add(product);
        return product;
        
    }
    
    public void deleteProduct(Product product){
        productList.remove(product);
        
    }
    
    public Product searchProduct(String productName){
        for(Product product:productList){
            if(product.getProductName().equals(productName)){
                return product;
            }
        }
        return null;
        
    }

    public Iterable<Product> getproductDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

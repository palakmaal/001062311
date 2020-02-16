/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{

    String CreatedDate ;
    public Customer(String password, String userName, String role) {
        super(password, userName, role);
    }
     @Override
    public int compareTo(Customer o) {
       return o.getUserName().compareTo(this.getUserName());
    }
   

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
   
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
   
    public boolean confirmedPassword(String password1, String password2){
        if(password1.equals(password2))
            return true;
        return false;
    }
   
   
}


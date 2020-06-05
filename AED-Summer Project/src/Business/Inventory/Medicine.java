/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

/**
 *
 * @author maalp
 */
public class Medicine {
    String medicineName;
    int quantity;

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Medicine()
    {
    }
    
    public Medicine(String name, int quantity){
         this.medicineName = name;
         this.quantity = quantity;
     }
    @Override
    public String toString()
    {
        return medicineName;
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author maalp
 */
public class BloodDirectory {
     private ArrayList<Blood> bloodDirectory;
    
    public BloodDirectory()
    {
        bloodDirectory = new ArrayList<>();
    }

    public ArrayList<Blood> getBloodDirectory() {
        return bloodDirectory;
    }
    
    public Blood addBlood()
   {
     Blood blood = new Blood();
     bloodDirectory.add(blood);
     return blood;
   }
   
}

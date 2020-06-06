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
public class RedCross_BloodDirectory {
     private ArrayList<RedCross_Blood> bloodDirectory;
    
    public RedCross_BloodDirectory()
    {
        bloodDirectory = new ArrayList<>();
    }

    public ArrayList<RedCross_Blood> getBloodDirectory() {
        return bloodDirectory;
    }
    
    public RedCross_Blood addBlood()
   {
     RedCross_Blood blood = new RedCross_Blood();
     bloodDirectory.add(blood);
     return blood;
   }
   
}

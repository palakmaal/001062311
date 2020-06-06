/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Inventory.RedCross_Blood;
import Business.Inventory.RedCross_BloodDirectory;
import Business.Role.DoctorAssistantRole;
import Business.Role.Role;

/**
 *
 * @author maalp
 */
public class DoctorAssistantOrganization extends Organization{
    RedCross_BloodDirectory bloodDirectory;
    
        public DoctorAssistantOrganization() {
        super(Organization.Type.DoctorAssistant.getValue());
        bloodDirectory = new RedCross_BloodDirectory();
        bloodList();
        }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorAssistantRole());
        return roles;
    }
    @Override
    public String getType() {
    return "DoctorAssistant Organization";
    }

    public RedCross_BloodDirectory getBloodDirectory() {
        return bloodDirectory;
    }
    
    private void bloodList()
    {
        RedCross_Blood blood1 = bloodDirectory.addBlood();
        blood1.setType("A+");
        blood1.setQuantity(10);
        
        
        RedCross_Blood blood2 = bloodDirectory.addBlood();
        blood2.setType("A-");
        blood2.setQuantity(5);
        
        RedCross_Blood blood3 = bloodDirectory.addBlood();
        blood3.setType("B+");
        blood3.setQuantity(10);
        
        RedCross_Blood blood4 = bloodDirectory.addBlood();
        blood4.setType("B-");
        blood4.setQuantity(5);
        
        RedCross_Blood blood5 = bloodDirectory.addBlood();
        blood5.setType("AB+");
        blood5.setQuantity(8);
        
        RedCross_Blood blood6 = bloodDirectory.addBlood();
        blood6.setType("AB-");
        blood6.setQuantity(3);
        
        RedCross_Blood blood7 = bloodDirectory.addBlood();
        blood7.setType("O+");
        blood7.setQuantity(5);
        
        RedCross_Blood blood8 = bloodDirectory.addBlood();
        blood8.setType("O-");
        blood8.setQuantity(2);
    } 
}

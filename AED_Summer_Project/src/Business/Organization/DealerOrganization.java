/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SupplierRole;

/**
 *
 * @author maalp
 */
public class DealerOrganization extends Organization{
   public DealerOrganization() {
        super(Organization.Type.Dealer.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }

    @Override
    public String getType() {
    return "Dealer Organization";
    }
     
}

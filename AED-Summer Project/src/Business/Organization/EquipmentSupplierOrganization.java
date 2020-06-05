/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.EquipmentSupplierRole;
import Business.Role.Role;

/**
 *
 * @author maalp
 */
public class EquipmentSupplierOrganization extends Organization {
     public EquipmentSupplierOrganization() {
        super(Organization.Type.EquipmentSupplier.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EquipmentSupplierRole());
        return roles;
    }

    @Override
    public String getType() {
    return "Equipment Organization";
    }
    
}

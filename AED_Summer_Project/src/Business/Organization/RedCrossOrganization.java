/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.RedCrossDealerRole;
import Business.Role.Role;

/**
 *
 * @author maalp
 */
public class RedCrossOrganization extends Organization {
    public RedCrossOrganization() {
        super(Organization.Type.RedCrossDealer.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RedCrossDealerRole());
        return roles;
    }

    @Override
    public String getType() {
    return "RedCross Organization";
    } 
}

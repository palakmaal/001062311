/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.LabAssistentRole;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author maalp
 */
public class LabOrganization extends Organization {
   public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistentRole());
        return roles;
    }

    @Override
    public String getType() {
    return "Lab Organization";
    } 
}

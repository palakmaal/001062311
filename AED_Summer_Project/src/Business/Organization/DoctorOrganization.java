/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.DoctorRole;
import Business.Role.Role;

/**
 *
 * @author maalp
 */
public class DoctorOrganization extends Organization {
  public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }

    @Override
    public String getType() {
    return "Doctor Organization";
    }   
}

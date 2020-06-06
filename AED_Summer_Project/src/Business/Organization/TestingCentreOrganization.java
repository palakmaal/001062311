/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.TestingCentreAssistantRole;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author maalp
 */
public class TestingCentreOrganization extends Organization {
   public TestingCentreOrganization() {
        super(Organization.Type.Testing_Centre.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TestingCentreAssistantRole());
        return roles;
    }

    @Override
    public String getType() {
    return "Testing Centre Organization";
    } 
}

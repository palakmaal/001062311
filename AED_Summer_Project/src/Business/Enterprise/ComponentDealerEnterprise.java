/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Role.Role;


/**
 *
 * @author maalp
 */
public class ComponentDealerEnterprise extends Enterprise {
 public ComponentDealerEnterprise(String name)
    {
        super(name, EnterpriseType.COMPONENT_DEALERS);
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }   
}
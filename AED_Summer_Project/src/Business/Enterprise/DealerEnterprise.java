/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;

/**
 *
 * @author maalp
 */
public class DealerEnterprise extends Enterprise {
     public DealerEnterprise(String name)
    {
        super(name, EnterpriseType.DEALER);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

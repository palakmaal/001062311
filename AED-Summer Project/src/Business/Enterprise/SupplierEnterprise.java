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
public class SupplierEnterprise extends Enterprise {
     public SupplierEnterprise(String name)
    {
        super(name, EnterpriseType.SUPPLIER);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.DeliveryManRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author maalp
 */
public class MedicineDeliveryOrganization extends Organization{
     public MedicineDeliveryOrganization() {
        super(Organization.Type.DeliveryMan.getValue());
    }

 @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManRole());
        return roles;
    }

    @Override
    public String getType() {
    return "MedicineDelivery Organization";
    }
}
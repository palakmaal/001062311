/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EquipmentSupplierOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EquipmentSupplier.EquipmentSupplierWorkSpaceOld;

/**
 *
 * @author maalp
 */
public class EquipmentSupplierRole extends Role {
  @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem Business, Network network) 
    {
        return new EquipmentSupplierWorkSpaceOld(container, userAccount,(EquipmentSupplierOrganization) organization, enterprise, network);
    
    }   
}

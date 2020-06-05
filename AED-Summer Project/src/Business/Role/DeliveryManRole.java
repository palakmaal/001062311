/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.MedicineDeliveryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DeliveryManWorkSpace.DeliveryManWorkSpaceOld;
import javax.swing.JPanel;

/**
 *
 * @author maalp
 */
public class DeliveryManRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
       return new DeliveryManWorkSpaceOld(userProcessContainer, account,(MedicineDeliveryOrganization)organization, system, network);
    
   } 
    
}

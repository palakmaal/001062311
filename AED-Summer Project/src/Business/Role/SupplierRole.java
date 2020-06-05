/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;
import Business.Organization.SupplierOrganization;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.MedicineSupplier.MedicineSupplierWorkSpaceOld;
/**
 *
 * @author maalp
 */
public class SupplierRole extends Role{
  @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, Network network) 
    {
        return new MedicineSupplierWorkSpaceOld(container, userAccount, (SupplierOrganization) organization, enterprise, network);
    }  
}

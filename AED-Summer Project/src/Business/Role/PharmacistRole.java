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
import Business.Organization.Organization;
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.Pharmacist.PharmacistHomeOld;

/**
 *
 * @author maalp
 */
public class PharmacistRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) 
    {
        return new PharmacistHomeOld(container, account, (PharmacistOrganization)organization, enterprise, network);
    
    }
}

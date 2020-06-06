/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.RedCrossOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.RedCrossDealer.RedCrossDealerWorkArea;
/**
 *
 * @author maalp
 */
public class RedCrossDealerRole extends Role {
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, Network network) 
    {
        return new RedCrossDealerWorkArea(container, userAccount,(RedCrossOrganization) organization, enterprise, network);
    
    }
    
}

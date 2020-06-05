/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrationWorkArea.AdminWorkAreaJPanel;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import javax.swing.JPanel;

/**
 *
 * @author maalp
 */
public class AdminRole extends Role {
  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, (AdminOrganization)organization, enterprise, system, network);
    }

       
}

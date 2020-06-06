/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author monal
 */
public abstract class Role {
    public enum RoleType{
        ADMIN("Admin"),
        DOCTOR("Doctor"),
        TestingCentreAssistant("Testing Centre Assistant"),
        DoctorAssistant("Doctor Assistant"),
        RECEPTIONIST("Receptionist"),
        MedicalAssistant("Medical Assistant"),
        DEALER("Medical Centre"),
        COMPONENT_DEALER("Component Dealer"),
        REDCROSS_DEALER("RedCross Dealer");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Network network);

    @Override
    public String toString() {
         
        return this.getClass().getSimpleName();
          
    }
    
    
}
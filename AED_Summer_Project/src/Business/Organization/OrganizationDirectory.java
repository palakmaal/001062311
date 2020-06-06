/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Organization.Organization.Type;
import java.awt.Window;

/**
 *
 * @author maalp
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Testing_Centre.getValue())){
            organization = new TestingCentreOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Dealer.getValue())){
            organization = new DealerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ComponentDealer.getValue())){
            organization = new ComponentDealerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DoctorAssistant.getValue())){
            organization = new DoctorAssistantOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.MedicalAssistant.getValue())){
            organization = new MedicalAssistantOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RedCrossDealer.getValue())){
            organization = new RedCrossOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public void createOrganization(Window.Type type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

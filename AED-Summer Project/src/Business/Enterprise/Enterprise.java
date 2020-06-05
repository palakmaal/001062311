/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author maalp
 */
public abstract class Enterprise extends Organization {
    public Enterprise(String name, EnterpriseType enterpriseType)
    {
        super(name);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
    }
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType{
        NGO("NGO"),
        EQUIPMENT_SUPPLIERS("EquipmentSuppliers"),
        BLOOD_BANK("BloodBank"),
        SUPPLIER("Medicine Supplier");
        
        
        private EnterpriseType(String value)
        {
            this.value = value;
        }
        
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        
        @Override 
        public String toString()
        {
            return value;
        }
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
     
}

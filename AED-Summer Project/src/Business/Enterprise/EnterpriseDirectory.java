/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Enterprise.Enterprise.EnterpriseType;
/**
 *
 * @author maalp
 */
public class EnterpriseDirectory {
     private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList();
    }
    
    public Enterprise createAndAddEnterprise(String name, EnterpriseType type)
    //Create Enterprise
    {
       Enterprise enterprise = null;
       if(null != type)
        switch (type) {
            case NGO:
                enterprise = new NGOEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case EQUIPMENT_SUPPLIERS:
                enterprise = new EquipmentSupplierEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case SUPPLIER:
                enterprise = new SupplierEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case BLOOD_BANK:
                enterprise = new BloodBankEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
       return enterprise;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author maalp
 */
public class ConfigureSystem {
   public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
            
        Employee employee = system.getEmployeeDirectory().createEmployee("MSP", 1);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("a", "a", employee, new SystemAdminRole());
        
        return system;
    }  
}

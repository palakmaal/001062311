/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Employee.EmployeeDirectory;
import Business.Inventory.RedCross_Blood;
import Business.Inventory.RedCross_BloodDirectory;
import Business.Recipient.RecipientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.DoctorScheduleDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author maalp
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private RecipientDirectory patientDirectory;
    private DoctorScheduleDirectory scheduleDirectory;
    private int organizationID;
    private static int counter;
    private String type;
    
    public enum Type{
        Admin("Admin Organization"), 
        Doctor("Doctor Organization"), 
        Testing_Centre("Testing Centre Organization"),
        Dealer("Medical Organization"),
        ComponentDealer("ComponentDealer Organization"),
        DoctorAssistant("DoctorAssistant Organization"),
        Receptionist("Receptionist Organization"),
        MedicalAssistant("Medical Assistant Organization"),
        RedCrossDealer("RedCross Organization");
   
        
    
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new RecipientDirectory();
        scheduleDirectory = new DoctorScheduleDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    public String getType()
    {
        return null;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public RecipientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public DoctorScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }
    
}

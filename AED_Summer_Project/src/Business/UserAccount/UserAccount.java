/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import Business.Employee.Employee;
import Business.Inventory.Medicine;
import Business.Inventory.MedicineDirectory;
import Business.Role.Role;
import Business.WorkQueue.DoctorScheduleDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author maalp
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private DoctorScheduleDirectory scheduleDirectory;
    private MedicineDirectory medicineDirectory;
    private String phonenumber;


    public UserAccount() {
        workQueue = new WorkQueue();
        scheduleDirectory = new DoctorScheduleDirectory();
        medicineDirectory = new MedicineDirectory();
        medicineList();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPhoneNumber(){
        return phonenumber;
    }
    
    public void setPhoneNumber(){
        this.phonenumber = phonenumber;
     
    }
 
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public DoctorScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }
    
    @Override
    public String toString() {
        return username;
    } 
    
    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }
   private void medicineList()
   {
       Medicine medicine= medicineDirectory.add();
        medicine.setMedicineName("Advil");
        medicine.setQuantity(100);
        
        Medicine medicine1=medicineDirectory.add();
        medicine1.setMedicineName("Crocin");
        medicine1.setQuantity(100);
        
        Medicine medicine2=medicineDirectory.add();
        medicine2.setMedicineName("Syringes");
        medicine2.setQuantity(100);
        
        Medicine medicine3=medicineDirectory.add();
        medicine3.setMedicineName("Dolo 650");
        medicine3.setQuantity(100);
        
        Medicine medicine4=medicineDirectory.add();
        medicine4.setMedicineName("Cetrizine");
        medicine4.setQuantity(100);
        
        Medicine medicine5=medicineDirectory.add();
        medicine5.setMedicineName("Combiflam");
        medicine5.setQuantity(100);
        
        Medicine medicine6=medicineDirectory.add();
        medicine6.setMedicineName("Glucose Bottles");
        medicine6.setQuantity(100);
        
        Medicine medicine7=medicineDirectory.add();
        medicine7.setMedicineName("Paracetamol");
        medicine7.setQuantity(100);
        
        Medicine medicine8=medicineDirectory.add();
        medicine8.setMedicineName("Bandages");
        medicine8.setQuantity(100);
        
        Medicine medicine9=medicineDirectory.add();
        medicine9.setMedicineName("Avomine");
        medicine9.setQuantity(100);
        
        Medicine medicine10=medicineDirectory.add();
        medicine10.setMedicineName("Antiseptic Liquid");
        medicine10.setQuantity(100);
   }  
}

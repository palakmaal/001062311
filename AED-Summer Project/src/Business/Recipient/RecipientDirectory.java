/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Recipient;

import java.util.ArrayList;

/**
 *
 * @author maalp
 */
public class RecipientDirectory {
     private ArrayList<Recipient> patientList;
    
    public RecipientDirectory()
    {
        this.patientList = new ArrayList<>();
    }

    public ArrayList<Recipient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Recipient> patientList) {
        this.patientList = patientList;
    }
    
    public Recipient addPatient()
    {
        Recipient patient = new Recipient();
        patientList.add(patient);
        return patient;
    }
    
    public void deletePatient(Recipient patient)
    {
        patientList.remove(patient);
    }
}

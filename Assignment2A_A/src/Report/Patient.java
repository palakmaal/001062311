/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;
import java.util.Scanner;

/**
 *
 * @author maalp
 */

public class Patient {
    static Scanner input=new Scanner(System.in );
    int age;
    String name;
    static Patient test=new Patient();
    
     public static void main(String[]args){
        System.out.println("Enter Patient's Name");
        test.name=input.nextLine();
        System.out.println("Enter "+test.name+"'s age(in months)");
        test.age=input.nextInt();
        VitalSigns v=new VitalSigns();
        boolean result=v.readinputs(test);
        isPatientNormal(result);
        
     }
    static void isPatientNormal(boolean trueflse){
        
        System.out.println(trueflse);
        if (trueflse==true){
        System.out.println("Patient is Normal");
    }
        else{
                System.out.println("Patient is Abnormal");
                }
        
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import Business.VitalSigns;
import java.util.Scanner;
/**
 *
 * @author maalp
 */

public class Patient 
{
   static VitalSigns p1=new VitalSigns();
    static Scanner sc=new Scanner(System.in );
    static String name;
   static int age;
   public static void main(String[]args){
   System.out.println("Enter Patient's Name");
   name=sc.nextLine();
   System.out.println("Enter Patient's Age");
   age=sc.nextInt();
   System.out.println("Enter respiraton rate");
   p1.setRr(sc.nextInt());
   System.out.println("Enter  heart rate");
   p1.setHr(sc.nextInt());
   System.out.println("Enter  Blood Pressure");
   p1.setBp(sc.nextInt());
   System.out.println("Enter  weight in pounds");
   p1.setWt(sc.nextInt());
   while(true){
   System.out.println("1- history");
   System.out.println("2- Update");
   System.out.println("3- check vital sign");
   System.out.println("4- for exit");
    int c;
    c=sc.nextInt();
    if(c==4)
    {
        break;
    }
    else if(c==1)
    {
        display();
   
    }
     else if(c==2){
        multipleentries();
    }
    
    else if(c==3)
    {
        ispatientnormal();
   
    }
   }
   System.out.println("Enter Patient's Age");
   age=sc.nextInt();
   System.out.println("Enter the Number for Vital Sign you want to search, from the below list\n 1-> Respiratory Rate\n 2->Heart Rate\n 3-> Blood Pressure\n 4-> Weight\n" );
   int V;
   V=sc.nextInt();
   if(V==1)
   {
     checkingvitalsign_age_rr();  
   }
   else if(V==2)
   {
   checkingvitalsign_age_hr();
   }
   else if(V==3)
   {
   checkingvitalsign_age_bp();
   }
   else if(V==4)
   {
   checkingvitalsign_age_wt();
   }

   }    
   static void display(){
    System.out.println(p1.getRr());
    System.out.println(p1.getHr());
    System.out.println(p1.getBp());
    System.out.println(p1.getWt());
    
    
    }
    static void multipleentries(){
   System.out.println("Enter respiraton rate");
   p1.setRr(sc.nextInt());
   System.out.println("Enter  heart rate");
   p1.setHr(sc.nextInt());
   System.out.println("Enter  Blood Pressure");
   p1.setBp(sc.nextInt());
   System.out.println("Enter  weight in pounds");
   p1.setWt(sc.nextInt());
        
        
 }
    
   static void ispatientnormal(){
     
       if (age==0)
            {
               if ((p1.rr>=30 &&p1.rr<=50) && (p1.hr>=120 && p1.hr<=160)&& (p1.bp>=50 && p1.bp<=70)&& (p1.wt>=4 && p1.wt<=7))
               {
                   System.out.println("Normal");
               } 
               else{
                       System.out.println("Abnormal");
                       }
            }
            else if (age<12)
            {
              if ((p1.rr>=20 &&p1.rr<=30) && (p1.hr>=80 && p1.hr<=140)&& (p1.bp>=70 && p1.bp<=100) && (p1.wt>=4 && p1.wt<=7))
              {
              System.out.println("Normal");
              }
              else{
              System.out.println("Abnormal");
              }
              
            }
            else if (age<36)
            {
              if ((p1.rr>=20 &&p1.rr<=30) && (p1.hr>=80 && p1.hr<=130)&& (p1.bp>=80 && p1.bp<=110)  && (p1.wt>22 && p1.wt<=31))  
              {
                  System.out.println("Normal");
              }
              else{
              System.out.println("Abnormal");
              }
            }
              
            else if (age<60)
            {
              if((p1.rr>=20 &&p1.rr<=30) && (p1.hr>=80 && p1.hr<=120)&& (p1.bp>=80 && p1.bp<=110)  && (p1.wt>31 && p1.wt<=40))
              {
                  System.out.println("Normal");
              }
              
               else{
              System.out.println("Abnormal");
              }
              
            }
            
            else if(age<144)
            {
              
               if((p1.rr>=20 && p1.rr<=30) && (p1.hr>=70 && p1.hr<=110)&& (p1.bp>=80 && p1.bp<=120)  && (p1.wt>41 && p1.wt<=92))
                       
                 {
                  System.out.println("Normal");
              }
              
               else{
              System.out.println("Abnormal");
              }       
                       
            }
        
   } 
    
   static void checkingvitalsign_age_rr(){
   if(age==0){
        if((p1.rr>=30 && p1.rr<=50))
        {
                System.out.println("Normal respiratory rate");
   }
        else
        {
            System.out.println("Abnormal Respiratory rate");
        }
   }
   
   else if(age<12)
   {
       if((p1.rr>=20 &&p1.rr<=30))
       {
       System.out.println("Normal respiratory rate");
       }
       else
       System.out.println("Abnormal Respiratory rate");
       
   }
    else if(age<36)
    {
    if((p1.rr>=20 &&p1.rr<=30))
       {
       System.out.println("Normal respiratory rate");
       }
       else
       System.out.println("Abnormal Respiratory rate");
       
    }
    else if(age<60)
    {
    if((p1.rr>=20 &&p1.rr<=30))
       {
       System.out.println("Normal respiratory rate");
       }
    else{
       System.out.println("Abnormal Respiratory rate");
       
    }
    }
   else if(age<144)
    {
    if((p1.rr>=20 &&p1.rr<=30))
       {
       System.out.println("Normal respiratory rate");
       }
    else{
       System.out.println("Abnormal Respiratory rate");
       
    }
    }
   }
   static void checkingvitalsign_age_hr(){
   if(age==0){
        if((p1.hr>=120 && p1.hr<=160))
        {
                System.out.println("Normal heart rate");
   }
        else
        {
            System.out.println("Abnormal heart rate");
        }
   }
   
   else if(age<12)
   {
       if((p1.hr>=80 &&p1.hr<=140))
       {
       System.out.println("Normal heart rate");
       }
       else
       System.out.println("Abnormal heart rate");
       
   }
    else if(age<36)
    {
    if((p1.hr>=80 &&p1.hr<=130))
       {
       System.out.println("Normal heart rate");
       }
       else
       System.out.println("Abnormal heart rate");
       
    }
    else if(age<60)
    {
    if((p1.hr>=80 &&p1.hr<=120))
       {
       System.out.println("Normal heart rate");
       }
    else{
       System.out.println("Abnormal heart rate");
       
    }
   }
   else if(age<144)
    {
    if((p1.hr>=70 &&p1.hr<=110))
       {
       System.out.println("Normal heart rate");
       }
    else{
       System.out.println("Abnormal heart rate");
       
    }
    }
   }
   static void checkingvitalsign_age_bp(){
   if(age==0){
        if((p1.bp>=50 && p1.bp<=70))
        {
                System.out.println("Normal blood Pressure");
   }
        else
        {
            System.out.println("Abnormal blood Pressure");
        }
   }
   
   else if(age<12)
   {
       if((p1.bp>=70 &&p1.bp<=100))
       {
       System.out.println("Normal blood Pressure");
       }
       else
       System.out.println("Abnormal blood Pressure");
       
   }
    else if(age<36)
    {
    if((p1.bp>=80 &&p1.bp<=110))
       {
       System.out.println("Normal blood Pressure");
       }
       else
       System.out.println("Abnormal blood Pressure");
       
    }
    else if(age<60)
    {
    if((p1.bp>=80 &&p1.bp<=110))
       {
       System.out.println("Normal blood Pressure");
       }
    else{
       System.out.println("Abnormal blood Pressure");
       
    }
   }
   else if(age<144)
    {
    if((p1.bp>=80 &&p1.bp<=120))
       {
       System.out.println("Normal blood Pressure");
       }
    else{
       System.out.println("Abnormal blood Pressure");
       
    }
    }
   }
   static void checkingvitalsign_age_wt(){
   if(age==0){
        if((p1.wt>=4 && p1.wt<=7))
        {
                System.out.println("Normal weight");
   }
        else
        {
            System.out.println("Abnormal blood weight");
        }
   }
   
   else if(age<12)
   {
       if((p1.wt>=4 &&p1.wt<=7))
       {
       System.out.println("Normal weight");
       }
       else
       System.out.println("Abnormal weight");
       
   }
    else if(age<36)
    {
    if((p1.wt>=22 &&p1.wt<=31))
       {
       System.out.println("Normal weight");
       }
       else
       System.out.println("Abnormal weight");
       
    }
    else if(age<60)
    {
    if((p1.wt>=31 &&p1.wt<=40))
       {
       System.out.println("Normal weight");
       }
    else{
       System.out.println("Abnormal weight");
       
    }
   }
   else if(age<144)
    {
    if((p1.bp>=41 &&p1.bp<=92))
       {
       System.out.println("Normal weight");
       }
    else{
       System.out.println("Abnormal weight");
       
    }
    }
   
   }
   
   
   
   
    }

    

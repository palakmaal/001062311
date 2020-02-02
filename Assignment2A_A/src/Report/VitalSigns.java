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
public class VitalSigns {
    int rr;
    int hr;
    int bp;
    double wt;
    static Scanner input=new Scanner(System.in );
    public Boolean readinputs(Patient test){
        
            System.out.println("Enter "+test.name+ "'s respiraton rate");
            rr=input.nextInt();
            System.out.println("Enter "+test.name+ "'s heart rate");
            hr=input.nextInt();
            System.out.println("Enter "+test.name+ "'s blood pressure");
            bp=input.nextInt();
            System.out.println("Enter "+test.name+ "'s weight in pounds");
            wt=input.nextDouble();
            
            if (test.age==0)
            {
                boolean  result=newborn();
                return result;
              }
            else if (test.age<12)
            {
              boolean  result=infant();
              return result;  
                
            }
            else if (test.age<36)
            {
              boolean  result=toddler();
              return result;  
            }
            else if (test.age<60)
            {
              boolean  result=preschooler();
              return result;  
                
            }
            else if (test.age<144)
            {
              boolean  result=school();
              return result;  
            }
            else{
             
             boolean result=adolescent();
             return result;
            }
    }

    
    public boolean newborn()
    {
        return ( (rr>=30 &&rr<=50) && (hr>=120 && hr<=160)&& (bp>=50 && bp<=70)&& (wt>=4.55 && wt<=7));
}
  public boolean infant()
    {
        return ( (rr>=20 &&rr<=30) && (hr>=80 && hr<=140)&& (bp>=70 && bp<=100) && (wt>=4 && wt<=7));
}  
 public boolean toddler()
    {
        return ( (rr>=20 &&rr<=30) && (hr>=80 && hr<=130)&& (bp>=80 && bp<=110)  && (wt>22 && wt<=31));
}  
 public boolean preschooler()
    {
        return ( (rr>=20 &&rr<=30) && (hr>=80 && hr<=120)&& (bp>=80 && bp<=110)  && (wt>31 && wt<=40));
}  
 
 public boolean school()
    {
        return ( (rr>=20 &&rr<=30) && (hr>=70 && hr<=110)&& (bp>=80 && bp<=120)  && (wt>41 && wt<=92));
}
 public boolean adolescent()
    {
        return ( (rr>=12 &&rr<=20) && (hr>=55 && hr<=105)&& (bp>=110 && bp<=120)  && (wt>50));
}
 
}


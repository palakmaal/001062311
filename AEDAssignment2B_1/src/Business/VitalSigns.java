/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import java.util.Scanner;
import Business.Patient;


/**
 *
 * @author maalp
 */
public class VitalSigns {
    int rr;
    int hr;
    int bp;
    int wt;
    ArrayList<Integer>rrlist = new ArrayList<>();
    ArrayList<Integer>hrlist = new ArrayList<>();
    ArrayList<Integer> bplist = new ArrayList<>();
    ArrayList<Integer> wtlist = new ArrayList<>();
    static VitalSigns vs=new VitalSigns();
    

    public static VitalSigns getVs() {
        return vs;
    }

    public static void setVs(VitalSigns vs) {
        VitalSigns.vs = vs;
    }

    public int getRr() {
        return rr;
    }

    public void setRr(int rr) {
       hrlist.add(hr);
        this.rr = rr;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        hrlist.add(hr);
        this.hr = hr;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        bplist.add(bp);
        this.bp = bp;
    }

    public int getWt() {
       
        return wt;
    }

    public void setWt(int wt) {
        wtlist.add(wt);
        this.wt = wt;
    }
    
    
}


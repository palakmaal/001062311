/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author maalp
 */
public class DoctorScheduleDirectory {
    private ArrayList<DoctorSchedule> scheduleList;
    
    public DoctorScheduleDirectory()
    {
        scheduleList = new ArrayList<DoctorSchedule>();
    }

    public ArrayList<DoctorSchedule> getScheduleList() {
        return scheduleList;
    }
    
    public DoctorSchedule add()
    {
        DoctorSchedule s = new DoctorSchedule();
        scheduleList.add(s);
        return s;
    }
    
    public void cancelSchedule(DoctorSchedule schedule)
    {
        scheduleList.remove(schedule);
    }
}

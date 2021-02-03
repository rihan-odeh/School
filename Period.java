/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;
import java.time.LocalTime;
/**
 *
 * @author ro1
 */
public class Period {
    private Day day; 
    private Time time; 
    
    public Period(Day day, Time time){
        this.day = day; 
        this.time= time;
    }

    public Day getDay() {
        return day;
    }

    public Time getTime() {
        return time;
    }
    public String toString(){
        return this.day +" from: "+ this.time.startTimeOfEachClass(this)+ " to " + this.time.endTimeOfEachClass(time);
    }
    
    enum Day{
        Saturday , 
        Sunday ,
        Monday , 
        Tuesday , 
        Wednesday , 
        
        
    }
    enum Time{
    
     first ,
     Second ,
     Third ,
     Break,
     Forth , 
     Fifth, 
     Sixth;
       
     public LocalTime endTimeOfEachClass(Time time){
         return  (LocalTime.of(8,45).plusMinutes((time.ordinal())*45));
     }
       public LocalTime startTimeOfEachClass(Period period){
        
        return  (LocalTime.of(8,0).plusMinutes((period.time.ordinal())*45));
       }
     /* public String DateAndTime(Period period){
           return getDay() +" from " + StartTimeOfEachClass(period.time) +" to " + EndTimeOfEachClass(period.time);
       }*/
    }
    
     
}

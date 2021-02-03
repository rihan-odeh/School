/*i
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;
import java.time.Duration;
import java.util.Date;
import java.time.LocalTime;

/**
 *
 * @author ro1 driving class to check all methods of each class
 */
  
public class SchoolModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     
     
        Date  d = new Date (96,10,9);
        Student s = new Student(1254, "R", "O", d, Gender.Female);
        Student s1 = new Student(1254, "Ree", "O", d, Gender.Male);
        Student p = new Student(21452145, "Rihan" , "Odeh" , d, Gender.Female);
        Admin a = new Admin();
        Instructor i = new Instructor(1254, "Instructor", "a", d, Gender.NotKnown);
        Book b = new Book(12321, "AAAA" , "dkmls", 154, 2001 );
       Period period = new Period(Period.Day.Monday, Period.Time.first);
       
       Period period1 = new Period(Period.Day.Saturday, Period.Time.Break);
       sClass c = new sClass(1254,254, b,s,i );
       s.setSClass(c);
        Lecture l = new Lecture(147, "lecture", c,b,period );
        Lecture l1 = new Lecture(254, "Math", c,b,period1 );
        l1.addPeriod(period);
       Table t1 = new Table (145214,l,c); 
       c.setTable(t1);
      
        p.setSClass(c);
        Student q = new Student(14521, "FEE", "HH", d, Gender.Male);
      //System.out.println(l1.getPeriod().getDay() +" " + l1.getPeriod().getTime());
    
      
     
      System.out.println(period1.getDay().toString() +" "+ period1.getTime().startTimeOfEachClass(period1));
      System.out.println(l1.toString());
      
      
      
      
      
      
      
      
      
      
    }
    
}

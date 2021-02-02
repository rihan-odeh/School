/*i
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.time.Duration;
import java.util.Date;

/**
 *
 * @author ro1 driving class to check all methods of each class
 */

public class SchoolModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d = new Date(96, 10, 9);
        Date m = new Date(101, 7, 1);

        Student s = new Student(1254, "R", "O", d, Gender.Female);
        Student p = new Student(21452145, "Rihan", "Odeh", d, Gender.Female);
        Admin a = new Admin();
        Instructor i = new Instructor(1254, "Instructor", "a", m, Gender.NotKnown);
        Book b = new Book(12321, "AAAA", "dkmls", 154, 2001);

        SClass cs = new SClass(1452, 12, b, s, i);
        s.setSClass(cs);

        Lecture l = new Lecture(147, "lecture", cs, b, Duration.ofMinutes(90));
        Lecture l1 = new Lecture(254, "Math", cs, b, Duration.ofMinutes(60));

        Table t1 = new Table(145214, l, cs);
        cs.setTable(t1);
        t1.addLecture(l1);

        p.setSClass(cs);
        Student q = new Student(14521, "FEE", "HH", d, Gender.Female);

        System.out.println("The school model has number of Lectures of:  " + t1.getNumberOfLectures());
        System.out.println("Lectures in t1 " + t1.getLectures()); //add lecture to the table 
        System.out.println("The school class in the table t1: " + t1.getSchoolClass());
        System.out.println("The duration of lecture l: " + l.getPeriod().toHours() + " hours");
        System.out.println("The list of the books: " + cs.getBook());

        /* SchoolModelManagement smm = new SchoolModelManagement();
     //smm.addLecture(l1);
   
      smm.addBook(b);
      smm.addStudent(s);
      smm.addStudent(q);
      smm.addStudent(p);
      smm.addsClass(cs);
      
      smm.addTable(t1);
      
      
    // smm.addLecture(l);
     System.out.println("The school model has number of Lectures of:  "+ smm.getNumberOfLectures());
      //System.out.println("Lectures in t1 "+smm.getlectureFromTable(t1)); //add lecture to the table 
     System.out.println("The school class in the table t1: "+smm.getSClassFromTable(t1));
      System.out.println("The duration of lecture: "+smm.getNameOLecture(147) +"is: "+smm.getDurationOfLecture(147));
      System.out.println("The list of the books: "+smm.GetAllBooks());
      System.out.println("The student with number 1245 is: "+smm.getStudent(1254));
      System.out.println("The number of the classes: "+smm.getNumberOfClasses());
      System.out.println("The number of lectures: "+smm.getNumberOfLectures());
      System.out.println("The number of students: "+smm.getNumberOfStudents());
      System.out.println("The list of all students: "+smm.getStudents());
     smm.deletStudent(q);
      System.out.println("The students after deleting: "+ q.getName()+ " is \n" +smm.getStudents());*/
    }

}

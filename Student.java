/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.Date;

/**
 * student class inherits from person class
 *
 * @author ro1
 */
public class Student extends Person {

    private SClass sc;

    /**
     * constructor that invokes default constructor in superclass, and pass
     * sClass as parameter
     *
     * @param sc
     */
    public Student(SClass sc) {
        super();

        this.sc = sc;

    }

    /**
     * constructor with student object
     *
     * @param student
     */
    public Student(Student student) {
        super(student.getId(), student.getFirstName(), student.getLastName(), student.getDateOfBirth(), student.getGender());
    }

    /**
     * copy constructor
     *
     * @param Id
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender
     * @param SC
     */
    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender, SClass SC) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
        this.sc = SC;
    }

    /**
     * copy constructor
     *
     * @param Id
     * @param FirstName
     * @param LastName
     * @param DateOfBirth
     * @param gender
     */
    public Student(long Id, String FirstName, String LastName, Date DateOfBirth, Gender gender) {
        super(Id, FirstName, LastName, DateOfBirth, gender);
    }

    /**
     * assigns value to sClass
     *
     * @param sc
     */
    public void setSClass(SClass sc) {
        this.sc = sc;
    }

    /**
     *
     * @return SClass
     */
    public SClass getSC() {
        return this.sc;
    }
}

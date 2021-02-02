/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;
import java.util.Date;

/**
 * instructor class extends person class
 *
 * @author ro1
 *
 */
public class Instructor extends Person {

    private ArrayList<Lecture> lecturesList;

    public Instructor() {
        lecturesList = new ArrayList();

    }

    /**
     *
     * @param list to assign it to list of lectures of this instructor
     */
    public Instructor(ArrayList<Lecture> list) {
        super();
        this.lecturesList = list;

    }

    /**
     * constructor with variables
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param gender
     * @param list
     */
    public Instructor(long id, String firstName, String lastName, Date dateOfBirth, Gender gender, ArrayList<Lecture> list) {
        super(id, firstName, lastName, dateOfBirth, gender);
        this.lecturesList = list;
    }

    /**
     * copy constructor
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param gender
     */
    public Instructor(long id, String firstName, String lastName, Date dateOfBirth, Gender gender) {
        super(id, firstName, lastName, dateOfBirth, gender);
    }

    /**
     * copy constructor
     *
     * @param instructor
     */
    public Instructor(Instructor instructor) {
        super(instructor.getId(), instructor.getFirstName(), instructor.getLastName(), instructor.getDateOfBirth(), instructor.getGender());
        lecturesList = instructor.lecturesList;
    }

    public void setLectures(ArrayList<Lecture> list) {
        this.lecturesList = list;
    }

    /**
     *
     * @return lecture object
     */
    public ArrayList<Lecture> getLectures() {
        return lecturesList;
    }

    public void addLecture(Lecture lecture) {
        lecturesList.add(lecture);
    }

    public int getNumberOfLectures() {
        return lecturesList.size();
    }
}

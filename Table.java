/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;

/**
 *
 * @author ro1 Table class, is a school sceduale with lectures and sClasses
 */
class Table {

    private long id;
    private ArrayList<Lecture> lecturesList = new ArrayList<>();
    private SClass sclass;

    /**
     * constructor assigns values to the attributes
     *
     * @param id
     * @param lecture
     * @param sC
     */
    public Table(long id, ArrayList<Lecture> lectures, SClass sC) {
        this.id = id;
        this.lecturesList = lectures;
        this.sclass = sC;

    }

    public Table(long id, Lecture lecture, SClass sC) {
        this.id = id;

        this.sclass = sC;

        lecturesList.add(lecture);
        //System.out.println("2 -- schoolmodel.Table.addLecture() -- " + smm);
    }

    /**
     * getters
     */
    /**
     *
     * @return id if the table
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return lecture in this table
     */
    public ArrayList<Lecture> getLectures() {
        return lecturesList;
    }

    public int getNumberOfLectures() {
        return lecturesList.size();
    }

    /**
     *
     * @return sClass in this table
     */
    public SClass getSchoolClass() {
        return sclass;
    }

    /**
     * Setters
     */
    /**
     *
     * @param Id to be id of the table
     */
    public void setId(long Id) {
        this.id = Id;
    }

    /**
     *
     * @param lecture to assign it to this table class
     */
    public void setLecture(ArrayList<Lecture> lectures) {
        this.lecturesList = lectures;
    }

    /**
     *
     * @param Sc to be the sClass of this table
     */
    public void setSClass(SClass Sc) {
        this.sclass = Sc;
    }

    /**
     *
     * @return a string representation of the whole table with its attributes
     */
    public String tostring() {
        return "The table with " + getId() + "has a " + getLectures() + " and its students are: \n " + sclass.getStudent();
    }

    public void addLecture(Lecture lecture) {
        lecturesList.add(lecture);
    }
}

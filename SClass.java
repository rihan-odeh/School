/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;

import java.util.ArrayList;

/**
 *
 * @author ro1 sclass class is to be a design of school class, and has some
 * attributes
 */
class SClass {

    private long id;
    private Table table;
    private int roomNumber;
    private ArrayList<Book> booksList = new ArrayList<>();
    private ArrayList<Student> studentsList = new ArrayList<>();
    private Instructor classManager;

    /**
     * constructor that assigns values to the attributes
     *
     * @param id
     * @param table
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager
     */
    public SClass(long id, Table table, int roomNumber, ArrayList<Book> books, ArrayList<Student> students, Instructor classManager) {
        this.id = id;
        this.table = table;
        this.roomNumber = roomNumber;
        this.booksList = books;
        this.studentsList = students;
        this.classManager = classManager;
    }

    /**
     * copy constructor
     *
     * @param id
     * @param table
     * @param roomNumber
     * @param book
     * @param student
     * @param classManager
     */
    public SClass(long id, Table table, int roomNumber, Book book, Student student, Instructor classManager) {
        this.id = id;
        this.table = table;
        this.roomNumber = roomNumber;
        this.classManager = classManager;
        booksList.add(book);
        studentsList.add(student);
    }

    /**
     * copy constructor
     *
     * @param id
     * @param roomNumber
     * @param books
     * @param students
     * @param classManager
     */
    public SClass(long id, int roomNumber, Book book, Student student, Instructor classManager) {
        this.id = id;
        this.roomNumber = roomNumber;
        booksList.add(book);

        this.classManager = classManager;
        studentsList.add(student);
    }

    /**
     * setter
     *
     * @param id to be id
     */
    public void setId(long id) {
        this.id = id;

    }

    /**
     *
     * @param table to be the table of this class
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     *
     * @param roomnumber in this sClass
     */
    public void setRoomNumber(int roomnumber) {
        this.roomNumber = roomnumber;

    }

    /**
     *
     * @param books to be books in the SClass
     */
    public void setBooks(ArrayList<Book> books) {
        this.booksList = books;

    }

    public void addBook(Book book) {
        booksList.add(book);
    }

    /**
     *
     * @param Student to be student in this class
     */
    public void setStudents(ArrayList<Student> students) {
        studentsList = students;

    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    /**
     *
     * @param ClassManager to be the instructor of this sClass
     */
    public void setClassManager(Instructor ClassManager) {
        this.classManager = ClassManager;

    }

    /**
     * getters
     *
     */
    /**
     *
     * @return id of the sClass
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return table in this sClass
     */
    public Table getTable() {
        return this.table;
    }

    /**
     *
     * @return room number
     */
    public int getRoomNumber() {
        return this.roomNumber;
    }

    /**
     *
     * @return books assigned to this sClass
     */
    public ArrayList<Book> getBook() {
        return booksList;
    }

    /**
     *
     * @return students in this class
     */
    public ArrayList<Student> getStudent() {
        return studentsList;
    }

    /**
     *
     * @return instructor of this class
     */
    public Instructor getClassManager() {
        return classManager;
    }

    public int getNumberOfStudents() {
        return studentsList.size();
    }

    /**
     *
     * @return string representation of sClass
     */
    public String toString() {
        return "This class " + getId() + " \n is in : " + getRoomNumber() + "\n Students in this class are:\n " + "\n class Manager is: \n" + getClassManager();
    }
}

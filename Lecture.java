/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;


import java.util.ArrayList;


/**
 *
 * @author ro1 Lecture class to be a lecture that has an id, a name, sClass in it, a book assigned to it and a period duration
 */


public class Lecture { //each lecture has more than one Period, so to be put in an array list
 private  int id; 
  private String name;
  private sClass sC; 
   private Book book;
    private ArrayList<Period> periods = new ArrayList<>() ;
       
     
    /**
     * constructor that assigns values to the attributes
     * @param id
     * @param Name
     * @param sC
     * @param book
     * @param period
     * 
     */
    public Lecture(int id , String Name, sClass sC, Book book, ArrayList<Period> period){
        this.id = id; 
        this.name = Name; 
        this.sC =sC; 
        this.book = book; 
        this.periods = period;
    }
      public Lecture(int id , String Name, sClass sC, Book book,Period period){
        this.id = id; 
        this.name = Name; 
        this.sC =sC; 
        this.book = book; 
        addPeriod(period);
    }
    
    public void addPeriod(Period period){
        periods.add(period);
    }
   /**
    * setters
     * @param id to be the id of the lecture
    */
    public void setId(int id){
        this.id = id; 
    }
    /**
     * 
     * @param Name of the lecture
     */
    public void setName(String Name){
        this.name= Name;
    }
    /**
     * 
     * @param Sc to be sClass in this lecture
     */
    public void setsClass(sClass Sc){
        this.sC= Sc;
    }
    /**
     * 
     * @param book in this lecture
     */
    public void setBook(Book book){
        this.book= book; 
    }
    /**
     * 
     * @param Period of this lecture
     */
    public void setPeriod(ArrayList<Period> Period){
        this.periods= Period;
    }
    /**
     * getters
     */
    /**
     * 
     * @return id of the lecture
     */
    public int getId(){
        return id;
    }
    /**
     * 
     * @return name of the lecture
     */
    public String getName(){
        return this.name;
    }
    /**
     * 
     * @return school class in this lecture
     */
    public sClass getsClass(){
        return this.sC;
    }
    /**
     * 
     * @return book of this lecture
     */
    public Book getBook(){
        return this.book;
}
    /**
     * 
     * @return duration of this lecture
     */
    public ArrayList<Period> getPeriod(){
        return this.periods;
    }
    /**
     * 
     * @return String representation of the lecture
     */
    public String toString(){
        return "Lecture: " + getName() + " has an id of:  " +getId() +"\n with school class:\n "+ getsClass() +" assigned with Book: \n " + getBook() + "\n with a duration of: "+ getPeriod().toString(); 
    }
}
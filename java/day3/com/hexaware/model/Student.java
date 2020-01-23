package com.hexaware.model;
import java.util.Objects;



/**
 * Program To employ Model Class
 * @author Sarbani
 */
public class Student{
    public int sno;
    public String name;
    public double cgp;
    private String city;


 public Student (int argsno, 
  String argname, double argcgp, String argcity) {
  this.sno = argsno;
  this.name = argname;
  this.cgp = argcgp;
  this.city = argcity;
  }
  @Override public int hashCode(){
    return Objects.hash(sno, name, cgp, city);
}


  @Override
  public boolean equals (Object ob){
    Student Student = (Student)ob;
     if(this.city == Student.city){
         return true;
     }
     else {
         return false;
          }
     }
  

  @Override
  public String toString() {
      return " sno " +sno+ " Name " +name+  "Cgp" +cgp+  "City"  +city;
  }
 }
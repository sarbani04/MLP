package com.hexaware.mlp173;
import com.hexaware.model.Student;
/**
 * *Program to Boxing And Unboxing.
 * @author Sarbani
 */

 public class StudentDAO
 {
     public static void main(String[] args)
     {
         Student st=new Student();
         st.sno=1;
         st.sname="Sougata";
         st.cgp=4.6;
         st.city="KOL";
         Student e2=new Student();
         e2.sno=3;
         e2.sname="Rahul";
         e2.cgp=1.2;
         e2.city="CHN";
         Student e3 =new Student();
         e3.sno=4;
         e3.sname="Sarbani";
         e3.cgp=9.8;
         e3.city="KOL";
         System.out.printf("%10s %10s %10s %10s","sno","sname","cgp", "city\n");
        //  System.out.println(st);
        //  System.out.println(e2);
        Student[] arr={st,e2,e3};
        for( Student s : arr) {
            System.out.println(s);
        }
     }
 }
 
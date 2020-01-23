package com.hexaware.mlp173;
import com.hexaware.model.Employ;
/**
 * *Program to Boxing And Unboxing.
 * @author Sarbani
 */

 public class BoxEmploy {
     public void show(Object ob){
         Employ e = (Employ) ob;
         System.out.println(e);
     }
     public static void main(String[] args) {
         Employ em = new Employ();
         em.empno = 1;
         em.name = "Sougata";
         em.basic = 88424;
         BoxEmploy obj = new BoxEmploy();
         obj.show(em);
     }
 }
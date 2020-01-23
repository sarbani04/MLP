package com.hexaware.mlp173;
import java.util.List;
import java.util.ArrayList;


/**
 * prg to custom exception class
 * @author Sarbani
 */

 public class ArrListDemo{
     public static void main(String[] args) {
         List <String> names = new ArrayList<String>();
         names.add("Sougata");
         names.add("Rahul");
         names.add("Ruchu");
         names.add("Sarbani");
         names.add("Sancuh");
         names.add("Sougata");
         System.out.println("Names Are ");
         for (Object ob : names){
             System.out.println(ob);
         }
     }
 }
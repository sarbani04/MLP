package com.hexaware.mlp173;

/**
 * *Program to Method Overloading.
 * @author Sarbani
 */

 public class demo{
     public int sum(){
         return 5;
      }
      public int sum(int x){
          return x+5;
      }
      public int sum(int x, int y){
          return x+y;
      }
      public static void main(String[] args) {
          Demo obj = new Demo();

          System.out.println(obj.sum(5));
          System.out.println(obj.sum(45,21));
      }
 } 
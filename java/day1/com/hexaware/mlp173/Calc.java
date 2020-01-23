package com.hexaware.mlp173;
/**
 * Program Data
 * @author Sarbani
 */
 public class Calc{
     public void add(int a, int b){
         int c= a+b;
         System.out.println("sum is =" +c);
     }
    public static void main(String[] args) {
     int a,b;
     a = Integer.parseInt(args[0]);
     b = Integer.parseInt(args[1]);
     Calc obj = new Calc();
     obj.add(a,b);
    }
 }
 
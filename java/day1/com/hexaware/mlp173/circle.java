package com.hexaware.mlp173;
/**
 * Program Data
 * @author Sarbani
 */

 public class Circle{
     public void calc(double radius) {
         double area, circ;
         area = Math.PI*radius*radius;
         circ = 2*Math.PI*radius;
         System.out.println("Area of a circle is " +area);
         System.out.println("Circ of a circle is " +circ);
     }
     public static void main(String[] args) {
         double radius = 12.5;
         Circle obj = new Circle();
         obj.calc(12);
         }
 }
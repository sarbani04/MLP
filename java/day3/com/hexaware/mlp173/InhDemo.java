package com.hexaware.mlp173;


/**
 * Program To employ Model Class
 * @author Sarbani
 */

 class First {
     public void show() {
         System.out.println("show method from class first");
     }
 }

 class Second extends First {
     public void display(){
         System.out.println("Show Method from @nd class");
     }
 }
 public class InhDemo {
     public static void main(String[] args) {
         Second obj = new Second();
         obj.show();
         obj.display();
     }
 }

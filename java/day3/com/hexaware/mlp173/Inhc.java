package com.hexaware.mlp173;


/**
 * Program To employ Model Class
 * @author Sarbani
 */

class C1 {
    C1() {
        System.out.println("Base Class Constructor");
    }
}
class C2 extends C1{
    C2() {
        System.out.println("Derived clss const");
    }
}

 public class Inhc{
     public static void main(String[] args) {
         C2 obj = new C2();
     }
 }
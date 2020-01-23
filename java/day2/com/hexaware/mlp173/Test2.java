package com.hexaware.mlp173;

/**
 *  Programming of Boxing and Unboxing
 * @suthor Sarbani
 */
public class Test2{
public void check(Object ob){
if (ob == 12){
    System.out.println("Hi");
} else {
    System.out.println("Bye");
}
}
public static void main(String[] args){ 
    String a = "XYZ";
    Test1 obj = new Test1();
    obj.check(a);
}
}
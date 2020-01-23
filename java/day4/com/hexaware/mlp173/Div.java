package com.hexaware.mlp173;
import java.util.Scanner;
import java.util.InputMismatchException;
/** 
* program to abstract class demo.
* @author nihaarika.
*/

 public class Div {
     public static void main(String[] args){
         int a,b,c;
         System.out.println("Enter 2 no's");
         Scanner sc=new Scanner(System.in);
         try {
         a=sc.nextInt();
         b=sc.nextInt();
         c=a/b;
         System.out.println("Division "+c);
     }  catch(InputMismatchException e) {
         System.out.println("only numbers... ");
     }  catch(ArithmeticException e) {
         System.out.println("division by zero not possible... ");
     }catch(Exception e){
         e.printStackTrace();
     } finally
     {
         System.out.println("From mavericks");
     }
 }
 }
package com.hexaware.mlp173;
import java.util.Scanner;
import java.util.InputMismatchException;
/** 
* program to abstract class demo.
* @author Sarbani.
*/

public class ArrEx{
    public static void main(String[] args) {
        int[] a = {12,5};
      //  a[10] = 67;    //shows out of bound excptn, thus put it in try and catch block
      try {
          a[10] = 67;
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Arr size small");
      } catch(Exception e) {
          e.printStackTrace();
      }
    }
}
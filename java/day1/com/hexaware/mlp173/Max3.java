package com.hexaware.mlp173;

import java.security.PublicKey;

/**
 * Program Data
 * @author Sarbani
 */

 public class Max3{
     public void check(int a, int b, int c){
        int m = a; 
        if(m < b){
            m = b;
        }
        else if( m < c){
            m = c;
        }
        System.out.println("The max no. is " +m);
     }
     public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
             Max3 obj = new Max3();
             obj.check(a,b,c);

     }
 }
package com.hexaware.mlp173;

import java.security.PublicKey;

/**
 * Program Data
 * @author Sarbani
 */

 public class Fact{
     public void calc( int n){
         int i = 1;
         int f = 1;
         while(i <= n){
             f = f*i;
             i++;
         }
         System.out.println("Factorial " +f);
     }
     public static void main(String[] args){
         int n =Integer.parseInt(args[0]);
         Fact Object  = new Fact();
         Object.calc(n);
     }
 }
package com.hexaware.mlp173;

import java.security.PublicKey;

/**
 * Program Data
 * @author Sarbani
 */

 public class PosNeg{
     public void check(int n){
         if(n >= 0){
         System.out.println("Positive no.");
         } else
         {
             System.out.println("Negative no.");
         }
        }
        public static void main(String[] args){
             int n = Integer.parseInt(args[0]);
             PosNeg obj = new PosNeg();
             obj.check(n);
         }
 }
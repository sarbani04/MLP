package com.hexaware.mlp173;


/**
 * Program To employ Model Class
 * @author Sarbani
 */

 public class Cricket {
     static int score;
     public void incr(int x){
         score += x;
     }
     public static void main(String[] args) {
         Cricket fb = new Cricket();
         Cricket sb = new Cricket();
         Cricket ext = new Cricket();
         fb.incr(54);
         sb.incr(53);
         ext.incr(3);
         System.out.println("Total Score " +Cricket.score);
     }
 }

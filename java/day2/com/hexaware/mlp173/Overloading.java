package com.hexaware.mlp173;
import javax.print.DocFlavor.STRING;

import com.hexaware.model.Employ;
/**
 * *Program to Method Overloading.
 * @author Sarbani
 */

public class Overloading{
    public void show(int x){
        System.out.println("show w.r.t Integer " +x);;
    }
    public void show (String x){
        System.out.println("Show wrt String " +x);
    }
    public void show (Boolean x){
        System.out.println("Show wrt Boolean " +x);
    }
    
    public static void main(String[] args){
        Overloading obj = new Overloading();
        obj.show(12);
        obj.show("hexaware");
        obj.show(true);
    }
}
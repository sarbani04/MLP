package com.hexaware.mlp173;
import com.hexaware.model.Employ;

public class EmployDao {
    public static void main(String[] args) {
        Employ e1 = new Employ(1, "Aman", 4564);
        Employ e2 = new Employ(3, "Raj", 8989);
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
       
        Employ e3 = new Employ(1, "Aman", 4564);
        System.out.println(e1.hashCode());
        System.out.println(e1.hashCode());
        System.out.println(e3.hashCode());


    }
}
package com.hexaware.mlp173;
import com.hexaware.model.Student;

public class StudentDAO {
    public static void main(String[] args) {
        Student e1 = new Student(1, "Aman", 4.5, "kol");
        Student e2 = new Student(3, "Raj", 8.9, "kol");
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

        Student e3 = new Student(1, "Aman", 45, "kol");
        System.out.println(e1.hashCode());
        System.out.println(e1.hashCode());
        System.out.println(e3.hashCode());

    }
}
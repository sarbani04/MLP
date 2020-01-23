package com.hexaware.mlp173;
/**
 * Program To employ Model Class
 * @author Sarbani
 */

class Agent {
    public void show() {
        System.out.println("From agent class..");
    }
}

class Nevash extends Agent {
    public void show(){
        super.show();
        System.out.println("From Nevash Class");
    }
}

public class SuperD1 {
    public static void main(String[] args) {

        new Nevash().show();
    }
}
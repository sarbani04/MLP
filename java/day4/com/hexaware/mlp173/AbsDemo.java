package com.hexaware.mlp173;
/**
 * prgrn to abstract class
 * @author Sarbani
 
 */
 abstract class Training {
     abstract void name();
     abstract void email();
}
class keerthi extends Training {
    @Override
    public void name() {
        System.out.println("Name is keerthi...");
    }
    @Override
    public void email() {
        System.out.println("Email is keerthi@gmail.com");
    }
}
class Nihaarika extends Training {
    @Override
    public void name() {
        System.out.println("Name is Nihaarika...");
    }
    @Override
    public void email() {
        System.out.println("Email is Niharika@gmail.com");
    }
}
public class AbsDemo {
    public static void main(String[] args) {
        Training[] arr = new Training[] {
            new Nihaarika(),new keerthi()

        };
        for(Training t :arr) {
            t.name();
            t.email();
        }
    }

}
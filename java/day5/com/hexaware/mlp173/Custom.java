package com.hexaware.mlp173;

class NegativeException extends Exception {
NegativeException(String error) {
    super(error);
}
}

class NumberZeroException extends Exception{
    NumberZeroException(String error) {
        super(error);
    }
}

public class Custom {
    public void calc(int a, int b) throws
     NumberZeroException, NegativeException{
         if(a<0 || b<0){
             throw new
             NegativeException("Neg no. not allowed");
         } else if(a == 0 || b == 0){
             throw new
             NumberZeroException("Zero is invalid");
         } else {
             int c = a+b;
             System.out.println("Sum is " +c);
         }
     }
     public static void main(String[] args) {
         Custom obj = new Custom();
         try{
             obj.calc(12,5);
         } catch(NegativeException | NumberZeroException e){
            e.printStackTrace();
         }
         
     }
}
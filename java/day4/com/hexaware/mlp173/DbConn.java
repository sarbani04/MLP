package com.hexaware.mlp173;
/** 
* Program to Arr Exception
* @author Sarbani
*/

public class DbConn {
    public void check() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
    }
    public static void main(String[] args) {
        
    }
}
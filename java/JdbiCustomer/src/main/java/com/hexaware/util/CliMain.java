package com.hexaware.util;
import com.hexaware.factory.CustomerFactory;
import com.hexaware.model.Customer;
import java.util.List;
import java.util.Scanner;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
 public class CliMain {
     public static void main(String[] args) {
         List<Customer> lstCustomer=CustomerFactory.showCustomer();
         for(Customer c : lstCustomer) {
             System.out.println(c);
         }
         int cusId;
         Scanner option = new Scanner(System.in);
         System.out.println("Enter Customer Id  ");
         cusId = option.nextInt();
         Customer customer = CustomerFactory.searchCustomer(cusId);
         if (customer != null) {
             System.out.println(customer);
         } else {
             System.out.println("Not Found...");
         }
         Runtime.getRuntime().halt(0);
     } 
 }
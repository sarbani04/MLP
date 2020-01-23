package com.hexaware.util;
import com.hexaware.factory.VendorFactory;
import com.hexaware.model.Vendor;
import java.util.List;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
 public class CliMain {
     public static void main(String[] args) {
         List<Vendor> lstVendor=VendorFactory.showVendor();
         for(Vendor e : lstVendor) {
             System.out.println(e);
         }
         Runtime.getRuntime().halt(0);
     }
 }
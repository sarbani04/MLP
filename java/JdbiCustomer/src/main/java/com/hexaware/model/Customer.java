package com.hexaware.model;
import com.hexaware.persistence.DbConnection;

public class Customer{
    private int CUS_ID;
    private String CUS_NAME;
    private String CUS_PASSWORD;
    private String CUS_EMAIL;
    public String CUS_DOB;
    public String CUS_ADDRESS;
    public double CUS_MOBILE;


 /**
 * @param argEmpno to initialize employ No.
 * @param argName to initialize employ name.
 * @param argDept to initialize employ dept.
 * @param argDesig to initialize employ Desig.
 * @param argBasic to initialize employ basic.
 * used to get details through constructor.\

 */
  public Customer(int argCUS_ID, String argCUS_NAME,
        String argCUS_PASSWORD,
        String argCUS_EMAIL,
        String argCUS_DOB,
        String argCUS_ADDRESS,
        Double argCUS_MOBILE) {
    this.CUS_ID = argCUS_ID;
    this.CUS_NAME = argCUS_NAME;
    this.CUS_PASSWORD = argCUS_PASSWORD;
    this.CUS_EMAIL = argCUS_EMAIL;
    this.CUS_DOB = argCUS_DOB;
    this.CUS_ADDRESS = argCUS_ADDRESS;
    this.CUS_MOBILE = argCUS_MOBILE;
  }
 
  @Override
  public String toString() {
      return String.format("%10s %10s %10s %10s %10s %10s %10s",
      CUS_ID,CUS_NAME,CUS_PASSWORD,CUS_EMAIL,CUS_MOBILE,CUS_DOB,CUS_ADDRESS);
      
  }
}
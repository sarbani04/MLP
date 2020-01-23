package com.hexaware.factory;

//import com.hexaware.cms.persistence.OrdersDAO;
import com.hexaware.persistence.DbConnection;
import java.util.List;
import com.hexaware.model.Customer;
import com.hexaware.persistence.CustomerDAO;
public class CustomerFactory {
     /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of Customer object.
   */
    public static List<Customer> showCustomer() {
    List<Customer> cus = dao().show();
    return cus;
  }

  /**
   * Call the data base connection.
   * @return the  Customer object.
   */
  public static Customer searchCustomer(int cusId) {
    Customer cus = dao().searchById(cusId);
    return cus;
  }
}
package com.hexaware.MLP173.model;

//import static org.junit.Assert.assertEquals;
// import com.hexaware.MLP175.persistence.MenuDAO;
// import com.hexaware.MLP175.factory.MenuFactory;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Date;

//import com.hexaware.MLP173.model.Menu;
//import com.hexaware.MLP173.model.OrderDetail;
//import com.hexaware.MLP173.model.OrderStatus;

import java.text.SimpleDateFormat;


import java.text.ParseException;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

// import mockit.Expectations;
// import mockit.MockUp;
// import mockit.Mocked;
// import mockit.Mock;
import mockit.integration.junit4.JMockit;


// import java.util.ArrayList;


/**
 * Test class for Order.
 */
@RunWith(JMockit.class)
public class OrderTest {
    /**
   * setup method.
   */
  @Before
  public void initInput() {

  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   *  @throws ParseException for date format validation.
   */
  @Test
  public final void testEquals() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    OrderDetail order3 = null;
    OrderDetail order1 = new OrderDetail(1, odt, 100.0, "Kolkata", OrderStatus.ACCEPTED, 1, 2, 1, 2, "PAYTM", "make it fast");
    OrderDetail order2 = new OrderDetail(1, odt, 120.0, "Chennai", OrderStatus.CANCELLED, 1, 2, 1, 2, "CREDITCARD", "make it fast");
    assertTrue(order1.equals(order2));
    assertFalse(order1.equals(order3));
    Menu menu = new Menu();
    assertFalse(order1.equals(menu));
    OrderDetail o1 = new OrderDetail();
    assertFalse(order1.equals(o1));
    assertEquals(order1.hashCode(), order2.hashCode());
  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void testOrder() throws ParseException {
    OrderDetail o = new OrderDetail();
    assertNotNull(o);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    OrderDetail order = new OrderDetail(1, odt, 100.0, "SIRUSERI", OrderStatus.ACCEPTED, 1, 2, 1, 2, "PAYTM", "make it fast");
    assertEquals(1, order.getOrdId());
    assertEquals(odt, order.getOrdTime());
    assertEquals(100.0, order.getOrdAmount(), 0);
    assertEquals("SIRUSERI", order.getOrdLocation());
    assertEquals(OrderStatus.ACCEPTED, order.getOrdStatus());
    assertEquals(1, order.getQtyOrder());
    assertEquals(2, order.getCusId());
    assertEquals(1, order.getFoodId());
    assertEquals(2, order.getVenId());
    assertEquals("PAYTM", order.getWalType());
    assertEquals("make it fast", order.getOrdComments());


    o.setOrdId(1);
    o.setOrdTime(odt);
    o.setOrdAmount(100.0);
    o.setOrdStatus(OrderStatus.ACCEPTED);
    o.setQtyOrder(1);
    o.setCusId(2);
    o.setFoodId(1);
    o.setVenId(2);
    o.setWalType("PAYTM");
    o.setOrdComments("make it fast");

    assertEquals(1, o.getOrdId());
    assertEquals(odt, o.getOrdTime());
    assertEquals(100.0, o.getOrdAmount(), 0);
    assertEquals(OrderStatus.ACCEPTED, o.getOrdStatus());
    assertEquals(1, o.getQtyOrder());
    assertEquals(2, o.getCusId());
    assertEquals(1, o.getFoodId());
    assertEquals(2, o.getVenId());
    assertEquals("PAYTM", o.getWalType());
    assertEquals("make it fast", o.getOrdComments());

  }
}

package com.hexaware.MLP173.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import com.google.protobuf.TextFormat.ParseException;
// import com.hexaware.MLP173.model.Menu;
// import com.hexaware.MLP173.model.Vendor;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import mockit.integration.junit4.JMockit;

// import com.hexaware.MLP175.persistence.MenuDAO;
// import com.hexaware.MLP175.factory.MenuFactory;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;
// import mockit.Expectations;
// import mockit.MockUp;
// import mockit.Mocked;
// import mockit.Mock;
// import java.util.ArrayList;

/**
 * Test class for Menu.
 */
@RunWith(JMockit.class)
public class VendorTest {
    /**
   * setup method.
   */
  @Before
  public void initInput() {

  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   */
  @Test
  public final void testEquals() {
    Vendor vendor3 = null;
    Vendor vendor1 = new Vendor(1, "Aman", "Password", "abc@xyz.com", "6207701328", "Chennai");
    Vendor vendor2 = new Vendor(1, "Aman", "Password", "abc@xyz.com", "6207701328", "Chennai");
    //Vendor m2 = new Vendor();
    assertTrue(vendor1.equals(vendor2));
    assertFalse(vendor1.equals(vendor3));
    Menu m2 = new Menu();
    assertFalse(vendor1.equals(m2));
    Vendor m1 = new Vendor();
    assertFalse(m1.equals(vendor1));
    assertEquals(vendor1.hashCode(), vendor2.hashCode());
  }
  /**
   * Tests the toString() methods of the Customer class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void testToString() throws ParseException {
    Vendor vendor1 = new Vendor(1, "Aman", "Password", "abc@xyz.com", "6207701328", "Chennai");
    String result = String.format("%5s %15s %25s %20s %20s",
        vendor1.getVenId(), vendor1.getVenName(), vendor1.getVenEmail(), vendor1.getVenMobile(), vendor1.getVenAddress());
    assertEquals(result, vendor1.toString());
  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   */
  @Test
  public final void testVendor() {
    Vendor m = new Vendor();
    assertNotNull(m);
    Vendor ven = new Vendor(1, "Aman", "Password", "abc@xyz.com", "6207701328", "Chennai");
    assertEquals(1, ven.getVenId());
    assertEquals("Aman", ven.getVenName());
    assertEquals("Password", ven.getVenPassword());
    assertEquals("abc@xyz.com", ven.getVenEmail());
    assertEquals("6207701328", ven.getVenMobile());
    assertEquals("Chennai", ven.getVenAddress());
    m.setVenId(1);
    m.setVenName("Aman");
    m.setVenPassword("Password");
    m.setVenEmail("abc@xyz.com");
    m.setVenMobile("6207701328");
    m.setVenAddress("Chennai");
    assertEquals(1, m.getVenId());
    assertEquals("Aman", m.getVenName());
    assertEquals("Password", m.getVenPassword());
    assertEquals("abc@xyz.com", m.getVenEmail());
    assertEquals("6207701328", m.getVenMobile());
    assertEquals("Chennai", m.getVenAddress());
  }
}


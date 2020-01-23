package com.hexaware.MLP173.model;

import static org.junit.Assert.assertEquals;
//import com.hexaware.MLP175.persistence.MenuDAO;
//import com.hexaware.MLP175.factory.MenuFactory;
//import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

//import com.hexaware.MLP173.model.WalType;
//import com.hexaware.MLP173.model.Wallet;

import static org.junit.Assert.assertFalse;


//import com.hexaware.MLP175.model.Wallet;
//import com.hexaware.MLP175.model.WalletType;

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
 * Test class for Wallet.
 */
@RunWith(JMockit.class)
public class WalletTest {
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
    Wallet c11 = new Wallet();
    Wallet wallet3 = null;
    Wallet wallet1 = new Wallet(1, 1, 1200, WalType.CREDITCARD);
    Wallet wallet2 = new Wallet(1, 1, 1200, WalType.CREDITCARD);
    assertTrue(wallet1.equals(wallet2));
    assertFalse(wallet1.equals(wallet3));
    Wallet wallet = new Wallet();
    assertFalse(wallet1.equals(wallet));
    assertFalse(wallet1.equals(c11));
    Menu menu = new Menu();
    assertFalse(wallet1.equals(menu));
    assertEquals(wallet1.hashCode(), wallet2.hashCode());
  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   */
  @Test
  public final void testWallet() {
    Wallet w = new Wallet();
    assertNotNull(w);
    Wallet wallet = new Wallet(1, 1, 145, WalType.CREDITCARD);
    assertEquals(1, wallet.getCusId());
    assertEquals(1, wallet.getWalId());
    assertEquals(145, wallet.getWalAmount());
    assertEquals(WalType.CREDITCARD, wallet.getWalType());

    w.setCusId(1);
    w.setWalId(1);
    w.setWalAmount(145);
    w.setWalType(WalType.CREDITCARD);

    assertEquals(1, w.getCusId());
    assertEquals(1, w.getWalId());
    assertEquals(145, w.getWalAmount());
    assertEquals(WalType.CREDITCARD, w.getWalType());
  }
}

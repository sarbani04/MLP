package com.hexaware.MLP173;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;



public class DemoTest {
    @Test 
    public void testPropertyList() {
        assertNull(Demo.propertyList("Ram"));
        assertNotNull(Demo.propertyList("Meena"));
    }
    
    @Test public void testEvenOdd() {
        assertTrue(Demo.evenodd(4));
        assertFalse(Demo.evenodd(5));
    }
    @Test 
    public void testmax3(){
        assertEquals(9, Demo.max3(2,3,9));
        assertEquals(9, Demo.max3(2,5,9));
        assertEquals(12, Demo.max3(2,12,9));
    }

    @Test 
    public void testSum(){
        assertEquals(5, Demo.sum(2,3));
    }

    @Test
    public void testSayHello(){
        assertEquals("Welcome to Junit 5.0", Demo.sayHello());
    }
}
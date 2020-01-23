package com.hexaware.MLP173;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployTest {
    @Test 
    public void testGettersAndSetters(){
        Employ employ = new Employ();
        employ.setEmpno(12);
        assertEquals(12, employ.getEmpno());
        employ.setName("Sarbani");
        assertEquals("Sarbani", employ.getName());
        employ.setDept("JAVA");
        assertEquals("JAVA", employ.getDept());
        employ.setDesig("Developer");
        assertEquals("Developer", employ.getDesig());
    }
    @Test
    public void testConstructor() {
        Employ employ = new Employ(1, "Sougata", "java", "Programmer", 34554);
        assertEquals(1, employ.getEmpno());
        assertEquals("Sougata", employ.getName());
        assertEquals("Java", employ.getDept());
        assertEquals("Programmer", employ.getDesig());
        assertEquals(34554, employ.getBasic());
    }
}
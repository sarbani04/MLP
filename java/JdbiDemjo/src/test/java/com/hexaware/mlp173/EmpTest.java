package com.hexaware.mlp173;
import com.hexaware.factory.EmployFactory;
import com.hexaware.model.Employ;
import com.hexaware.persistence.EmployDAO;
import mockit.MockUp;
import org.junit.runner.RunWith;
import mockit.Expectations;
import mockit.Mock;
import mockit.Mocked;
import java.util.ArrayList;
import mockit.integration.junit4.JMockit;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit Test for simple App
 */
@RunWith(JMockit.class)
public class EmpTest {
    /**
     * tests that Employ Search method.
     * @param dao mocking the dao class.
     */
    @Test
    public final void testListById(@Mocked final EmployDAO dao) {
        final Employ e1 = new Employ(100, "Sarbani", "Java", "Programmer", 98789);
        final Employ e2 = new Employ(200, "Debjit", "Angular", "Programmer", 98789);
        new Expectations(){
            {
                dao.show(100); result = e1;
                dao.show(200); result = e2;
                dao.show(-1); result = null;
            }
        };
        new MockUp<EmployFactory>() {
            @Mock
            EmployDAO dao() {
                return dao;
            }
        };
        Employ res1 = EmployFactory.showEmploy(100);
        assertNotNull(res1);
        Employ res2 = EmployFactory.showEmploy(200);
        assertNotNull(res2);
        Employ res3 = EmployFactory.showEmploy(-1);
        assertNull(res3);
    } 

    /**
     * tests that empty employ list is handled correctly.
     * @param dao mocking the dao class.
     */
    @Test
    public final void testListCount(@Mocked final EmployDAO dao) {
        final ArrayList<Employ> elist = new ArrayList<Employ>();
        elist.add(new Employ(1, "Sougata", "Java", "Programmer", 89087));
        elist.add(new Employ(2, "Sarbani", "C", "Programmer", 89065));
        new Expectations()
        {
            {
                dao.show();
                result = elist;
            }
        };
        new MockUp<EmployFactory>()
        {
            @Mock
            EmployDAO dao() {
                return dao;
            }
        };
      Employ[] es = EmployFactory.showEmploy();
      assertEquals(2, es.length);  
    }
    @Test
    public final void testListAllEmpty(@Mocked final EmployDAO dao) {
        final ArrayList<Employ> elist = new ArrayList<Employ>();
      new Expectations()
      {
          {
              dao.show();
              result = elist;
          }
      };
      new MockUp<EmployFactory>()
      {
          @Mock
          EmployDAO dao() {
              return dao;
          }
      };
    Employ[] es = EmployFactory.showEmploy();
    assertEquals(0, es.length);    
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHETHANA
 */
public class loginTest {
    
    public loginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCallPopup method, of class login.
     */
    @Test
    public void testGetCallPopup() {
        System.out.println("getCallPopup");
        login expResult = null;
        login result = login.getCallPopup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginCheck method, of class login.
     */
    @Test
    public void testLoginCheck() {
        System.out.println("loginCheck");
        login instance = new login();
        instance.loginCheck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEmployee method, of class login.
     */
    @Test
    public void testSearchEmployee() {
        System.out.println("searchEmployee");
        login instance = new login();
        instance.searchEmployee();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SystemClose method, of class login.
     */
    @Test
    public void testSystemClose() {
        System.out.println("SystemClose");
        login instance = new login();
        instance.SystemClose();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of image method, of class login.
     */
    @Test
    public void testImage() {
        System.out.println("image");
        login instance = new login();
        instance.image();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class login.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        login instance = new login();
        instance.insertUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

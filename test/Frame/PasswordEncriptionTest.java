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
public class PasswordEncriptionTest {
    
    public PasswordEncriptionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of encrypt method, of class PasswordEncription.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String message = "6414";
        String expResult = "iGgUs6Ns6RXb3qUK9wGlRQ==";
        String result = PasswordEncription.encrypt(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class PasswordEncription.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String message = "iGgUs6Ns6RXb3qUK9wGlRQ==";
        String expResult = "6414";
        String result = PasswordEncription.decrypt(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

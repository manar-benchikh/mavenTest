/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class testMavenTest {
    
    public testMavenTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addition method, of class testMaven.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int valeur = 1;
        testMaven instance = new testMaven();
        double expResult = 50.0;
        double result = instance.addition(valeur);
        assertEquals(expResult, result, 0.0);
    }
    
}

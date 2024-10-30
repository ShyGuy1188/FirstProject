/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.firstproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkDescription method, of class Task.
     */
    @Test
    public void testCheckDescription() {
        System.out.println("checkDescription");
        Task instance = null;
        boolean expResult = false;
        boolean result = instance.checkDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createID method, of class Task.
     */
    @Test
    public void testCreateID() {
        System.out.println("createID");
        Task instance = null;
        String expResult = "";
        String result = instance.createID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printDetails method, of class Task.
     */
    @Test
    public void testPrintDetails() {
        System.out.println("printDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.printDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalHours method, of class Task.
     */
    @Test
    public void testTotalHours() {
        System.out.println("totalHours");
        Task instance = null;
        int expResult = 0;
        int result = instance.totalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

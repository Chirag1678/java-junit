package com.bridelabz.junittesting;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

// Test class to test list operations
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Class to set up ordering of test cases
public class ListManagerTest {
    // Attribute for ListManager
    private static ListManager listManager;
    private static List<Integer> list;
    // Constructor - to run before all test method
    @BeforeAll
    public static void setup() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // test method for addition to list
    @Test
    @DisplayName("Test Element Addition")
    @Order(1)
    public void testAddElement() {
        Assertions.assertTrue(listManager.addElement(list, 10));

        Assertions.assertTrue(listManager.addElement(list, 20));

        System.out.println("List addition test performed successfully!!");
    }

    // test method for removal from list
    @Test
    @DisplayName("Test Element Removal")
    @Order(2)
    public void testRemoveElement() {
        Assertions.assertEquals(10, listManager.removeElement(list, 10));

        Assertions.assertEquals(20, listManager.removeElement(list, 20));

        System.out.println("List removal test performed successfully!!");
    }

    // test method to get size of list
    @Test
    @DisplayName("Test for list size")
    @Order(3) // for ordering the test cases
    public void testGetSize() {
        Assertions.assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 10);
        Assertions.assertEquals(1, listManager.getSize(list));

        System.out.println("Get list size test performed successfully!!");
    }
}

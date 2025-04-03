package com.bridelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test class to convert date format from yyyy-MM-dd to dd-MM-yyyy
public class DateFormatterTest {
    // Attribute of DateFormatter
    private static DateFormatter formatter;
    // Constructor - to be called before all test methods
    @BeforeAll
    public static void setup() {
        formatter = new DateFormatter();
    }

    // test method to format date
    @Test
    @DisplayName("Test method to format date")
    public void testFormatDate() {
        String formattedDate = formatter.formatDate("2025-04-03");
        Assertions.assertEquals("03-04-2025", formattedDate);
        System.out.println("2025-04-03 in dd-MM-yyyy format: " + formattedDate);

        formattedDate = formatter.formatDate("2020-12-12");
        Assertions.assertEquals("12-12-2020", formattedDate);
        System.out.println("2020-12-12 in dd-MM-yyyy format: " + formattedDate);
    }
}

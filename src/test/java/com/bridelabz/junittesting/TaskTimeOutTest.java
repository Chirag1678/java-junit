package com.bridelabz.junittesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

// Test class to check timeout test
public class TaskTimeOutTest {
    // method to test a method using timeout
    @Test
    @DisplayName("Test using Timeout")
    @Timeout(2)
    public void testLongRunningTask() throws InterruptedException {
        try {
            Thread.sleep(3000);
            System.out.println("Test completed successfully!!");
        } catch (InterruptedException e) {
            System.out.println("Task timed out: " + e.getMessage());
        }
    }
}

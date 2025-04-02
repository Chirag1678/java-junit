package com.bridelabz.junittesting;

import org.junit.jupiter.api.*;

// Test class to test file operations
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FileProcessorTest {
    // Attribute for File Processor
    private static FileProcessor fileProcessor;
    String fileName = "src/main/java/com/bridelabz/junittesting/FileProcessorDestination.txt";
    // Constructor - to be executed before all tests
    @BeforeAll
    public static void setup() {
        fileProcessor = new FileProcessor();
    }

    // method to add content to file
    @Test
    @DisplayName("Test to add content to file")
    @Order(1)
    public void testWriteToFile() {
        String content = "Hello World!";
        String result = fileProcessor.writeToFile(fileName, content);
        Assertions.assertEquals("Content added to file successfully!!",  result, result);

        System.out.println("Content added successfully!!");
    }

    // method to read content from file
    @Test
    @DisplayName("Test to read from file")
    @Order(2)
    public void testReadFromFile() {
        String result = fileProcessor.readFromFile(fileName);
        Assertions.assertEquals("Hello World!\n", result, result);

        System.out.println("Content read successfully!!");
    }
}

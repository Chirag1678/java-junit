package com.bridelabz.junittesting;

import java.io.*;

// Class to do write and read operations on a file
public class FileProcessor {
    // method to write to a file
    public String writeToFile(String filename, String content) {
        // Use try-catch to handle exception
        try(FileWriter fw = new FileWriter(filename)) {
            fw.write(content+"\n");
            return "Content added to file successfully!!";
        } catch (IOException e) {
            return "Unable to write to file: " + e.getMessage();
        }
    }

    // method to read from file
    public String readFromFile(String fileName) {
        // Use try-catch to handle exceptions
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder result= new StringBuilder();
            String line;
            while((line=br.readLine())!=null) {
                result.append(line).append("\n");
            }
            return result.toString();
        } catch (IOException e) {
            return "Unable to read from file: " + e.getMessage();
        }
    }
}

package com.bridelabz.junittesting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Class to convert date format from yyyy-MM-dd to dd-MM-yyyy
public class DateFormatter {
    // method to convert date format
    public String formatDate(String inputDate) {
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, inputFormat);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(outputFormat);
    }
}

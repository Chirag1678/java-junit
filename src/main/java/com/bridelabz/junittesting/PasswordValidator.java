package com.bridelabz.junittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to validate a password
public class PasswordValidator {
    public boolean isValidPassword(String password) {
        // Regex variable to store password regex
        String passwordRegex = "(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d@$!%*?&]{8,}";

        // Create Objects of Pattern and Matcher
        Pattern pattern = Pattern.compile(passwordRegex);

        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}

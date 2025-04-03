package com.bridelabz.junittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class to register user with validations
public class UserRegistration {
    // method to register user
    public String registerUser(String username, String email, String password) throws IllegalArgumentException {
        // check if all parameters are valid
        try {
            if(isValidUsername(username) && isValidEmail(email) && isValidPassword(password)) {
                return "User registered successfully!";
            } else {
                throw new IllegalArgumentException("Values doesn't meet the validation criteria");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error - Invalid values given: " + e.getMessage());
        }
    }

    // method to check valid username
    public boolean isValidUsername(String username) {
        // Regex variable for username
        String usernameRegex = "^[a-zA-Z0-9_.+-]+$";

        // Make objects for regex
        Pattern usernamePattern = Pattern.compile(usernameRegex);
        Matcher usernameMatcher = usernamePattern.matcher(username);

        return usernameMatcher.matches();
    }

    // method to check valid email
    public boolean isValidEmail(String email) {
        // Regex variable for email
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";

        // Make objects for regex
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(email);

        return emailMatcher.matches();
    }

    // method to check valid password
    public boolean isValidPassword(String password) {
        // Regex variable for password
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        // Make objects for regex
        Pattern passwordPattern = Pattern.compile(passwordRegex);
        Matcher passwordMatcher = passwordPattern.matcher(password);

        return passwordMatcher.matches();
    }
}

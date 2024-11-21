package com.example.lab8;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        int counter = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasDigit = true;
            counter++;

            // If both conditions are met, the password is valid

        }
        if (hasUpperCase && hasLowerCase && hasDigit && counter >= 10) {
            return true;
        }
        return false;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public boolean checkUserName(String username) {
        if (username.length() > 5) return false;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) == '_') return true;
        }
        return false;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;
        boolean hasCapital = false, hasNumber = false, hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) hasCapital = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        return hasCapital && hasNumber && hasSpecial;
    }

    public String registerUser(String username, String password, String firstName, String lastName) {
        if (!checkUserName(username)) {
            System.out.println("Username is not correctly formatted.");
            return "Username is not correctly formatted.";
        } else if (!checkPasswordComplexity(password)) {
            System.out.println("Password does not meet complexity requirements.");
            return "Password does not meet complexity requirements.";
        } else {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println("User registered successfully.");
            return "User registered successfully.";
        }
    }

    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again.");
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            System.out.println("Username or password incorrect, please try again.");
            return "Username or password incorrect, please try again.";
        }
    }
}
   

   
    


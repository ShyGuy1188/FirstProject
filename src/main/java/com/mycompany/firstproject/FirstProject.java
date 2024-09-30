/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class FirstProject {

     public static void main(String[] args) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

 
        login.registerUser(username, password, firstName, lastName);

        System.out.print("Enter username to login: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password to login: ");
        String loginPassword = scanner.nextLine();
        login.returnLoginStatus(loginUsername, loginPassword);
    
    }

    private static class Login {

        public Login() {
        }

        private void returnLoginStatus(String loginUsername, String loginPassword) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void registerUser(String username, String password, String firstName, String lastName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}

   
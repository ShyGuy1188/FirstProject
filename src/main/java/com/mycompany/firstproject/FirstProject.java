/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject;

import java.util.Scanner;
import javax.swing.JOptionPane;
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
        
          System.out.println("Welcome to EasyKanban");

        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tasks:"));
        System.out.println("Number of tasks: " + numTasks);

        int totalHours = 0;

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Enter task name:");
            System.out.println("Task name: " + taskName);

            String taskDescription = JOptionPane.showInputDialog("Enter task description:");
            while (taskDescription.length() > 50) {
                System.out.println("Description too long. Please enter a description of less than 50 characters.");
                taskDescription = JOptionPane.showInputDialog("Enter task description:");
            }
            System.out.println("Task description: " + taskDescription);

            String developerDetails = JOptionPane.showInputDialog("Enter developer details:");
            System.out.println("Developer details: " + developerDetails);

            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (hours):"));
            System.out.println("Task duration: " + taskDuration + " hours");

            String[] statuses = {"To Do", "Done", "Doing"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);
            System.out.println("Task status: " + taskStatus);

            Task task = new Task(taskName, i, taskDescription, developerDetails, taskDuration, taskStatus);
            totalHours += task.totalHours();
            System.out.println(task.printDetails());
        }
        System.out.println("Total hours: " + totalHours);
        
        TaskManager taskManager = new TaskManager();
        taskManager.displayDoneTasks();
        taskManager.displayLongestDurationTask();
        taskManager.searchTaskByName("Create Login");
        taskManager.searchTasksByDeveloper("Samantha Paulson");
        taskManager.deleteTaskByName("Create Reports");
        taskManager.displayReport();



    
     
     }
       
    }

    class Login {

        public Login() {
        }

        void returnLoginStatus(String loginUsername, String loginPassword) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        void registerUser(String username, String password, String firstName, String lastName) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

   


  


     



   
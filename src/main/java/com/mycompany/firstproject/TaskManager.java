/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject;

/**
 *
 * @author RC_Student_lab
 */
class TaskManager {
    
    String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
    String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
    int[] taskDurations = {5, 8, 2, 11};
    String[] taskStatus = {"To Do", "Doing", "Done", "To Do"};

    public void displayDoneTasks() {
        for (int i = 0; i < taskStatus.length; i++) {
            if (taskStatus[i].equals("Done")) {
                System.out.println("Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Task Duration: " + taskDurations[i]);
            }
        }
    }

    public void displayLongestDurationTask() {
        int maxDurationIndex = 0;
        for (int i = 1; i < taskDurations.length; i++) {
            if (taskDurations[i] > taskDurations[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        System.out.println("Developer: " + developers[maxDurationIndex] + ", Duration: " + taskDurations[maxDurationIndex]);
    }

    public void searchTaskByName(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equals(taskName)) {
                System.out.println("Task Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Task Status: " + taskStatus[i]);
                return;
            }
        }
        System.out.println("Task not found");
    }

    public void searchTasksByDeveloper(String developer) {
        boolean found = false;
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equals(developer)) {
                System.out.println("Task Name: " + taskNames[i] + ", Task Status: " + taskStatus[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found for this developer");
        }
    }

    public void deleteTaskByName(String taskName) {
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equals(taskName)) {
                System.out.println("Entry '" + taskName + "' successfully deleted");
                taskNames[i] = "";
                taskStatus[i] = "";
                return;
            }
        }
        System.out.println("Task not found");
    }

    public void displayReport() {
        for (int i = 0; i < taskNames.length; i++) {
            System.out.println("Task Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Task Duration: " + taskDurations[i] + ", Task Status: " + taskStatus[i]);
        }
    }
    
}

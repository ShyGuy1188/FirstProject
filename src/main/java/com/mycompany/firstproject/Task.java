/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
     private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskStatus;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
    }

    public boolean checkDescription() {
        return taskDescription.length() <= 50;
    }

    public String createID() {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }

    public String printDetails() {
        return "Status: " + taskStatus + "\nDeveloper: " + developerDetails + "\nNumber: " + taskNumber + "\nName: " + taskName + "\nDescription: " + taskDescription + "\nID: " + createID() + "\nDuration: " + taskDuration + " hours";
    }

    public int totalHours() {
        return taskDuration;
    }
}




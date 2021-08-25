package com.bridgelabz;

public class EmployeeWageBuilderProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage");

        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is present");
        } else {
            System.out.println("employee is absent");
        }
    }
}

package com.bridgelabz;

public class EmployeeWageBuilderProgram {
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        // variables
        int empHrs = 0;
        int empWage = 0;
        int numberOfWorkingDays = 20;
        int totalWage = 0;
        for (int i = 1; i <= numberOfWorkingDays; i++) {
            //Getting Random Number by Random method
            //Math.floor is used to Round off the value
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            //Daily_wage checking based on emp_attendance
            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("day" + i + "Employee Wage=" + empWage);
            //adding daily wage into total
            totalWage += empWage;
        }
        System.out.println("Total wage of Employee for 20days:" + totalWage);
    }
}

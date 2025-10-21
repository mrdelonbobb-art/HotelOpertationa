package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked; // changed to double for partial hours
    private double punchInTime;
    private double punchOutTime;
    private boolean isClockedIn;

    public Employee(int employeeID, String name, String department, double payRate, int hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.isClockedIn = false;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Regular hours (up to 40)
    public double getRegularHours() {
        return (this.hoursWorked > 40) ? 40 : this.hoursWorked;
    }

    // Overtime hours (over 40)
    public double getOvertimeHours() {
        return (this.hoursWorked > 40) ? this.hoursWorked - 40 : 0;
    }

    // Calculate total pay (overtime = 1.5x pay rate)
    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }

    // Punch in method
    public void punchIn(double time) {
        if (isClockedIn) {
            System.out.println(name + " is already punched in!");
            return;
        }
        this.punchInTime = time;
        this.isClockedIn = true;
        System.out.println(name + " punched in at " + time + " hours.");
    }

    // Automatic punch in using system time
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);
        punchIn(currentTime);
    }

    // Punch out method
    public void punchOut(double time ) {
        if (!isClockedIn) {
            System.out.println(name + " must punch in first!");
            return;
        }
        this.punchOutTime = time;
        this.isClockedIn = false;
        System.out.println(name + " punched out at " + time +
                " hours. Hours worked this shift: " + (time - punchInTime));
    }
        public void punchOut() {
            LocalDateTime now = LocalDateTime.now();
            double currentTime = now.getHour() + (now.getMinute() / 60.0);
            punchOut(currentTime);
        }
}

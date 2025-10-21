package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;
private float overtimeHours;
private double totalPay;

    public Employee(int employeeID, String name, String department, double payRate, float hoursWorked,float overtimeHours,double totalPay) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
        this.totalPay = totalPay;
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

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getOvertimeHours() {
        return overtimeHours;
    }

    public double getTotalPay() {
        return totalPay;
    }



}


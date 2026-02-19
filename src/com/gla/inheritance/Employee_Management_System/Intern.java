package com.gla.inheritance.Employee_Management_System;

class Intern extends Employee {
    String college;

    Intern(String name, int id, double salary, String college) {
        super(name, id, salary);
        this.college = college;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("College: " + college);
    }
}
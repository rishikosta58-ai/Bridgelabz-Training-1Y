package com.gla.inheritance.School_System;

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " works in " + department + " department");
    }
}

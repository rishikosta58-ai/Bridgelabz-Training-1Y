package com.gla.inheritance.Vehical_Hierarchy;

class MotorCycle extends Vehicle {
    boolean hasABS;

    MotorCycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("ABS: " + hasABS);
    }
}

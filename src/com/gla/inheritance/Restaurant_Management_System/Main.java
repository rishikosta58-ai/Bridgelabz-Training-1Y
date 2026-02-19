package com.gla.inheritance.Restaurant_Management_System;

class Main {
    public static void main(String[] args) {
        Worker w1 = new Chef("Ramesh", 101);
        Worker w2 = new Waiter("Suresh", 102);

        w1.performDuties();
        w2.performDuties();
    }
}
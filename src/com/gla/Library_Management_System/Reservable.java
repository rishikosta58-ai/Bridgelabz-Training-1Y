package com.gla.Library_Management_System;

interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();


}

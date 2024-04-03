package com.learning.core.day1session1;

public class TestClass {
    public static void main(String[] args) {
        MedicineInfo medicine;

        // Create a Tablet instance
        medicine = new Tablet();
        System.out.println();
        medicine.displayLabel();

        // Create a Syrup instance
        medicine = new Syrup();
        System.out.println();
        medicine.displayLabel();

        // Create an Ointment instance
        medicine = new Ointment();
        System.out.println();
        medicine.displayLabel();
    }
}

package com.learning.core.day1session1;

//Syrup class implementing MedicineInfo interface
public class Syrup implements MedicineInfo {
	@Override
	public void displayLabel() {
   System.out.println("Syrup is consumable only on prescription.");
}
}

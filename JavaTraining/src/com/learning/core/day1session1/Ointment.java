package com.learning.core.day1session1;


//Ointment class implementing MedicineInfo interface
public class Ointment implements MedicineInfo {
	 @Override
	 public void displayLabel() {
		 System.out.println("Ointment is for external use only.");
	 }
}

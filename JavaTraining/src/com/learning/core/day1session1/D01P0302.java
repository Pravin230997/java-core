package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        scanner.close();

        String weekdayName = getWeekdayName(dayNumber);
        if (weekdayName != null) {
            System.out.println(weekdayName);
        } else {
            System.out.println("Invalid input");
        }
    }

    public static String getWeekdayName(int dayNumber) {
        if (dayNumber == 1) {
            return "Sunday";
        } else if (dayNumber == 2) {
            return "Monday";
        } else if (dayNumber == 3) {
            return "Tuesday";
        } else if (dayNumber == 4) {
            return "Wednesday";
        } else if (dayNumber == 5) {
            return "Thursday";
        } else if (dayNumber == 6) {
            return "Friday";
        } else if (dayNumber == 7) {
            return "Saturday";
        } else {
            return null;
        }
    }
}


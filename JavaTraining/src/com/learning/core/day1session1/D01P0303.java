package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P0303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained: ");
        int marks = scanner.nextInt();

        scanner.close();

        String grade = calculateGrade(marks);
        if (grade != null) {
            System.out.println(grade);
        } else {
            System.out.println("Invalid marks entered");
        }
    }

    public static String calculateGrade(int marks) {
        if (marks >= 0 && marks <= 100) {
            if (marks >= 60) {
                return "Grade A";
            } else if (marks >= 45) {
                return "Grade B";
            } else if (marks >= 35) {
                return "Grade C";
            } else {
                return "Fail";
            }
        } else {
            return null;
        }
    }
}


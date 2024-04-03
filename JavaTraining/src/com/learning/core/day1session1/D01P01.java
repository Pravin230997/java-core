package com.learning.core.day1session1;
import java.util.Scanner;

public class D01P01 {
	    private String title;
	    private double price;
	    

	    // Constructor
	    public D01P01(String title, double price) {
	        this.title = title;
	        this.price = price;
	    }

	    // Getter and setter for book title
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    // Getter and setter for book price
	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    

	    // Method to create a book object
	    public static D01P01 createBook(String title, double price) {
	        return new D01P01(title, price);
	    }

	    // Method to display book information
	    public void showBook() {
	        System.out.print("Title: " + getTitle());
	        System.out.print("Price: " + getPrice());
	    }

	    public static void main(String[] args) {
	        // Creating a book object
	    	D01P01 book = D01P01.createBook("Java Programming ", 350.00);

	        // Displaying book information
	        book.showBook();
	    }
	}
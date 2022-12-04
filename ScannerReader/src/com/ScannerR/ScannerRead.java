package com.ScannerR;

import java.util.Scanner;

public class ScannerRead {

	public static void main(String[] args) {
		System.out.println("Enter your details....");

	    //scanner object
	    Scanner input = new Scanner(System.in);

	    //take input name is string
	    System.out.println("Please enter your name: ");
	    String employee_name = input.nextLine();
	    System.out.println("Please enter your initial in single character: ");
	    char name = input.next().charAt(0);
	    System.out.println("Name- " + employee_name+"."+name);

	    //take input age is integer type
	    System.out.println("Enter your age: ");
	    int age = input.nextInt();
	    System.out.println("Age- " + age);


	    //take input salary is double type
	    System.out.println("Enter your salary: ");
	    double salary = input.nextDouble();
	    System.out.println("Salary- " + salary);
	    //close the scanner
	    input.close();

	}

}

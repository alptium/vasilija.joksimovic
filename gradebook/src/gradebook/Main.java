package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter student's name");
			String studentName1 = sc.next();
			System.out.println("Enter student's surname");
			String studentSurname1 = sc.next();
			System.out.println("Enter student's grade");
			double grade1 = sc.nextDouble();
			
			System.out.println("Enter student's name");
			String studentName2 = sc.next();
			System.out.println("Enter student's surname");
			String studentSurname2 = sc.next();
			System.out.println("Enter student's grade");
			double grade2 = sc.nextDouble();
			
			System.out.println("Enter student's name");
			String studentName3 = sc.next();
			System.out.println("Enter student's surname");
			String studentSurname3 = sc.next();
			System.out.println("Enter student's grade");
			double grade3 = sc.nextDouble();
			
			System.out.println("Enter student's name");
			String studentName4 = sc.next();
			System.out.println("Enter student's surname");
			String studentSurname4 = sc.next();
			System.out.println("Enter student's grade");
			double grade4 = sc.nextDouble();
			
			System.out.println("Enter student's name");
			String studentName5 = sc.next();
			System.out.println("Enter student's surname");
			String studentSurname5 = sc.next();
			System.out.println("Enter student's grade");
			double grade5 = sc.nextDouble();
			
			double totalgrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
			
			System.out.println(" \n ");
			System.out.println("List of students in the class with treir grade");
			System.out.printf(studentName1); System.out.println("\t");
			System.out.printf(studentSurname1);  System.out.println("\t");
			System.out.println("Grade:" + grade1); System.out.println("\n");
			
			System.out.printf(studentName2); System.out.println("\t");
			System.out.printf(studentSurname2); System.out.println("\t");
			System.out.println("Grade:" + grade2); System.out.println("\n");
			
			System.out.printf(studentName3 ); System.out.println("\t");
			System.out.printf(studentSurname3); System.out.println("\t");
			System.out.println("Grade:" + grade3); System.out.println("\n");
			
			System.out.printf(studentName4);  System.out.println("\t");
			System.out.printf(studentSurname4);  System.out.println("\t");
			System.out.println("Grade:" + grade4); System.out.println("\n");
			
			System.out.printf(studentName5);  System.out.println("\t");
			System.out.printf(studentSurname5);  System.out.println("\t");
			System.out.println("Grade :" + grade5); System.out.println("\n");
			
			System.out.println("Total grade in the class is:");
			System.out.println(+ totalgrade);
			
		}
	}		
}
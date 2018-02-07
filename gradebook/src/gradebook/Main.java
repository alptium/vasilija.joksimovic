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
			
			double totalGrade = (grade1 + grade2 + grade3 + grade4 + grade5);
			
			
			System.out.println("A list of students in the class with their grades " + "\\n");
			System.out.println();

			
			System.out.println(studentName1 + "\t" + studentSurname1 + "\t" + "Grade:" + grade1);
			System.out.println();
			

			System.out.printf(studentName2 + "\t" + studentSurname2 + "\t" + "Grade:" + grade2);
			System.out.println();
			

			System.out.printf(studentName3 + "\t" + studentSurname3 + "\t" + "Grade:" + grade3);
			System.out.println();
			

			System.out.printf(studentName4 + "\t" + studentSurname4 + "\t" + "Grade:" + grade4);
			System.out.println();
			

			System.out.printf(studentName5 + "\t" + studentSurname5 + "\t" + "Grade:" + grade5);
			System.out.println();
			System.out.println();
			
			System.out.printf("Total grade in the class is:" + totalGrade);
			
			
		}
	}		
}
package gradebook;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter student's name ");
			String student1name = sc.next();
			System.out.println("Enter student's surname ");
			String student1surname = sc.next();
			System.out.println("Enter student's grade");
			Double grade1 = sc.nextDouble();
			
			System.out.println("Enter student's name  ");
			String student2name = sc.next();
			System.out.println("Enter student's surname  ");
			String student2surname = sc.next();
			System.out.println("Enter student's grade");
			Double grade2 = sc.nextDouble();
			
			System.out.println("Enter student's name  ");
			String student3name = sc.next();
			System.out.println("Enter student's surname  ");
			String student3surname = sc.next();
			System.out.println("Enter student's grade");
			Double grade3 = sc.nextDouble();
			
			System.out.println("Enter student's name  ");
			String student4name = sc.next();
			System.out.println("Enter student's surname  ");
			String student4surname = sc.next();
			System.out.println("Enter student's grade");
			Double grade4 = sc.nextDouble();
			
			System.out.println("Enter student's name  ");
			String student5name = sc.next();
			System.out.println("Enter student's surname  ");
			String student5surname = sc.next();
			System.out.println("Enter student's grade");
			Double grade5 = sc.nextDouble();
			
			Double totalgrade = (grade1 + grade2+ grade3 + grade4 + grade5) / 5;
			System.out.println("List of students in the class with treir grade ");
			System.out.println(" 1." ); System.out.printf(student1name ); 
			System.out.printf(student1surname); 
			System.out.println(" Grade :" + grade1);
			System.out.println(" 2." ); System.out.printf(student2name );
			System.out.printf(student1surname); 
			System.out.println(" Grade :" + grade2);
			System.out.println(" 3." ); System.out.printf(student3name );
			System.out.printf(student1surname); 
			System.out.println(" Grade :" + grade3);
			System.out.println(" 4." ); System.out.printf(student4name );
			System.out.printf(student1surname); 
			System.out.println( " Grade:" + grade4);
			System.out.println(" 5." ); System.out.printf(student5name );
			System.out.printf( student1surname); 
			System.out.println(" Grade :" + grade5);
			
			System.out.println("Total grade in the class is: ");
			System.out.println( + totalgrade);
			
		}
	}		
}
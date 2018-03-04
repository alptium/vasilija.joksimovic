package advancedgradebook;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)  {
    
		ArrayList<Student> studentsList = new ArrayList<>();
		
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				
				Student student = new Student();

				student = new Student();
				System.out.println("Enter student's first name");
				student.name = sc.next();
				System.out.println("Enter student's last name");
				student.surname = sc.next();
				System.out.println("Enter student's grade?");
				student.grade = sc.nextDouble();
				studentsList.add(student);
				
				System.out.println("Do you want to enter the data for a new student? yes/no");
				System.out.println();
				
				String quit = sc.next(); 
				
				if (quit.equals("no")) {
					break;
				} else while (!quit.equals("no") && !quit.equals("yes")) {
					System.out.println("You entered the wrong word, plase response with yes or no!");
					System.out.println("Do you want to enter the data for a new student? yes/no");
					System.out.println();
					quit = sc.next();
				}
				
				 if (quit.equals("no")) {
						break;		
				}
			
			}
			
			double totalGrade = 0;
			int i = 1;
			
			System.out.println("List of students in this class:");
			System.out.println();
			
			for(Student student : studentsList) {
				
				System.out.println("" + student.name + "\t" + student.surname + "\t" + "Grade: " + student.grade);
				i++;
			
				totalGrade += student.grade;
			}
				System.out.println();
				System.out.println("Total grade in the class is: " + totalGrade);
			
		}
		
	}
	
}
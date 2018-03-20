package advancedgradebook;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)  {
	    
		ArrayList<Student> studentsList = new ArrayList<>();
		
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
	
				System.out.println("Enter student's first name");
				String name = sc.next();
				System.out.println("Enter student's last name");
				String surname = sc.next();
				System.out.println("Enter student's grade?");
				double grade = sc.nextDouble();
				
				Student student = new Student(name, surname, grade);
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
			
			int totalNumberOfStudents = studentsList.size();
			System.out.println("Total number of students in the class is: " + totalNumberOfStudents);

			for(Student student : studentsList) {
				
				System.out.println("" + student.getName() + "\t" + student.getSurname() + "\t" + "Grade: " + student.getGrade());
				i++;
			
				totalGrade += student.getGrade();
			}
			
			System.out.println();
			System.out.println("Total grade in the class is: " + totalGrade);
			System.out.println("Average grade in the class is: " + (totalGrade / i));

			double maxGrade = 0;
			double minGrade = 5;
			
			for(int a = 0; a < studentsList.size(); a++) {
					
				Student student = studentsList.get(a);

				if (student.getGrade() > maxGrade) {
					maxGrade = student.getGrade();
							
				}

				if (student.getGrade() < minGrade) {
					minGrade = student.getGrade();
							
				}
							
			}		
				
			System.out.println("Maximum grade in the class is: " + maxGrade);
			System.out.println("Minimum grade in the class is: " + minGrade);

		}
		
	}
	
}

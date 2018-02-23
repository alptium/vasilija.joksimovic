package elitesportsteamselector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the application for MMA player registration");
		System.out.println("Please, follow the instructions and fill in the application...");
		System.out.println();
	

		try(Scanner sc = new Scanner(System.in)) {
			
			while (true) {
				
				Candidate candidates = new Candidate(); 
				
				candidates = new Candidate();
				
				System.out.println("Enter candidate's name");
				candidates.name = sc.next();
				
				System.out.println("Enter candidate's surname");
				candidates.surname = sc.next();
				
				System.out.println("Enter candidate's age");
				candidates.age = sc.nextInt();
					
				System.out.println("Enter candidate's height in cm");
				candidates.weight = sc.nextInt();
					
				System.out.println("Enter candidate's weight in kilograms");
				candidates.weight = sc.nextInt();
				
				System.out.println("Does the candidate have some health problems so he/her has to take some medicine daily? true/false");
				candidates.healthProblems = sc.nextBoolean();
				
				System.out.println("Had the candidate  ever had some serious wrists/angle/head injury that is still in process of healing? true/false");
				candidates.earlierInjuries = sc.nextBoolean();
					
					
				if (candidates.age < 15 && candidates.height < 140 && candidates.weight < 40 && candidates.healthProblems && candidates.earlierInjuries ) {
					System.out.println("The candidate does not meet the requirements of this preselection");
					System.out.println("The application is REJECTED");
					System.out.println();	
				} else {
					System.out.println("The candidate meets the requirements of this preselection");
					System.out.println("The application is ACCEPTED");
					System.out.println();
				}	
				 
				System.out.println(" Do you want to enter the data for a new candidate? yes/no");
				System.out.println();
	
				String quit = sc.next();
				if (quit.equals("no")) {
					break;
				}
				
			}

		} 
			
	}

}

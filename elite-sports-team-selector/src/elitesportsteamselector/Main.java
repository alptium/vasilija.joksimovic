package elitesportsteamselector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the application for MMA player registration");
		System.out.println("Please, follow the instructions and fill in the application...");
		System.out.println();
	
		try(Scanner sc = new Scanner(System.in)) {
			
			while (true) {
				
				Candidate candidate = new Candidate(); 
				
				candidate = new Candidate();
				
				System.out.println("Enter candidate's name");
				candidate.name = sc.next();
				
				System.out.println("Enter candidate's surname");
				candidate.surname = sc.next();
				
				System.out.println("Enter candidate's age");
				candidate.age = sc.nextInt();
					
				System.out.println("Enter candidate's height in cm");
				candidate.weight = sc.nextInt();
					
				System.out.println("Enter candidate's weight in kilograms");
				candidate.weight = sc.nextInt();
				
				System.out.println("Does the candidate have some health problems so he/her has to take some medicine daily? true/false");
				candidate.healthProblems = sc.nextBoolean();
				
				System.out.println("Had the candidate  ever had some serious wrists/angle/head injury that is still in process of healing? true/false");
				candidate.earlierInjuries = sc.nextBoolean();
						
				if (candidate.age < 15 && candidate.height < 140 && candidate.weight < 40 && candidate.healthProblems && candidate.earlierInjuries ) {
					System.out.println("The candidate does not meet the requirements of this preselection");
					System.out.println("The application is REJECTED");
					System.out.println();	
				} else {
					System.out.println("The candidate meets the requirements of this preselection");
					System.out.println("The application is ACCEPTED");
					System.out.println();
				}	
				
				System.out.println("Do you want to enter the data for a new candidate? yes/no");
				System.out.println();
				
				String quit = sc.next(); 
				if (quit.equals("no")) {
					break;
				} else if(!quit.equals("yes")) {
					
					System.out.println("You entered the wrong word,plase response with yes or no!");
					System.out.println("Do you want to enter the data for a new candidate? yes/no");
					System.out.println();
					
					String quit1 = sc.next(); 
					if (quit1.equals("no")) {
						break;
					}
					
				}
				
			}

		} 
			
	}

}

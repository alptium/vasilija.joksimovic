package elitesportsteamselector;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the application for MMA player registration");
		System.out.println("Please, follow the instructions and fill in the application...");
		System.out.println();
	
		ArrayList<Candidate> candidateList = new ArrayList<>();
		ArrayList<Candidate> notAcceptedList = new ArrayList<>();

		
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
				candidate.height = sc.nextInt();
					
				System.out.println("Enter candidate's weight in kilograms");
				candidate.weight = sc.nextInt();
				
				System.out.println("Does the candidate have some health problems so he/her has to take some medicine daily? true/false");
				candidate.healthProblems = sc.nextBoolean();
				
				System.out.println("Had the candidate  ever had some serious wrists/angle/head injury that is still in process of healing? true/false");
				candidate.earlierInjuries = sc.nextBoolean();
						
				if (candidate.age < 15 || candidate.height < 140 || candidate.weight < 40 || candidate.healthProblems || candidate.earlierInjuries ) {
					System.out.println("The candidate does not meet the requirements of this preselection");
					System.out.println("The application is REJECTED");
					System.out.println();	
					notAcceptedList.add(candidate);
				} else {
					System.out.println("The candidate meets the requirements of this preselection");
					System.out.println("The application is ACCEPTED");
					System.out.println();
					candidateList.add(candidate);
				}	
				
				System.out.println("Do you want to enter the data for a new candidate? yes/no");
				System.out.println();
				
				String quit = sc.next(); 
				
				if (quit.equals("no")) {
					break;
				} else while (!quit.equals("no") && !quit.equals("yes")) {
					System.out.println("You entered the wrong word, plase response with yes or no!");
					System.out.println("Do you want to enter the data for a new candidate? yes/no");
					System.out.println();
					quit = sc.next();
				}
				
				 if (quit.equals("no")) {
						break;
						
				}
						
			}
			
			int i = 1;
			
			System.out.println("List of accepted candidates:");
			System.out.println();
			
			for(Candidate candidate : candidateList) {
				
				System.out.println("" + i + "\t" + candidate.name + "\t" + candidate.surname );
				i++;
			}
		
			int j = 1;
			System.out.println("List of rejected candidates:");
			System.out.println();
		
			for(Candidate candidate : candidateList) {
			
				System.out.println("" + j + "\t"  + candidate.name + "\t" + candidate.surname );
				j++;
			}
		
			int totalNumOfPeople = (i + j) - 2 ;
			
			System.out.println("Total number of applied candidates is: " + totalNumOfPeople);
			System.out.println("Total number of ccandiidates that were accepted is " + (i - 1) + ", that makes" + "\t" + ((i - 1) * 100 / totalNumOfPeople) + "%");
			System.out.println("Total number of candidates that were rejected is " + (j - 1) + ", that makes" + "\t" + ((j - 1) * 100 / totalNumOfPeople) + "%");
		}
			
	}

}

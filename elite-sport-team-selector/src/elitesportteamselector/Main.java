package elitesportteamselector;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("Welcome to the application for MMA player registration");
		System.out.println("Please, follow the instructions and fill in the application...");
		System.out.println();
		
		ArrayList<Candidate> acceptedCandidates = new ArrayList<>();
		ArrayList<Candidate> rejectedCandidates = new ArrayList<>();
		
		try(Scanner sc = new Scanner(System.in)) {
			
			while(true) {
			
				System.out.println("Enter candidate's name");
				String name = sc.next();
			
				System.out.println("Enter candidate's surname");
				String surname = sc.next();
				
				System.out.println("Enter candidate's age");
				int age = sc.nextInt();
				
				System.out.println("Enter candidate's height in cm");
				int height = sc.nextInt();
				
				System.out.println("Enter candidate's weight in kilograms");
				int weight = sc.nextInt();
			
				System.out.println("Does the candidate have some health problems so he/her has to take some medicine daily? true/false");
				boolean healthProblems = sc.nextBoolean();
			
				System.out.println("Had the candidate  ever had some serious wrists/angle/head injury that is still in process of healing? true/false");
				boolean earlierInjuries = sc.nextBoolean();
			
				Candidate candidate = new Candidate(name, surname, age, height, weight, healthProblems, earlierInjuries);
			
				if (candidate.getAge() < 15 || candidate.getHeight() < 140 || candidate.getWeight() < 40 || candidate.getHealthProblems() || candidate.getEarlierInjuries()) {
					System.out.println("The candidate does not meet the requirements of this preselection");
					System.out.println("The application is REJECTED");
					System.out.println();	
					rejectedCandidates.add(candidate);
				} else {
					System.out.println("The candidate meets the requirements of this preselection");
					System.out.println("The application is ACCEPTED");
					System.out.println();
					acceptedCandidates.add(candidate);
				}	
			
				System.out.println("Do you want to enter the data for a new candidate? yes/no");
				System.out.println();
			
				String quit = sc.next(); 
			
				while (!quit.equals("no") && !quit.equals("yes")) {
					System.out.println("You entered the wrong word, plase response with yes or no!");
					System.out.println("Do you want to enter the data for a new candidate? yes/no");
					System.out.println();
					
					quit = sc.next();						
				}
			
				if (quit.equals("no")) {
					break;
				}	
					
			}
			
			System.out.println("List of accepted candidates:");
			System.out.println();
			
			int i = 1;
			
			for(Candidate candidate : acceptedCandidates) {
				System.out.println("" + i + "." + "\t" + candidate.getName() + "\t" + candidate.getSurname());
				i++;
			}

			System.out.println("List of rejected candidates:");
			System.out.println();

			int j = 1;
			
			for(Candidate candidate : rejectedCandidates) {
				System.out.println("" + j + "." + "\t" + candidate.getName() + "\t" + candidate.getSurname());
				j++;
			}
		
			int acceptedCandidatesCount = acceptedCandidates.size();
			int rejectedCandidatesCount = rejectedCandidates.size();
			int totalCandidatesCount = acceptedCandidatesCount + rejectedCandidatesCount;
			
			double acceptedCandidatesPercent = (double)acceptedCandidatesCount * 100 / totalCandidatesCount;
			double rejectedCandidatesPercent = (double)rejectedCandidatesCount * 100 / totalCandidatesCount;

			System.out.println();
			System.out.println("Total number of applied candidates is: " + totalCandidatesCount);
			System.out.println("Total number of candidates that were accepted is " + acceptedCandidatesCount + ", that makes" + "\t" + acceptedCandidatesPercent + "%");
			System.out.println("Total number of candidates that were rejected is " + rejectedCandidatesCount + ", that makes" + "\t" + rejectedCandidatesPercent + "%");
		}
	}
}

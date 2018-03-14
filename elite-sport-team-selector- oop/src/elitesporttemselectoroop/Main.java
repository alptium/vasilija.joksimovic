package elitesporttemselectoroop;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)  {

		System.out.println("Welcome to the application for MMA player registration");
		System.out.println("Please, follow the instructions and fill in the application...");
		System.out.println();
		
		ArrayList<Candidate> candidateList = new ArrayList<>();
		
		try(Scanner sc = new Scanner(System.in)){
			
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
			} else {
				System.out.println("The candidate meets the requirements of this preselection");
				System.out.println("The application is ACCEPTED");
				System.out.println();
			}	
			
		}
		
	}
	
}
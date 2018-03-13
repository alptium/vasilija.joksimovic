package bankloans;

import java.util.ArrayList;
import java.util.Scanner;
import bankloans.Candidate;

public class Main {
	
	public static void main(String[] args) {
		
	
		System.out.println("Welcome to BANK LOANS application");
		System.out.println("Please, fill in the form");
		
		ArrayList<Candidate> clientListApproved = new ArrayList<>();
		ArrayList<Candidate> clientListNotApproved = new ArrayList<>();

		
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
			
				System.out.println("Enter candidate's name!");
				String name = sc.next();
				System.out.println("Enter candidate's surname");
				String surname = sc.next();
				System.out.println("Enter candidate's age!");
				int age = sc.nextInt();
				System.out.println("Does the candidate have a permanent job? yes/no");
				String hasPermanentJob = sc.next();
				System.out.println("Enter candidate's average sallary in euros");
				int averageSallary = sc.nextInt();
				System.out.println("Is the candidate married? yes/no");
				String isMarried = sc.next();
				System.out.println("Does candidate already have another credit? yes/no");
				String hasAnotherLoan = sc.next();
				System.out.println("What type of credit is the candidate applying for?");
				System.out.println("Enter 1 for CASH credit?");
				System.out.println("Enter 2 for MORTAGE loan?");
				System.out.println("Enter 3 for CONSUMPTION load?");
				String creditType = sc.next();	
				
				Candidate client = new Candidate(name, surname, age, hasPermanentJob, averageSallary, isMarried, hasAnotherLoan, creditType);
				
				if(client.getCreditType().equals("1")) {
					if (client.getAge() > 60 || client.getHasPermanentJob().equalsIgnoreCase("no") || client.getAverageSallary() < 350 || client.getHasAnotherLoan().equals("yes")) {
					System.out.println("Sorry, the bank in't able to approve you a loan under this conditions");
					clientListNotApproved.add(client);

				} else {
					System.out.println("The bank has approved your loan, congratulation!");
					clientListApproved.add(client);
					}
				} 
				 if(client.getCreditType().equals("2")) {
					if (client.getAge() > 60 || client.getHasPermanentJob().equalsIgnoreCase("no") || client.getAverageSallary() < 400 || client.getHasAnotherLoan().equals("yes") || client.getIsMarried().equals("no")) {
					System.out.println("Sorry, the bank in't able to approve you a loan under this conditions");
					clientListNotApproved.add(client);

				} else {
					System.out.println("The bank has approved your loan, congratulation!");
					clientListApproved.add(client);
					}
				}
				 if(client.getCreditType().equals("3")) {
						if (client.getAge() > 60 || client.getHasPermanentJob().equalsIgnoreCase("no") || client.getAverageSallary() < 200 || client.getHasAnotherLoan().equals("yes")) {
						System.out.println("Sorry, the bank in't able to approve you a loan under this conditions");
						clientListNotApproved.add(client);

					} else {
						System.out.println("The bank has approved your loan, congratulation!");
						clientListApproved.add(client);
						}
					}
				 
				
					System.out.println("Do you want to enter the data for another client? yes/no");
					String qu = sc.next();
					if (qu.equalsIgnoreCase("no")) {
					break;
				}
				else while (!qu.equalsIgnoreCase("yes") && !qu.equalsIgnoreCase("no"))  {
					System.out.println("Sorry, but you are entered the wrong answer");
					System.out.println("Are there new candidates, yes or no?");
					qu = sc.next();
				}
					if (qu.equalsIgnoreCase("no")) {
						break;
					}
			}
			
			int i = 1;
			int j = 1;
			int a = 1;
			int b = 1;
			int c = 1;
			int sallary1 = 0;
			int sallary2 = 0;
			
			System.out.println("List of clients whose appliances were accepted:");
			System.out.println();
			
			for(Candidate client : clientListApproved) {
				
				System.out.println("" + i + ". " + client.getName() + "\t" + client.getSurname() + "\t" + "AGE: " + client.getAge() + "\t" + "Has permanent job: " + client.getHasPermanentJob() + "\t" + "Married: " + client.getIsMarried() + "\t" + "Has another loan: " + client.getHasAnotherLoan() + "\t" + "Credit type: " + client.getCreditType());
				System.out.println();

				sallary1 += client.getAverageSallary();
				i++;
			}
			
			System.out.println("List of clients whose appliances were rejected:");
			System.out.println();
			
			for(Candidate client : clientListNotApproved) {
				
				System.out.println("" + j + ". " + client.getName() + "\t" + client.getSurname() + "\t" + "Sallary: " + client.getAverageSallary() + "\t" + "AGE: " + client.getAge() + "\t" + "Has permanent job: " + client.getHasPermanentJob() + "\t" + "Married: " + client.getIsMarried() + "\t" + "Has another loan: " + client.getHasAnotherLoan() + "\t" + "Credit type: " + client.getCreditType());
				System.out.println();

				j++;
				sallary2 = client.getAverageSallary();
			}
			
			int totalNumOfPeople = (i + j) - 2 ;
			
			System.out.println("Total number of applied clients is: " + totalNumOfPeople);
			System.out.println("Total number of clients whose appliances were accepted is " + (i - 1) + ", that makes" + "\t" + ((i - 1) * 100 / totalNumOfPeople) + "%");
			System.out.println("Total number of clients whose appliances were rejected is " + (j - 1) + ", that makes" + "\t" + ((j - 1) * 100 / totalNumOfPeople) + "%");
			System.out.println("Average sallary of all clients is:  " + (sallary1 + sallary2) / totalNumOfPeople);
			System.out.println();

			for(Candidate client : clientListApproved) {
				
				if(client.getIsMarried().equals("yes")) {
					a++;
				}else {
					b++;
				}
			}
			
			for(Candidate client : clientListNotApproved) {
				
				if(client.getIsMarried().equals("yes")) {
					a++;
				}else {
					b++;
				}
			}
			
			System.out.println("Total number of applied clients that are married is: " + (a - 1) + "\t" + "and unmarried " + (b-1));
			System.out.println();

			for(Candidate client : clientListApproved) {
				
				if(client.getHasPermanentJob().equals("yes")) {
					c++;
				}
			}
			
			for(Candidate client : clientListNotApproved) {
				
				if(client.getHasPermanentJob().equals("yes")) {
					c++;
				}
			}
			
			
			System.out.println("Total number of applied clients that have permanent job: " + (c - 1) +  ", that makes" + "\t" + ((c - 1) * 100 / totalNumOfPeople) + "\t" + "%" );
			System.out.println("Total number of applied clients that don't have permanent job: " + (totalNumOfPeople - c + 1) +  ", that makes" + "\t" + ((totalNumOfPeople - c + 1) * 100 / totalNumOfPeople) + "\t" + "%" );
		}
		
	}

}

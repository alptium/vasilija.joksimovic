package calculator;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter your first number");
			Double firstNum = sc.nextDouble();
			
			System.out.println("Choose the operation ==>  +, -, * ,/ ");
			String operation = sc.next();
			
			System.out.println("Enter your second number");
			Double secondNum = sc.nextDouble();

			System.out.println("Now the system is calculating the result ...");
			Double result = 0.0;
			
			if(operation.equals("+")) {
				result = firstNum + secondNum;
			} else if(operation.equals("-")) {
				result = firstNum - secondNum;
			} else if(operation.equals("*")) {
				result = firstNum * secondNum;		
			} else if(operation.equals("/")) {
				result = firstNum / secondNum;			
			}
			
			System.out.println("First number is: " + firstNum);
			System.out.println("Second number is: " + secondNum);
			System.out.println("The result is: " + result);

		}

	}
	
}	

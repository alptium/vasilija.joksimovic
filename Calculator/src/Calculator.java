import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		Double firstNum = sc.nextDouble();
		System.out.println(" Choose the operation you wish to perform ==>  +; -; *; / :  /");
		String operation = sc.next();
		System.out.println("Enter your second number");
		Double secondNum = sc.nextDouble();
		
		System.out.println("Wait few second for the result...");
		double result = 0;
		
		if (operation.equals("+")) {
			result  =firstNum + secondNum;
		}else if (operation.equals("-")) {
			result = firstNum - secondNum;
		}else if (operation.equals("*")) {
			result = firstNum * secondNum;
		}else if (operation.equals("/")) {
			result = firstNum / secondNum;
		}
		System.out.println("First number is: " + firstNum);
		System.out.println("Second number is: " + secondNum);
		System.out.println("The result is: " + result);
	}
		
	}



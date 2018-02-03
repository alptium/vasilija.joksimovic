package kalkulator;
import java.util.Scanner;
public class kalkulator {

		public static void main(String[] args) {
			
	   
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your first number");
		int firstNum= sc.nextInt();
		System.out.println("Chooes your operation +, -, *, /");
		String operation =sc.next();
		System.out.println("Enter your seconde number");
		int secondNum = sc.nextInt();
		
		System.out.println("Now the system is calculating the result...");
		int result=0;
		
		if (operation.equals("+")) {
			result=firstNum + secondNum;
		}else if (operation.equals("-")) {
			result=firstNum - secondNum;
		}else if (operation.equals("*")) {
			result=firstNum * secondNum;
		}else if (operation.equals("/")) {
			result=firstNum / secondNum;
		}
		System.out.println("First number is: " + firstNum);
		System.out.println("Second number is: " + secondNum);
		System.out.println("The result is: " + result);
	}
		}



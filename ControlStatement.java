package ControlStatement;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] args) {
		//statement 
		System.out.println("----STATEMENT----\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number:\n");
		
		double number = input.nextDouble();
		if(number > 0) {
			System.out.println("This is a Positive number\n");
		}
		else if(number ==0 ) {
			System.out.println("This is Zero\n");			
		}
		else {
			System.out.println("This is a Nagetive number\n");
		}
		
	}
}

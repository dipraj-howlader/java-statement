package ControlStatement;

import java.util.Scanner;

public class CheckEvenAndOdd {
	public static void main(String[] args) {
		System.out.println("---EVEN VS ODD---\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Number\n");
		
		int num = input.nextInt();
		
		if(num%2==0) {
			System.out.println("This is EVEN Number!\n");
		}
		else {
			System.out.println("This is odd!\n");
		}
	}
}

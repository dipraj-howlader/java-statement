package ControlStatement;

import java.util.Scanner;

public class VoiewConso {
	public static void main(String[] args) {
		System.out.println("---Voiew and Consonent---\n");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character\n");
		
		char letter = input.next().charAt(0); // taking the first letter of the string
		
		
		if(letter == 'a') {
			System.out.println("This is vowel\n");
		}
		else if(letter == 'e') {
			System.out.println("This is vowel\n");
		}
		else if(letter == 'i') {
			System.out.println("This is vowel\n");
		}
		else if(letter == 'o') {
			System.out.println("This is voiew\n");
		}
		else if(letter == 'u') {
			System.out.println("This is vowel\n");
		}
		else {
			System.out.println("This is consonent\n");
		}
		
		
		// logical operator
		System.out.println("---Check with Operator---\	n");
		Scanner let = new Scanner(System.in);
		char lett = let.next().charAt(0);
		
		if(lett == 'a' || lett == 'e' || lett == 'i' || lett == 'o' || lett == 'u') {
			System.out.println("This is vowel\n");
		}
		else {
			System.out.println("This is consonent\n");
		}
	}
}

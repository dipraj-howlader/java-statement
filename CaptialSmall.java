package ControlStatement;

import java.util.Scanner;

public class CaptialSmall {
	public static void main(String[] args) {
		System.out.println("---Capital Small---\n");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A/a Char\n");
		
		char letter = input.next().charAt(0);
		
		if(letter >= 'a' && letter <= 'z') {
			System.out.println("This is a small letter\n");
		}
		else {
			System.out.println("This is a Capital Lette\n");
		}
	}
}

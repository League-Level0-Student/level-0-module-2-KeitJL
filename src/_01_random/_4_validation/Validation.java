//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if(randomNumber == 0) {
	System.out.println("You're Great!");
}
else if (randomNumber == 1) {
	System.out.println("You're Awesome");
}
else if (randomNumber == 2) {
	System.out.println("You're nice");
}
else if (randomNumber == 3) {
	System.out.println("You're cool");
}
else if (randomNumber == 4) {
	System.out.println("You're brave");
}
else if (randomNumber == 5) {
	System.out.println("You're friendly");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}

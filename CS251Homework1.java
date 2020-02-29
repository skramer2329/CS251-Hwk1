
/*************************************************
 *Sabrina Kramer                                 *
 *CS251Homework01.java                           *
 *                                               *
 *Gets user input, creates array of lowercase    *
 *letters, prints string and length of string    *                                         
 *                                               * 
 ************************************************/

import java.util.Scanner;

public class CS251Homework1 {

	public static void main(String[] args) {

		Scanner stdId = new Scanner(System.in);
		int userInput;
		String inputUser;

		do {
			System.out.println("Please choose an integer: ");
			userInput = stdId.nextInt();

			format(userInput);

			System.out.print("Would you like to choose another integer? y/n");
			inputUser = stdId.next();

		} while (inputUser.equalsIgnoreCase("y"));
		stdId.close();
	}

	public static void format(int userInput) {

		if (userInput == 0) {
			System.out.println("0");
			System.out.println("Length of String [0]");
		} else {
			char[] arr = new char[userInput];

			// loops through index to assign random letters to array
			for (int i = 0; i < arr.length; ++i) {
				int num = (int) (Math.random() * 26) + 97;
				char letter = (char) num;
				arr[i] = letter;
			}

			// finds smallest value in array and swap with first value
			int minVal = 0;
			for (int i = 0; i < userInput; ++i) {
				if (arr[i] < arr[minVal]) {
					minVal = i;
				}
			}
			arr[0] = arr[minVal];

			// create a string that contains all characters from array in same order
			String s = "";
			for (int i = 0; i < userInput; ++i) {
				s += arr[i];
			}

			// counts vowels within string
			int vowelCount = 0;
			String vowels = "aeiou";
			for (int i = 0; i < s.length(); ++i) {
				if (vowels.indexOf(s.charAt(i)) != -1) {
					++vowelCount;
				}
			}
			s += " " + vowelCount;

			System.out.println(s);
			System.out.println("Length of String: " + "[" + s.length() + "]");
		}
	}

}

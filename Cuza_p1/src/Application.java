
// This application takes a 4-digit integer and encrypts it. 
// It takes all four integers individually and adds 7 to it
// then finds the remainder when divided by 10.
// It then swaps the 1st and 3rd digit
// and swaps the 2nd and 4th digit.
// It then prints out the encrypted 4-digit integer back to the user.
// It is also able to take an encrypted 4-digit integer and decrypt it to get
// the original 4-digit integer

import java.util.Scanner;								// Import Scanner class
public class Application {								// Application class
	public static void main(String[] args) {			// Main class
		Scanner inputs = new Scanner(System.in);		// Input variable
		int[] data = new int[4];						// 4-element array to hold 4-digit integer
		int choice;										// Variable to save choice integer
		System.out.println("To Encrypt, press (1);\nTo Decrypt, press (2);");		// Prompt to choose to encrypt or decrypt
		choice = inputs.nextInt();													// Records choice
		System.out.println("Begin entering your 4-digit integer");					// Prompt to start entering digits
		System.out.println("One digit at a time");						
		for(int i = 0; i<4; i++) {													// Loop to print prompt 4 times
		System.out.println("\nEnter digit #" + (i+1) +":");							// and save the digit to correct 
		data[i] = inputs.nextInt();													// element space
		}
		if(choice == 1) {															// If "1" is entered calls "encrypt" method 
			Encrypter.encrypt(data);												// from "Encrypter" class and prints 
			System.out.println("\nYour encrypted integer is:");						// encrypted 4-digit integer
			for(int j=0; j<4; j++) {
				System.out.print(data[j]);
			}
		}
		if(choice == 2) {															// If "2" is entered calls "decrypt" method 
			Decrypter.decrypt(data);												// from "Decrypter" class and prints
			System.out.println("\nYour decrypted integer is:");						// decrypted 4-digit integer
			for(int j=0; j<4; j++) {
				System.out.print(data[j]);
			}
		}
		inputs.close();																// Closes inputs
	}
}
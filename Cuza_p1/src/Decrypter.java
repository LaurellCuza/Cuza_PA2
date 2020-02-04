public class Decrypter {
	public static void decrypt(int[] Dec) {
		int temp=Dec[0];								// Swaps 1st and 3rd digit
		Dec[0]=Dec[2];
		Dec[2]=temp;
		
		temp=Dec[1];									// Swaps 2nd and 4th digit
		Dec[1]=Dec[3];
		Dec[3]=temp;
		for(int i=0; i<4; i++) {						// Repeats operations for each digit
			if(Dec[i]>6) {								// If digit is greater than 6
				while(Dec[i]>10) {						// while digit is greater than 10
					Dec[i]-=10;							// subtract 10 from digit
				}
			}
			else {										// Else (Digits 0-6) 
				Dec[i]+=10;								// Add 10 to digit
			}
			Dec[i]-=7;									// Subtract 7 from digit
		}
	}
}
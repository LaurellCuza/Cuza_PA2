public class Encrypter {							// Encrypter class
public static void encrypt(int[] Enc) {				// Encrypt method
	for(int i=0; i<4; i++) { 						// Repeats operations for each digit
		Enc[i]+=7;									// Adds 7 to digit
		Enc[i]%=10;									// Finds (digit+7) mod 10
	}
	int temp=Enc[0];								// Swaps 1st and 3rd digit
	Enc[0]=Enc[2];
	Enc[2]=temp;
	
	temp=Enc[1];									// Swaps 2nd and 4th digit
	Enc[1]=Enc[3];
	Enc[3]=temp;									
}
}
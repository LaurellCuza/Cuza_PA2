// This program allows you to enter your weight and height in order to 
// find your BMI. The program allows you to enter either imperial or metric 
// measurements. It also displays what BMI category you are in.

import java.text.DecimalFormat;							// Decimal formatting import
import java.util.Scanner;								// Scanner import
public class BMICalculator {							// BMICalculator class
	public int bmiCat=0, choicemeas = 0;				// Public int variables
	public double weight=0, height=0, bmi=0;			// Public double variables
	public Scanner inputs = new Scanner(System.in);		// input variable
	public void readUserData(){							// Accessed in Main method. Reads user data.
		System.out.println("BMI Calculator");			// Title
		while(choicemeas != 1 && choicemeas != 2){		// Loops until correct choice value is inputed
		readUnitType();									// Method call
		readMeasurementData();							// Method call
		inputs.close();									// Closes Scanner inputs
		}
	}
	private void readUnitType(){						// Reads user's unit decision
		System.out.println("Measurement Choice:");		// Prompts to user to choose unit type
		System.out.println("For Metric, press (1)");	// Prompts use to press 1 for metric
		System.out.println("For Imperial, press (2)");	// Prompts use to press 2 for imperial
		choicemeas = inputs.nextInt();					// Records user's unit choice in "choicemeas" variable
	}
	private void readMeasurementData(){					// Reads user's measurement
		if(choicemeas == 1)								// If user presses 1 method is called
		readMetricData();								// Method called
		else if(choicemeas == 2)						// If user presses 2 method is called
		readImperialData();								// Method called
		else{											// If invalid choice is entered than prompt is printed
		System.out.println("Incorrect input!");
		}
	}
	private void readMetricData(){							// Reads metric measurements
		System.out.println("Enter weight in kilograms:");	// Prompt for user to enter weight in kilograms
		getWeight();										// Method called
		System.out.println("Enter height in meters:");		// Prompt for user to enter height in meters
		getHeight();										// Method called
	}
	private void readImperialData(){
		System.out.println("Enter weight in pounds:");		// Prompt for user to enter weight in pounds
		getWeight();										// Method called
		System.out.println("Enter height in inches:");		// Prompt for user to enter height in inches
		getHeight();										// Method called
	}
	public void calculateBmi(){								// Accessed in main method. Calculates user's BMI
		setHeight();										// Method called
		setWeight();										// Method called
		getBmi();											// Method called
		calculateBmiCategory();								// Method called
	}
	private void calculateBmiCategory(){					// Calculates the BMI Categories 
		if(bmi<18.5)										// If BMI is under 18.5 then user is in BMI category 1
			bmiCat = 1;
		else if(bmi>=18.5 && bmi<=24.9)						// If 18.5<=BMI<= 24.9 then user is in BMI category 2
			bmiCat = 2;
		else if(bmi>=25 && bmi<=29.9)						// If 25<=BMI<= 29.9 then user is in BMI category 3
			bmiCat = 3;
		else												// If BMI is 30 0r over then user is in BMI category 4
			bmiCat = 4;
	}
	public void displayBmi (){											// Accessed in main method. Displays user's results
		DecimalFormat formatting = new DecimalFormat("###.##");			// Help from stackoverflow.com to figure out decimal formatting
		System.out.println("Your BMI is: "+ formatting.format(bmi));	// Display's user's BMI
		System.out.println("BMI Category:");							// Prompts "BMI Category:"
		getBmiCategory();												// Method call
	}
	public void getWeight(){						// Reads user's weight input
		weight = inputs.nextDouble();				// Records user's weight input in "weight" variable
	}
	private void setWeight(){						// Checks if user enters a negative weight
		if(weight<0)								
			System.exit(1);							// If so program is terminated
	}
	public void getHeight(){						// Reads user's height input
		height = inputs.nextDouble();				// Records user's height input in "height" variable
	}
	private void setHeight(){						// Checks if user enters a negative height
		if(height<0)
			System.exit(1);							// If so program is terminated
	}
	public void getBmi(){							// Uses BMI equations to calculate user's BMI
		if(choicemeas == 1) 						// If metric units is chosen
			bmi = weight/(height*height);			// this formula is used
		if(choicemeas == 2)							// If imperial units is chosen
			bmi = (weight*703)/(height*height);		// this formula is used
	}
	public void getBmiCategory(){					// Determines user's BMI category
		if(bmiCat==1)								// If user's BMI is in category 1 
			System.out.println("Underweight");		// program prints "Underweight"
		if(bmiCat==2)								// If user's BMI is in category 2
			System.out.println("Normal Weight");	// program prints "Normal Weight"
		if(bmiCat==3)								// If user's BMI is in category 3
			System.out.println("Overweight");		// program prints "Overweight"
		if(bmiCat==4)								// If user's BMI is in category 4
			System.out.println("Obesity");			// program prints "Obesity"
	}
}

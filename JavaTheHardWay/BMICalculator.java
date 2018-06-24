import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double feet, inches, pounds, bmi, feettoinches, inchestometers;
		//Added variables and code to input weight/height 
		//in lbs and inches, convert to kg and meters.
		System.out.print("Your height (feet only): ");
		feet = keyboard.nextDouble();
		
		System.out.print("Your height (inches): ");
		inches = keyboard.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		
		feettoinches = (feet*12) + inches;
		inchestometers = feettoinches*0.0254;
		bmi = pounds / (inchestometers*inchestometers);
		
		System.out.println("Your BMI is " + bmi);
	}
}
import java.util.Scanner;

public class RunningTotal {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int current, total = 0;
		
		System.out.println("Type in a bunch of values and I'll add them up. ");
		System.out.println("I'll stop when you type zero. ");
		current = keyboard.nextInt();
		//converted to while loop, compiled and ran as expected,
		//converted back to do/while loop and kept changes, compiled and ran 
		//as expected.
		do {
			total += current;
			System.out.print("Value: ");
			System.out.println("The total so far is: " + total); // no longer prints this line when loop ends.
			current = keyboard.nextInt();
		} while (current != 0);
		
		System.out.println("The final total is: " + total);
	}
}
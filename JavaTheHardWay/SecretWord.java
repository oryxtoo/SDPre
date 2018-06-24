import java.util.Scanner;

public class SecretWord {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please", guess;
		
		System.out.print("What's the secret word? ");
		guess = keyboard.next();
		//added second secret word and OR - prints "correct" for both.
		if (guess.equals(secret) || guess.equals("chicken")) {
			System.out.println("That's correct!");
		}
		else {
			System.out.println("No, the secret word isn't \"" + guess + "\".");
		}
		if (guess == secret) {
			System.out.println("(This will never ever show, no matter what.)");
		}
	}
}
public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age, classSize;
		double seconds, e, checking, sprintTime;
		String firstName, lastName, title, profession, raisingCanes ;
		
		x = 10;
		y = 400;
		age = 39;
		classSize = 12;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		sprintTime = 10.67;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		profession = "PhD";
		raisingCanes = "chicken.";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "Her 100 yard sprint was " + sprintTime + " seconds.");
		System.out.println( "My name's " + title + " " + firstName + " " + lastName + "," + " " + profession + "." );
		System.out.println("I like " + raisingCanes);
		
	}
}
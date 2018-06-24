public class ThereAndBackAgain {
	public static void main(String [] args) {
		System.out.println("Here.");
		erebor(); // remove parenthesis after erebor; Does not compile, 
				 //error msg: "not a statement".
		System.out.println("Back first time.");
		erebor(); //comment out erebor(); compiles, output: "Here, There, 
				//Back first time, Back second time."
		System.out.println("Back second time.");
	}
	public static void erebor() {
		System.out.println("There.");
	}
}
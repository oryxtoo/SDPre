public class Squares {
	public static void main(String[] args) {
	//Use a scanner to read from standard in
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	int num = 0;
	int result = 0;
	
	System.out.print("Please enter a number: \n\t(less than 46341):");
	num = scanner.nextInt();
	
	if (num < 46341){
		result = num * num;
		System.out.print("The result of squaring " + num);
		System.out.println();
	}
	else {
		System.err.println("Input # " + num + " is too large.");
	}
	scanner.close();
	}
}
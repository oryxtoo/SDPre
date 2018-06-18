import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    double variable1;

    System .out.println("Please enter a number: ");
    variable1 = scanner.nextDouble();

    if (variable1 % 2 == 0) {
      System.out.println("The number is even.");
    }
    else {
      System.out.println("The number is odd.");
    }
  }
}

import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String [] args){
    double variable1, variable2, sum;

    variable1 = 0;
    variable2 = 0;
    sum = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    variable1 = input.nextDouble();
    System.out.println("Please enter another number: ");
    variable2 = input.nextDouble();

    sum = variable1 + variable2;

    System.out.println("The sum of " + variable1 + " and " + variable2 + " = " + sum);

  }
}

import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;
    currentYear = 2018;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    age = input.nextInt();

    birthYear = (currentYear - age);

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}

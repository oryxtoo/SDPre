import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) { // while what is true - doesn't "true"
      // need to be defined? I need to print
      //the menu out after printing the selection.
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if (selection == 1){
        System.out.println("Hello World");
      }
      if (selection == 2){
        System.out.println("Apple, Banana, Coconut");
      }
      if (selection == 3){
        System.out.println("Goodbye");
        break;
      }
    }
    scanner.close();
  }
}

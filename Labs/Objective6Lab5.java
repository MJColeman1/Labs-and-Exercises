import java.util.Scanner;
import static java.lang.System.*;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection;

    while (true) {
      out.println("_____Menu_____");
      out.println("1: Say Hello");
      out.println("2: List My favorite foods");
      out.println("3: Exit");
      out.print("Please enter your selection (1-3): > ");
      selection = keyboard.nextInt();

          if (selection == 1) {
            out.println("\nHello, Human.\n");
          }
          else if (selection == 2) {
            out.println("\nYour favorite foods are Apples, Bananas, and Coconuts.\n");
          }
          else {
            out.println("\nGoodbye.\n");
              break;
          }
        }
      }
  }

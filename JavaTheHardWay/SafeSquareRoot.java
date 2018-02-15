import java.util.Scanner;
import static java.lang.System.*;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String yes, input;

    yes = "YES!";

    out.print("Are you ready?!? > ");
    input = keyboard.next();

    while ( ! yes.equals (input) ) {
        out.print("Sorry, you have to be ready first!\nTry again: ");
        input = keyboard.next();
    }

    out.print("Give me a number, and I'll find its square root. ");
    out.print("(No negatives, please.) > ");
    x = keyboard.nextDouble();

    while(x < 0) {
      out.println("I won't take the square root of a negative.");
      out.print("New number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    out.println("The square root of " + x + " is " + y);
  }
}

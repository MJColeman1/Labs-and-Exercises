import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();
    //The program blows up when I type 43.6 as this is not an integer value.

    System.out.println("Enter a number between 0.0 and 1.0.");
    keyboard.nextDouble();
    //The program blows up when I type a word like 'Hello' as this is not a floating point value.

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();
  }
}

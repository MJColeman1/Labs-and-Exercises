import java.util.Scanner;
public class Objective3Lab5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double firstNumber, secondNumber, sum;

    System.out.println("Please enter a number: ");
    firstNumber = input.nextDouble();

    System.out.println("Please enter another number: ");
    secondNumber = input.nextDouble();

    sum = firstNumber + secondNumber;

    System.out.println("The sum of " + firstNumber + " and " + secondNumber + " = " + sum);

    input.close();
  }
}
